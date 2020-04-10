package com.fy.springboot_mybatis_pagehelper.mapper;

import com.fy.springboot_mybatis_pagehelper.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: fang
 * @Date: 2020/4/9 22:28
 * @Description:
 */
@Mapper
@Component
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

}
