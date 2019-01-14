package com.atguigu;

import com.atguigu.bean.Blue;
import com.atguigu.bean.ColorFactoryBean;
import com.atguigu.bean.RainBow;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author zhangge
 * @date 2019/1/13 - 9:53
 */
public class IOCTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void testImport(){
        printBean(applicationContext);
        Blue blue = (Blue) applicationContext.getBean("com.atguigu.bean.Blue");
        RainBow rainBown = (RainBow) applicationContext.getBean("rainBown");
        System.out.println(rainBown);

        // 工厂bean获取的是调用getObject创建的对象
        Object bean1 = applicationContext.getBean("colorFactoryBean");
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        Object bean3 = applicationContext.getBean("&colorFactoryBean");
        System.out.println("bean的类型："+bean1.getClass());
        System.out.println(bean1 == bean2);
        System.out.println(bean3);
    }

    private void printBean(AnnotationConfigApplicationContext applicationContext){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test03(){

        /*String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
        Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);

        System.out.println(persons);*/
        System.out.println("IOC容器创建完成");
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        /*String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }*/

        System.out.println("IOC容器创建完成");
       /*Object bean1 = applicationContext.getBean("person");
         Object bean2 = applicationContext.getBean("person");
        System.out.println(bean1 == bean2);*/
    }

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
        Object bean1 = applicationContext.getBean("getPerson");
        System.out.println(bean1);
    }
}
