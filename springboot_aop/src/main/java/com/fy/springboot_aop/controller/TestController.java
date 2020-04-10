package com.fy.springboot_aop.controller;

import com.fy.springboot_aop.config.MyLogAnno;
import com.fy.springboot_aop.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/16 16:29
 * @Description:
 */
@RequestMapping("TestController")
@RestController
public class TestController {


    @RequestMapping("createUser")
    public String createUser(User user) {
        Random random = new Random();
        System.out.println(user);
        int anInt = random.nextInt(5);
        try {
            Thread.sleep(anInt * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "创建成功";
    }


    @MyLogAnno
    @RequestMapping("createUserWithLog")
    public String createUserWithLog(User user) {
        Random random = new Random();
        System.out.println(user);
        int anInt = random.nextInt(5);
        try {
            Thread.sleep(anInt * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "创建成功";
    }


    @RequestMapping("createException")
    public String createException(){
        int a =1/0;
        return "ok";
    }

}
