package com.fy.springboot_shiro;

import com.fy.springboot_shiro.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootShiroApplicationTests {

    @Autowired
    private UserDao userDao;


    @Test
    public void selectAllUser(){
        System.out.println(userDao.selectAllUser());

    }


}
