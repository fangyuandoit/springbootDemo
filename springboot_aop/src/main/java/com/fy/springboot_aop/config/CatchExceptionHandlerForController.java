package com.fy.springboot_aop.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/16 15:55
 * @Description:  捕获controller层抛出的异常
 */
@ControllerAdvice(annotations=RestController.class)
@ResponseBody
public class CatchExceptionHandlerForController {


    @ExceptionHandler
    @ResponseStatus
    public Object exceptionHandler(Exception e) {
        e.printStackTrace();
        Map<String,Object> map =new HashMap<>();
        map.put("code",200);
        map.put("success",false);
        map.put("info","操作失败");
        map.put("devinfo",e.getMessage());
        ObjectMapper mapper =new ObjectMapper();
        String result ="";
        try {
            result  =  mapper.writeValueAsString(map);
        } catch (JsonProcessingException e1) {
            e1.printStackTrace();
        }
        return result;
    }


}
