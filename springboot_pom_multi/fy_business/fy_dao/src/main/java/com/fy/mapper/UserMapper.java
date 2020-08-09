package com.fy.mapper;

import com.fy.model.User;

import java.util.List;

/**
 * @Author: fang
 * @Date: 2020/8/6 23:15
 * @Description:
 */
//@Mapper
//@Component
public interface UserMapper {

    /**
     * 查询user对象
     * @param user
     * @return
     */
    User  getUser(User user);

    List<User> findList();
}
