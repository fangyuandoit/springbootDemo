package com.fy.springboot_shiro.controller;

import com.fy.springboot_shiro.dao.UserDao;
import com.fy.springboot_shiro.entiry.User;
import com.fy.springboot_shiro.utils.ResultUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/5 14:14
 * @Description:
 */
@RestController
@RequestMapping("UserController")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("userLogin")
    public Object userLogin(User user) {
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.getSession().setTimeout(60 * 30 * 1000L);
            UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(), user.getPassword());
            subject.login(token);
            return ResultUtils.success("", "登录成功");
        } catch (UnknownAccountException | IncorrectCredentialsException e) {
            e.printStackTrace();
            return ResultUtils.fail("", e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.fail("", "登录失败");
        }
    }

    @RequestMapping(value = "selectCurrUserInfo")
    public Object  selectCurrUserInfo(){
        Subject subject = SecurityUtils.getSubject();
        User currUser = (User) subject.getPrincipal();
        return currUser;
    }


    @RequestMapping("selectAllUser")
    @RequiresRoles("manager")
    public Object selectAllUser(){
      return    userDao.selectAllUser();
    }


    @RequestMapping("deleteUser")
    @RequiresPermissions("token:delete")
    public Object deleteUser(){
        return "ok";
    }

}
