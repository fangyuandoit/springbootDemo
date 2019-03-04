package com.hello01springboot.demo.boot02处理请求.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: fang
 * @Date: 2019/3/4 22:56
 * @Description:
 */
@Controller
@RequestMapping("/boot02blog")
public class BlogController {

    @RequestMapping("/{id}")
    public ModelAndView show(@PathVariable("id") Integer id){
        ModelAndView mav=new ModelAndView();
        mav.addObject("id", id);
        mav.setViewName("boot02blog");
        return mav;
    }

    @RequestMapping("/query")
    public ModelAndView query(@RequestParam(value="q",required=false)String q){
        ModelAndView mav=new ModelAndView();
        mav.addObject("q", q);
        mav.setViewName("boot02query");
        return mav;
    }

}
