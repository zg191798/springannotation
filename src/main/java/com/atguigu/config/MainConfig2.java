package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.ColorFactoryBean;
import com.atguigu.bean.Person;
import com.atguigu.bean.Red;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.MyImportBeanDefinitionRegistrar;
import com.atguigu.condition.MyImportSelector;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @author zhangge
 * @date 2019/1/14 - 9:28
 */
//@Conditional({WindowsCondition.class})
@Configuration
//@Import(Color.class)    // 导入组件 id默认为全类名
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    // 默认获取工厂类getObject创建的对象
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

//    @Scope("prototype")
//    @Lazy
    @Bean
    public Person person(){
        System.out.println("给容器中添加Person");
        return new Person("张三",20);
    }

    /*@Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        System.out.println("给容器中添加Person01");
        return new Person("Bill Gates",20);
    }*/

    /*@Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02(){
        System.out.println("给容器中添加Person02");
        return new Person("linus",20);
    }*/
}
