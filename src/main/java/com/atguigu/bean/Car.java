package com.atguigu.bean;

import org.springframework.stereotype.Component;

/**
 * @author zhangge
 * @date 2019/1/14 - 11:57
 */
@Component
public class Car {

    public Car() {
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car init...");
    }

    public void destory(){
        System.out.println("car destory...");
    }
}
