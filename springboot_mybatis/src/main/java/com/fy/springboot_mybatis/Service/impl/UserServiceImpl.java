package com.fy.springboot_mybatis.Service.impl;

import com.fy.springboot_mybatis.Service.UserService;
import com.fy.springboot_mybatis.dao.UserDao;
import com.fy.springboot_mybatis.pojo.dbo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/11/26 15:36
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }
}
