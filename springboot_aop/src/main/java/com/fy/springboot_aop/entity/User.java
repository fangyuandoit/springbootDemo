package com.fy.springboot_aop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/16 16:41
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private String password;

}
