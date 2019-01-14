package com.atguigu;

import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.config.MainConfigOfAutowired;
import com.atguigu.config.MainConfigOfPropertyValue;
import com.atguigu.dao.BookDao;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangge
 * @date 2019/1/14 - 15:32
 */
public class IOCTest_Autowired {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void test01(){
        BookService bookService = applicationContext.getBean(BookService.class);
        bookService.print();
        System.out.println(bookService);
       /* BookDao bookDao = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao);*/

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);
        applicationContext.close();
    }
}
