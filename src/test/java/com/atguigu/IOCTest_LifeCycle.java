package com.atguigu;

import com.atguigu.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author zhangge
 * @date 2019/1/14 - 12:00
 */
public class IOCTest_LifeCycle {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

    @Test
    public void test01(){
        System.out.println("容器创建完成...");
        Object bean = applicationContext.getBean("car");
        applicationContext.close();
    }
}
