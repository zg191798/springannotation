package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhangge
 * @date 2019/1/14 - 11:44
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    // 返回一个Color对象,这个对象会添加到容器中
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean getObject()...");
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    // true 单实例
    // false 多实例,每次获取会创建
    public boolean isSingleton() {
        return true;
    }
}
