package com.fy.springboot_mybatis;

import com.fy.springboot_mybatis.Service.UserService;
import com.fy.springboot_mybatis.pojo.dbo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {


    Logger logger=LoggerFactory.getLogger(this.getClass());


    @Autowired
    private UserService userService;


    @Test
    public void selectAllUserTest(){
        logger.info("start select");
        List<User> users = userService.selectAllUser();
        users.forEach(System.out::println);
        logger.info("end select");

    }




}
