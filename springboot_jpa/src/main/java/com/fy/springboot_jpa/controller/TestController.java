package com.fy.springboot_jpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/23 14:38
 * @Description:
 */
@RestController
@RequestMapping("TestController")
public class TestController {

    static int count=0;

    @RequestMapping("test1")
    public Object test1(){

        System.out.println(count++);
        return "ok";
    }


}
