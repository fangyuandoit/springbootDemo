package com.fy.springbootmybatismultidatasource.controller;

import java.util.List;
import java.util.Map;

import com.fy.springbootmybatismultidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("UserController")
public class UserController {

	@Autowired
	private UserService studentService;


	@RequestMapping("test")
	public  Object test(){

		System.out.println(studentService.getAllStudentsFromH2());
		System.out.println(studentService.getAllStudentsFromMysql());
		return "ok";
	}

	@RequestMapping("h2")
	public List<Map<String, Object>> queryStudentsFromH2(){
		return this.studentService.getAllStudentsFromH2();
	}

	@RequestMapping("mysql")
	public List<Map<String, Object>> queryStudentsFromMysql(){
		return this.studentService.getAllStudentsFromMysql();
	}
}
