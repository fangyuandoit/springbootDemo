package com.fy.web.controller;

import com.fy.model.User;
import com.fy.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2020/8/6 22:52
 * @Description:
 */
@RestController
@RequestMapping("UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public ResponseEntity<Object> test(){
        return new ResponseEntity<Object>(new Date().toLocaleString(), HttpStatus.OK);
    }



    @RequestMapping("findList")
    public ResponseEntity<Object> findList(){
        List<User> list =  userService.findList();
        return new ResponseEntity<Object>( list,HttpStatus.OK);
    }


    @RequestMapping("login")
    public ResponseEntity<Object> login(User user){
      User loginUser =  userService.getUser(user);
      if(loginUser != null){
          return new ResponseEntity<Object>(loginUser, HttpStatus.OK);
      }else{
          return new ResponseEntity<Object>("登录失败", HttpStatus.BAD_REQUEST);
      }
    }



}
