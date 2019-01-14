package com.atguigu;

import com.atguigu.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author zhangge
 * @date 2019/1/14 - 17:06
 */
public class IOCTest_profile {

    @Test
    public  void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test","dev");
        // 注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        // 启动刷新容器
        applicationContext.refresh();
        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        applicationContext.close();
    }
}
