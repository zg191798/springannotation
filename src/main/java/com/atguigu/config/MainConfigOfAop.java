package com.atguigu.config;

import com.atguigu.aop.LogAspects;
import com.atguigu.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhangge
 * @date 2019/1/14 - 17:26
 */
@EnableAspectJAutoProxy // 启用aspectJ自动代理
@Configuration
public class MainConfigOfAop {

    @Bean
    public MathCalculator calculator(){
        return new MathCalculator();
    }

    // 切面类加入容器
    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
