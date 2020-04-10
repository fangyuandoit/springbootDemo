package com.fy.springboot_swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/3 11:55
 * @Description:
 */
@RestController
@RequestMapping("TestController")
@Api(description = "测试模块")
public class TestController {


    @ApiOperation(value = "测试即可", notes = "返回当前系统时间")
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public Object test(){
        return new Date().toLocaleString();
    }

}
