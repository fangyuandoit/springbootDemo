package com.fy.springboot_mybatis_pagehelper;

import com.fy.springboot_mybatis_pagehelper.entity.User;
import com.fy.springboot_mybatis_pagehelper.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.soap.SOAPBinding;
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

        PageInfo<User> pageInfo =new PageInfo<>(all);
        System.out.println(pageInfo);

    }

}
