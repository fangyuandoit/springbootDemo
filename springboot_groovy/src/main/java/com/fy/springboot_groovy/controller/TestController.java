package com.fy.springboot_groovy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Date: 2020/1/8 16:21
 * @Description:
 */
@RestController
@RequestMapping("TestController")
public class TestController {

    @RequestMapping("test")
    public Object test(){
        return new Date().toLocaleString();
    }

}
