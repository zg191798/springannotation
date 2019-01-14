package com.atguigu.condition;

import com.atguigu.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangge
 * @date 2019/1/14 - 11:01
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    //annotationMetadata 当前类的注解信息
    //beanDefinitionRegistry BeanDefinition 注册信息
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean red = beanDefinitionRegistry.containsBeanDefinition("com.atguigu.bean.Red");
        boolean blue = beanDefinitionRegistry.containsBeanDefinition("com.atguigu.bean.Blue");
        if (red && blue){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            beanDefinitionRegistry.registerBeanDefinition("rainBown",rootBeanDefinition);
        }
    }
}
