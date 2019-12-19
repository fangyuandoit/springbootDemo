package com.fy.springboot_jpa.controller;

import com.fy.springboot_jpa.model.entity.Log;
import com.fy.springboot_jpa.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/18 14:12
 * @Description:
 */
@RestController
@RequestMapping("LogController")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("test")
    public  Object test(){

        long count = logService.count();
        System.out.println(count);


        return count;
    }

    @RequestMapping("create")
    public Object create(){
        Log log =new Log();
        log.setIpAddress("127.0.0.1");
        log.setContent(System.currentTimeMillis()+"");
        return  logService.create(log);
    }


    @RequestMapping("createInBatch")
    public Object createInBatch(){
        ArrayList<Log> collections =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Log log =new Log();
            log.setIpAddress("127.0.0.1");
            log.setContent(UUID.randomUUID().toString());
            collections.add(log);
        }
        logService.createInBatch(collections);
        return "ok";
    }



}
