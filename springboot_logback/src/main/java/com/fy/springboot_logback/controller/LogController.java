package com.fy.springboot_logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/2/26 10:01
 * @Description:
 */
@RequestMapping("LogController")
@RestController
@Slf4j
public class LogController {

    @RequestMapping("t1")
    public void t1(){

        log.info("hello");

    }

}
