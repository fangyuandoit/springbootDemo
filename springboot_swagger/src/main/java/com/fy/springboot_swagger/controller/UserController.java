package com.fy.springboot_swagger.controller;

import com.fy.springboot_swagger.entity.User;
import com.google.common.base.Supplier;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/3 13:57
 * @Description:
 */
@Api(description ="用户管理模块")
@RestController
@RequestMapping("UserController")
public class UserController {


    @ApiOperation(value = "添加user", notes = "添加user,需要提交user对象的参数")
    @RequestMapping(value = "addOneUser",method = RequestMethod.POST)
    public  Object addOneUser(User user){
        System.out.println("user--" + user);
        return "ok";
    }

    @RequestMapping(value = "deleteUser",method = RequestMethod.POST)
    @ApiOperation(value = "删除用户",notes = "根据用户id删除用户")
    public Object  deleteUser(Integer id){
        Assert.notNull(id,"id 参数不可为 null");
        System.out.println(id);
        return "ok";
    }


}
