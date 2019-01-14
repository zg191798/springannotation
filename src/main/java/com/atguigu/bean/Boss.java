package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author zhangge
 * @date 2019/1/14 - 16:07
 */
@Component
public class Boss {

    private Car car;

    @Autowired
    public Boss(Car car) {
        System.out.println("有参构造器");
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    // 标注在方法,spring容器创建当前对象,就会调用方法,完成赋值
    // 方法使用的参数,自定义类型的值从ioc容器中获取
    //@Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
