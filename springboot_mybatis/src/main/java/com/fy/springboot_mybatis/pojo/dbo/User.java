package com.fy.springboot_mybatis.pojo.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/11/26 15:35
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userName;
    private String passWord;

}
