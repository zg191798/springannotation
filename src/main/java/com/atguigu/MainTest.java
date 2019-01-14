package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class MainTest
{
    public static void main( String[] args )
    {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println( person );*/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        //Person person = (Person) applicationContext.getBean(Person.class);
        //Person person = (Person) applicationContext.getBean("getPerson");
        Person person = (Person) applicationContext.getBean("person01");
        System.out.println( person );

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }
    }
}
