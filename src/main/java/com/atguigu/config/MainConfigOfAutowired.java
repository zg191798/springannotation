package com.atguigu.config;

import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author zhangge
 * @date 2019/1/14 - 15:29
 * @Autowired:自动注入
 * 1.默认有限按照类型去容器中找:applicationContext.getBean(BookDao.class)
 * 2.如果有多个相同类型的组件,再将属性的名称作为组件的id去容器中查找applicationContext.getBean("bookDao")
 * 3.@Qualifier("bookDao"):是公用@Qualifier指定需要装配的组件的id,而不是使用属性名
 * 4.默认一定要将属性值赋值好
 */
@ComponentScan({"com.atguigu.dao","com.atguigu.service","com.atguigu.controller","com.atguigu.bean"})
@Component
public class MainConfigOfAutowired {

    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }

    // @Bean标注的方法创建对象的时候,方法参数的值从容器中获取
    @Bean
    public Color color(Car car){
        System.out.println("参数值:"+car);
        return new Color();
    }
}
