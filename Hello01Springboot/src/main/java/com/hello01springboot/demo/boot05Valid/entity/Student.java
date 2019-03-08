package com.hello01springboot.demo.boot05Valid.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @Author: fang
 * @Date: 2019/2/27 22:27
 * @Description:  student类，用于演示表单验证
 */

@Entity
@Table(name = "t_student")
@Data
public class Student {

    @Id
    @GeneratedValue
    private Integer id;


    @NotEmpty(message = "名字不能为空")
    @Column(length = 50)
    private String name;

    @NotNull(message = "年龄不能为空")  //NotEmpty 1可用于验证字符串，不能用于验证整形的。整形用NotNull  2 如果是整形 最好用integer，如果是int 可能会遇到错误
    @Min(value = 18,message = "年龄必须大于18岁")
    private Integer age;

}
