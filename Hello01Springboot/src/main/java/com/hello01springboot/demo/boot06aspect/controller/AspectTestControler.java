package com.hello01springboot.demo.boot06aspect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author: fang
 * @Date: 2019/3/9 23:14
 * @Description:
 */
@Controller
@RequestMapping("/AspectTestControler")
public class AspectTestControler {

    @RequestMapping("/time")
    @ResponseBody
    public String time(){
        return new Date().toLocaleString();
    }



}
