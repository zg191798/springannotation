package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhangge
 * @date 2019/1/14 - 12:20
 */
@Component
public class Dog implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    public Dog() {
        System.out.println("dog constructor...");
    }

    @PostConstruct
    public void postCon(){
        System.out.println("对象创建并赋值之后调用");
    }

    @PreDestroy
    public void preDes(){
        System.out.println("容器移除对象之前");
    }

    // IOC容器可以传入
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
