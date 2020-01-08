package com.fy.springboot_groovy.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/8 16:26
 * @Description:
 */
@RestController
@RequestMapping("GroovyController")
class GroovyController {

    @RequestMapping("test")
     Object test(){
     return new Date().toLocaleString();
    }

}
