package com.fy.springboot_groovy.dao;

import com.fy.springboot_groovy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: fang
 * @Date: 2020/6/10 22:02
 * @Description:
 */
@Mapper
public interface UserDao {

    @Select("select * from user")
    List<User>  findAllUser();

}
