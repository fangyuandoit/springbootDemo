package com.fy.springboot_mybatis.Service;

import com.fy.springboot_mybatis.pojo.dbo.User;

import java.util.List;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/11/26 15:36
 * @Description:
 */
public interface UserService {

    List<User> selectAllUser();
}
