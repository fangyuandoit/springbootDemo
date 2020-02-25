package com.fy.springboot_mybatisplus2.entity;

import lombok.Data;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/2/25 09:27
 * @Description:
 */
@Data
public class User {

    private int user_id;
    private String  user_name;
    private String pass_word;

}
