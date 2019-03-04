package com.hello01springboot.demo.boot02处理请求.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fang
 * @Date: 2019/3/4 22:53
 * @Description:
 */
@RestController
@RequestMapping("/boot02ajax")
public class HelloWorldAjaxController {

    @RequestMapping("/hello")
    public String say(){
        return "{'message1':'SpringBoot大爷你好','message2','Spring大爷你好2'}";
    }

}
