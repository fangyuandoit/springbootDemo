package com.fy.springboot_valication.model;

import com.fy.springboot_valication.annotation.IsPhone;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/15 16:18
 * @Description:
 */
@Data
public class User {

    @NotNull
    private String account;
    @NotNull
    @Length(min = 8)
    private String password;
    @NotNull
    private String nickname;
    @Email
    private String email;
    @IsPhone
    private String phone;
    @Pattern(regexp="\\d{6}")
    private String code;

}
