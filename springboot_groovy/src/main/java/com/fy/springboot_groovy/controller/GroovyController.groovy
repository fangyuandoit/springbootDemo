package com.fy.springboot_groovy.controller

import com.fy.springboot_groovy.dao.UserDao
import com.fy.springboot_groovy.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/8 16:26
 * @Description:
 */
@RestController
@RequestMapping("GroovyController")
class GroovyController {

    @Autowired
    private  UserDao userDao

    @RequestMapping("test")
     Object test(){
     return new Date().toLocaleString()
    }

    @RequestMapping("findAllUser")
     ResponseEntity<Object> findAllUser(){
         print("userdao-----------"+userDao)
        def user = userDao.findAllUser()
        return new ResponseEntity<Object>(user, HttpStatus.OK);

    }

}
