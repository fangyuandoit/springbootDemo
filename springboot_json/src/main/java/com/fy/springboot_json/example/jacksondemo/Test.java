package com.fy.springboot_json.example.jacksondemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fy.springboot_json.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/13 14:29
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws Exception {
//        T1();
//           T2();
              T3();
    }

    private static void T3() {



    }

    private static void T2() throws Exception{
         String s ="{\"id\":1,\"name\":\"露露\",\"address\":\"new york\",\"gender\":\"woman\"}";

        ObjectMapper mapper = new ObjectMapper();
        Map  map = mapper.readValue(s, Map.class);
        System.out.println(map.get("id"));
        System.out.println(map.get("address"));


    }


    public static  void  T1() throws Exception{
        User user =new User(1,"露露","new york","woman");

        ObjectMapper mapper = new ObjectMapper();

        //对象转化为Json
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

        //Json映射为对象
       User user1= mapper.readValue(json,User.class);
        System.out.println(user1);


    }

}
