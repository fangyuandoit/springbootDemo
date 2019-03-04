package com.hello01springboot.demo.boot01配置文件属性.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: fang
 * @Date: 2019/3/4 22:39
 * @Description: 自己定义的mysql配置信息
 */
@Component
@ConfigurationProperties(prefix="fymysql")
@Data
public class fyMysqlProperties {

    private String jdbcName;

    private String dbUrl;

    private String userName;

    private String password;

}
