package com.fy.springboot_logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/27 11:19
 * @Description:
 */
@RequestMapping("TestController")
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("Test")
    public Object Test() {

        for (int i = 0; i < 10; i++) {


            logger.debug("this is debug"+new Date().clone());
            logger.info("this is info"+new Date().clone());
            logger.warn("this is warn"+new Date().clone());
            logger.error("this is error"+new Date().clone());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        return "ok";
    }


}
