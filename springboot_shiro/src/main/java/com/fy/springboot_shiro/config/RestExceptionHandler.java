package com.fy.springboot_shiro.config;

import com.fy.springboot_shiro.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/11 11:11
 * @Description:
 */
@ControllerAdvice(annotations=RestController.class)
@ResponseBody
public class RestExceptionHandler {


    @ExceptionHandler
//  @ExceptionHandler(value= {NumberFormatException.class}),只会在发生NumberFormatException时起作用
    @ResponseStatus
    public Object exceptionHandler(Exception e) {
        return ResultUtils.fail("","操作失败--"+e.getMessage());
    }

}
