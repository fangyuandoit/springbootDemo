package com.fy.springbootmybatismultidatasource.mysqldao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MysqlUserMapper {
	List<Map<String, Object>> getAllUser();
}
