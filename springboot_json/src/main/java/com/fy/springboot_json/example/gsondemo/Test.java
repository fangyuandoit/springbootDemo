package com.fy.springboot_json.example.gsondemo;

import com.fy.springboot_json.entity.User;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/13 16:19
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws Exception {

//        t1();
//          t2();
        t3();

    }

    private static void t3() {
        String s = "{\"id\":1,\"name\":\"露露\",\"address\":\"new york\",\"gender\":\"woman\"}";
        Gson gson = new Gson();
        User user = gson.fromJson(s, User.class);
        System.out.println(user);

    }

    private static void t2() {
        Gson gson = new Gson();
        User user = new User(1, "露露", "new york", "woman");
        String s = gson.toJson(user);
        System.out.println(s);

    }

    private static void t1() throws Exception {

        Gson gson = new Gson();
        int i = gson.fromJson("100", int.class); //100
        double d = gson.fromJson("\"99.99\"", double.class);  //99.99
        boolean b = gson.fromJson("true", boolean.class);     // true
        String str = gson.fromJson("String", String.class);   // String


        String jsonNumber = gson.toJson(100);       // 100
        String jsonBoolean = gson.toJson(false);    // false
        String jsonString = gson.toJson("String"); //"String"


    }

}
