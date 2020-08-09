package com.fy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: fang
 * @Date: 2020/8/6 23:14
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  implements Serializable {

    private String username;
    private String password;

}
