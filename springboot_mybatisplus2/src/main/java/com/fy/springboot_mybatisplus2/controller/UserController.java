package com.fy.springboot_mybatisplus2.controller;

import com.fy.springboot_mybatisplus2.entity.User;
import com.fy.springboot_mybatisplus2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/2/25 09:40
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("selectAll")
    public void selectAll(){

        List<User> users = userMapper.selectList(null);
        System.out.println(users);


    }

}
