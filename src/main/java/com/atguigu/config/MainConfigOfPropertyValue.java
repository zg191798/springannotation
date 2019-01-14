package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author zhangge
 * @date 2019/1/14 - 14:33
 */
// 读取外部配置文件中的k/v保存到运行的环境变量中
@PropertySource(value = {"classpath:/person.properties"})
@Component
public class MainConfigOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }
}
