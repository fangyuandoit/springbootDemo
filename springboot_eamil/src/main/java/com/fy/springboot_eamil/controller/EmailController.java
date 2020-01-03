package com.fy.springboot_eamil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/3 15:43
 * @Description:
 */
@RestController
@RequestMapping("EmailController")
public class EmailController {

    @Autowired
    private JavaMailSender jms;

    @Value("${spring.mail.username}")
    private String from;



    @RequestMapping("test")
    public Object test(){
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo("xxx@qq.com"); // 接收地址
            message.setSubject("仔"); // 标题
            message.setText("收的到吗"); // 内容
            jms.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }


    }

}
