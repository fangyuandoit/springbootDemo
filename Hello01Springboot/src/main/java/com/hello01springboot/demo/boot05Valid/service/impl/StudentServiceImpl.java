package com.hello01springboot.demo.boot05Valid.service.impl;

import com.hello01springboot.demo.boot05Valid.dao.StudentDao;
import com.hello01springboot.demo.boot05Valid.entity.Student;
import com.hello01springboot.demo.boot05Valid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: fang
 * @Date: 2019/3/8 22:39
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void add(Student student) {
        studentDao.save(student);
    }
}
