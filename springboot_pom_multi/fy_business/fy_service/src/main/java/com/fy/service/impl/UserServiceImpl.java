package com.fy.service.impl;

import com.fy.mapper.UserMapper;
import com.fy.model.User;
import com.fy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: fang
 * @Date: 2020/8/6 23:27
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;


    @Override
    public User getUser(User user) {
        return userDao.getUser(user);
    }

    @Override
    public List<User> findList() {
        return userDao.findList();
    }
}
