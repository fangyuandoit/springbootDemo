package com.fy.springboot_aop.config;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Author:
 * @Date: 2019/11/13 09:55
 * @Description:
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyLogAnno {
}
