package com.fy.springboot_shiro.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/11/4 14:31
 * @Description:  数据返回封装类
 */
public class ResultUtils {




    public static JSONObject success(Object data,String info){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("info",info);
        jsonObject.put("data",data);
        jsonObject.put("code",200);
        return jsonObject;
    }

    public static JSONObject fail(Object data,String info){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",false);
        jsonObject.put("info",info);
        jsonObject.put("data",data);
        jsonObject.put("code",200);
        return jsonObject;
    }
    public static JSONObject result(boolean flag,Object data,String info){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",flag);
        jsonObject.put("info",info);
        jsonObject.put("data",data);
        jsonObject.put("code",200);
        return jsonObject;
    }

}
