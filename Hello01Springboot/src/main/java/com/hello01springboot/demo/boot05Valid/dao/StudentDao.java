package com.hello01springboot.demo.boot05Valid.dao;

import com.hello01springboot.demo.boot05Valid.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: fang
 * @Date: 2019/3/8 22:38
 * @Description:
 */
public interface StudentDao extends JpaRepository<Student,Integer> {
}
