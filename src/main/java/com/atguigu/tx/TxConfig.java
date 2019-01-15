package com.atguigu.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author zhangge
 * @date 2019/1/14 - 20:35
 */
@EnableTransactionManagement
@ComponentScan("com.atguigu.tx")
@Configuration
public class TxConfig {

    // 数据源
    @Bean
    public DataSource dataSource() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/clouddb01");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws Exception {
        // 给容器中加组件的方法,多次调用都只是从容器中找组件
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }

    // 注册事务管理器到容器中
    @Bean
    public PlatformTransactionManager transactionManager() throws Exception {
        return new DataSourceTransactionManager(dataSource());
    }
}
