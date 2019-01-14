package com.atguigu.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhangge
 * @date 2019/1/14 - 10:14
 */
public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 获取到Ioc使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        // 获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        // 获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        // 获取到bean定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        // 容器中是否包含某个bean
        boolean person = registry.containsBeanDefinition("person");
        System.out.println(person);
        // 获取操作系统名称
        String property = environment.getProperty("os.name");
        if (property.contains("Windows")){
            return true;
        }
        return false;
    }
}
