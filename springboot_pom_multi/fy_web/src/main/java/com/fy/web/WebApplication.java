package com.fy.web;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@SpringBootApplication
@SpringBootApplication(scanBasePackages= {"com.fy"})
@MapperScan(basePackages= {"com.fy.mapper"})
@EnableTransactionManagement
@EnableAspectJAutoProxy
@Slf4j
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
