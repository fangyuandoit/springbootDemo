package com.fy.springboot_valication.utils;

import java.util.regex.Pattern;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/15 17:28
 * @Description:
 */
public class ValidatorUtils {

    private final  static  String IS_PHONE_REGULAR  = "1\\d{10}";


    public static boolean isPhone(String phoneNumber){
        return Pattern.matches(IS_PHONE_REGULAR, phoneNumber);
    }


    public static void main(String[] args) {



    }

}
