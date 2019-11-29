//package com.fy.springboot_mybatisplus;
//
//import com.fy.springboot_mybatisplus.entity.User;
//import com.fy.springboot_mybatisplus.service.IUserService;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringbootMybatisplusApplicationTests {
//
//
//    @Autowired
//    private IUserService iUserService;
//
//
//    @Test
//    public void test(){
//
//        User user =new User();
//        user.setUserName("方");
//        user.setPassWord("y");
//        boolean insert = iUserService.insert(user);
//        Assert.assertEquals(true,insert);
//
//
//        System.out.println(iUserService.selectById(2));
//
//
//        List<User> users = iUserService.selectList(null);
//        users.forEach(s -> System.out.println(s));
//
//
//    }
//
//
//}
