package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.awt.print.Book;
import java.sql.SQLOutput;

/**
 * @author zhangge
 * @date 2019/1/13 - 9:52
 */
@Service
public class BookService {

    //@Autowired
    //@Qualifier("bookDao2")
    //@Resource(name="bookDao2")
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }
}
