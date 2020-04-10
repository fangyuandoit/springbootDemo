package com.fy.springboot_valication.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/15 17:06
 * @Description:
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsPhoneValidator.class)
public @interface IsPhone {

    boolean required() default  true;

    String message() default "手机号码格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
