package com.fy.springboot_mybatisplus2;

import com.fy.springboot_mybatisplus2.entity.User;
import com.fy.springboot_mybatisplus2.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisplus2ApplicationTests {


    @Autowired
    private UserMapper userMapper;


    @Test
    public  void t1(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);

    }





}
