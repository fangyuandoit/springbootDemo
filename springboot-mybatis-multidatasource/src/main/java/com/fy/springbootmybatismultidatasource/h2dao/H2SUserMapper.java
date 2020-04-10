package com.fy.springbootmybatismultidatasource.h2dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface H2SUserMapper {
	List<Map<String, Object>> getAllUser();
}
