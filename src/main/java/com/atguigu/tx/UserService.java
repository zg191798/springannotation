package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhangge
 * @date 2019/1/14 - 20:43
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void insertUser(){
        userDao.insert();
        System.out.println("插入完成...");
        int i = 1/0;
    }

}
