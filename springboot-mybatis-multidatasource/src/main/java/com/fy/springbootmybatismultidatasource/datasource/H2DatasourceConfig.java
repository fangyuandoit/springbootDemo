package com.fy.springbootmybatismultidatasource.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/3 17:19
 * @Description:
 */
@Configuration
@MapperScan(basePackages = H2DatasourceConfig.PACKAGE,
        sqlSessionFactoryRef = "dbH2SqlSessionFactory")
public class H2DatasourceConfig {

    // h2 dao扫描路径
    static final String PACKAGE = "com.fy.springbootmybatismultidatasource.h2dao";
    // mybatis mapper扫描路径
    static final String MAPPER_LOCATION = "classpath:mapper/h2/*.xml";


    @Bean(name = "h2datasource")
    @ConfigurationProperties("spring.datasource.hikari.h2")
    public DataSource oracleDataSource() {
        return new HikariDataSource();
//        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "h2TransactionManager")
    public DataSourceTransactionManager oracleTransactionManager() {
        return new DataSourceTransactionManager(oracleDataSource());
    }

    @Bean(name = "dbH2SqlSessionFactory")
    public SqlSessionFactory oracleSqlSessionFactory(@Qualifier("h2datasource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //如果不使用xml的方式配置mapper，则可以省去下面这行mapper location的配置。
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(H2DatasourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }


}
