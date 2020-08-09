package com.fy.service;

import com.fy.model.User;

import java.util.List;

/**
 * @Author: fang
 * @Date: 2020/8/6 23:26
 * @Description:
 */

public interface UserService {
    User getUser(User user);

    List<User> findList();
}
