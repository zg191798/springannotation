package com.atguigu;

import com.atguigu.tx.TxConfig;
import com.atguigu.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangge
 * @date 2019/1/14 - 20:47
 */
public class IOCTest_Tx {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

    @Test
    public void test01(){
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
        applicationContext.close();
    }
}
