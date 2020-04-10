package com.fy.springboot_mybatis_pagehelper;

import com.fy.springboot_mybatis_pagehelper.entity.User;
import com.fy.springboot_mybatis_pagehelper.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootMybatisPagehelperApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
   public  void contextLoads() {

        PageHelper.startPage(1, 5);
        List<User> all = userMapper.findAll();
        all.forEach(s -> System.out.println(s));

        System.out.println("---------------");
        PageHelper.startPage(2,5);
        all = userMapper.findAll();
all.forEach(System.out::println);
    }

}
