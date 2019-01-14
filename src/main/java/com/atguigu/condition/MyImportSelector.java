package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangge
 * @date 2019/1/14 - 10:54
 */
// 自定义逻辑,返回需要的组件
public class MyImportSelector implements ImportSelector {
    // 返回值,就是导入到容器中的全类名
    // 参数当前标注@Import注解的所有注册信息
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.atguigu.bean.Blue","com.atguigu.bean.Yellow"};
    }
}
