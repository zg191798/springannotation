package com.atguigu.config;

import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author zhangge
 * @date 2019/1/14 - 11:56
 */
// bean的生命周期: bean创建 -- 初始化---销毁的过程
@ComponentScan("com.atguigu.bean")
@Configuration
public class MainConfigOfLifeCycle {

    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }
}
