package com.fy.springboot_shiro.dao;

import com.fy.springboot_shiro.entiry.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/11/29 16:17
 * @Description:
 */
@Mapper
@Component
public interface UserDao {


    List<User>  selectAllUser();


    User  selectUserByAccount(String account);


    /**
     * 用于shiro 验证角色
     * @param user
     * @return
     */
    Set<String> selectRoleByAccount(User user);


    /**
     * 用于shiro 验证权限
     * @param user
     * @return
     */
    Set<String> selectPermissionByAccount(User user);






}
