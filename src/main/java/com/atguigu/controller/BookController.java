package com.atguigu.controller;

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhangge
 * @date 2019/1/13 - 9:52
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
