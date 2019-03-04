package com.hello01springboot.demo.boot01配置文件属性.controller;

import com.hello01springboot.demo.boot01配置文件属性.properties.fyMysqlProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: fang
 * @Date: 2019/3/4 22:29
 * @Description:  加载自己的配置文件信息
 */
@Controller
@RequestMapping("/boot01")
public class HelloWorldController {

    //只能加载一个字段
    @Value("${helloWorld}")
    private String helloWorld;

    //加载一个对象出来，这个对象包含多个属性
    @Resource
    private fyMysqlProperties mysqlProperties;


    @RequestMapping("/helloWorld")
    @ResponseBody
    public String say(){
        return helloWorld;
    }

    @RequestMapping("/showJdbc")
    @ResponseBody
    public String showJdbc(){
        return "mysql.jdbcName:"+mysqlProperties.getJdbcName()+"<br/>"
                +"mysql.dbUrl:"+mysqlProperties.getDbUrl()+"<br/>"
                +"mysql.userName:"+mysqlProperties.getUserName()+"<br/>"
                +"mysql.password:"+mysqlProperties.getPassword()+"<br/>";
    }


}
