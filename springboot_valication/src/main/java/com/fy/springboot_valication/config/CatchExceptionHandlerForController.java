package com.fy.springboot_valication.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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

        if(e instanceof BindException){
            BindException ex = (BindException) e;
            String defaultMessage = ex.getAllErrors().get(0).getDefaultMessage();
            Map<String,Object> map =new HashMap<>();
            map.put("code",200);
            map.put("success",false);
            map.put("info",defaultMessage);
            return map;
        }


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
