package com.fy.springboot_valication.controller;

import com.fy.springboot_valication.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/15 16:17
 * @Description:
 */
@RestController
@RequestMapping("UserController")
public class UserController {

    @RequestMapping("addUser")
    public Object addUser(@Valid  User user){

        System.out.println(user);
        return "ok";
    }

}
