package com.fy.springbootmybatismultidatasource;

import com.fy.springbootmybatismultidatasource.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisMultidatasourceApplicationTests {


    @Autowired
    private UserService studentService;


    @Test
    public void contextLoads() {

        List<Map<String, Object>> list = studentService.getAllStudentsFromH2();
//        List<Map<String, Object>> list = studentService.getAllStudentsFromMysql();
        System.out.println(list);

    }

}
