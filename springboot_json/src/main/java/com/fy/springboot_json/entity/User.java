package com.fy.springboot_json.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/13 14:21
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String address;
    private String gender;

}
