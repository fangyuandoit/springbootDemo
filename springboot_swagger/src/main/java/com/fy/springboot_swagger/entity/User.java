package com.fy.springboot_swagger.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/3 13:47
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "用户姓名")
    private String name;
    @ApiModelProperty(value = "用户账号")
    private String account;
    @ApiModelProperty(value = "用户密码")
    private String password;

}
