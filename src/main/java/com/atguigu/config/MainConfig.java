package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.dao.BookDao;
import com.atguigu.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author zhangge
 * @date 2019/1/13 - 9:28
 */
// 配置类==配置文件,配置类
@Configuration
@ComponentScans(value = {
        @ComponentScan(value = "com.atguigu",excludeFilters = {
                @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class, Service.class}),
                @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = {BookDao.class})
        })
})
//@ComponentScan(value = "com.atguigu",excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class, Service.class})})
public class MainConfig {

    // id默认是方法名,@bean上自定义配置文件中id
    //@Bean("person01")
    @Bean
    public Person getPerson(){
        return new Person("lisi",20);
    }
}
