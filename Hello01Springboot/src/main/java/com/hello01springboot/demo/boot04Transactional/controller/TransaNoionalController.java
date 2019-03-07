package com.hello01springboot.demo.boot04Transactional.controller;

import com.hello01springboot.demo.boot03jpa.dao.BookDao;
import com.hello01springboot.demo.boot03jpa.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: fang
 * @Date: 2019/3/7 23:16
 * @Description:
 */
@Controller
@RequestMapping("/TransactionalController")
public class TransaNoionalController {

    @Autowired
    private BookDao bookDao;
    @RequestMapping("/NoTransactional")
    @ResponseBody
    public String NoTransactional() {
        Book bookfy = new Book();
        bookfy.setAuthor("fy");

        bookDao.saveAndFlush(bookfy);

        int x = 1 / 0;

        Book bookyf = new Book();
        bookyf.setAuthor("yf");
        bookDao.saveAndFlush(bookyf);

        return "ok";
    }


    @Transactional
    @RequestMapping("/YesTransactional")
    @ResponseBody
    public String YesTransactional() {
        Book bookfy = new Book();
        bookfy.setAuthor("fy");

        bookDao.saveAndFlush(bookfy);

        int x = 1 / 0;

        Book bookyf = new Book();
        bookyf.setAuthor("yf");
        bookDao.saveAndFlush(bookyf);
        return "ok";
    }

}
