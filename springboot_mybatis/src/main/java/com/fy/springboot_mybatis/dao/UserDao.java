package com.fy.springboot_mybatis.dao;

import com.fy.springboot_mybatis.pojo.dbo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/11/26 15:36
 * @Description:
 */
@Mapper
@Component
public interface UserDao {

    List<User> selectAllUser();

}
