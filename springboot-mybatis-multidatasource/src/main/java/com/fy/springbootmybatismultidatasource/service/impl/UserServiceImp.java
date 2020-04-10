package com.fy.springbootmybatismultidatasource.service.impl;

import java.util.List;
import java.util.Map;

import com.fy.springbootmybatismultidatasource.h2dao.H2SUserMapper;
import com.fy.springbootmybatismultidatasource.mysqldao.MysqlUserMapper;
import com.fy.springbootmybatismultidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("studentService")
public class UserServiceImp implements UserService {
	@Autowired
	private H2SUserMapper h2SUserMapper;
	@Autowired
	private MysqlUserMapper mysqlUserMapper;
	
	@Override
	public List<Map<String, Object>> getAllStudentsFromH2() {
		return this.h2SUserMapper.getAllUser();
	}

	@Override
	public List<Map<String, Object>> getAllStudentsFromMysql() {
		return this.mysqlUserMapper.getAllUser();
	}

}
