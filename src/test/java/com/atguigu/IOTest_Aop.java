package com.atguigu;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigOfAop;
import com.atguigu.config.MainConfigOfAutowired;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangge
 * @date 2019/1/14 - 17:42
 */
public class IOTest_Aop {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAop.class);

    @Test
    public void test01(){
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1,1);
        applicationContext.close();
    }
}
