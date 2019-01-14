package com.atguigu.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zhangge
 * @date 2019/1/13 - 9:52
 */
// 名称默认类名首字母小写
@Repository
public class BookDao {
    private String label = "1";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "label='" + label + '\'' +
                '}';
    }
}

