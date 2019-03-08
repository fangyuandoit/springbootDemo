package com.hello01springboot.demo.boot05Valid.controller;

import com.hello01springboot.demo.boot05Valid.entity.Student;
import com.hello01springboot.demo.boot05Valid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @Author: fang
 * @Date: 2019/3/8 22:41
 * @Description:
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //进行表单验证，绑定bindingResult错误返回结果
    //添加学生信息
    @RequestMapping("/add")
    @ResponseBody
    public String add(@Valid Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
          return   bindingResult.getFieldError().getDefaultMessage();
        }else{
            studentService.add(student);
            return "add success";
        }

    }



}
