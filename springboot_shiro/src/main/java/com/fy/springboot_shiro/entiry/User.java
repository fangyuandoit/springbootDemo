package com.fy.springboot_shiro.entiry;

import lombok.Data;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/11/29 16:16
 * @Description:
 */
@Data
public class User {

    private int id;
    private String account;
    private String password;
    private int roleId;

}
