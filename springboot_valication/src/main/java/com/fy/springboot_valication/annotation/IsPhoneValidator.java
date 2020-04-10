package com.fy.springboot_valication.annotation;

import com.fy.springboot_valication.utils.ValidatorUtils;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2020/1/15 17:12
 * @Description:
 */
public class IsPhoneValidator  implements ConstraintValidator<IsPhone,String> {
    private boolean required=false;

    @Override
    public void initialize(IsPhone constraintAnnotation) {
         required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(required){
            return ValidatorUtils.isPhone(s);
        }else{
            if(StringUtils.isEmpty(s)){
                return true;
            }else{
              return ValidatorUtils.isPhone(s);
            }
        }
    }
}
