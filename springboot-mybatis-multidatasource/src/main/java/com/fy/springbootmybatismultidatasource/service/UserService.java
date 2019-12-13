package com.fy.springbootmybatismultidatasource.service;

import java.util.List;
import java.util.Map;

public interface UserService {
	List<Map<String, Object>> getAllStudentsFromH2();
	List<Map<String, Object>> getAllStudentsFromMysql();
}
