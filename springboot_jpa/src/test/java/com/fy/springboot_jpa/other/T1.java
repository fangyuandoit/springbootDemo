package com.fy.springboot_jpa.other;

import com.fy.springboot_jpa.model.entity.Log;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/19 10:20
 * @Description:
 */
public class T1 {

    public static void main(String[] args) {

        RestTemplate restTemplate =new RestTemplate();
//        Object forObject = restTemplate.getForObject("http://localhost:8080/springboot_demo/LogController/test", Object.class);
//        System.out.println(forObject);

        Log forObject = restTemplate.getForObject("http://localhost:8080/springboot_demo/LogController/create", Log.class);
        System.out.println(forObject);


    }

}
