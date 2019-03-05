package com.hello01springboot.demo.boot03jpa.controller;

import com.hello01springboot.demo.boot03jpa.dao.BookDao;
import com.hello01springboot.demo.boot03jpa.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/3/5 22:01
 * @Description:
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("/test")
    @ResponseBody
    public  String  test(){
        return new Date().toLocaleString();
    }

    /**
     * 查询所有图书
     * @return
     */
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mav =new ModelAndView();
        mav.addObject("bookList",bookDao.findAll());
        mav.setViewName("boot03bookList");
        return mav;
    }


    /**
     * 添加图书
     * @param book
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public  String add(Book book){
        bookDao.save(book);
        // return "forward:/book/list";
        return "redirect:/book/list";
    }


    //查询一个，跳转到修改界面
    @RequestMapping("/preUpdate/{id}")
    public  ModelAndView preUpdate(@PathVariable("id") Integer id){
        ModelAndView mav =new ModelAndView();
        mav.addObject("book",bookDao.findOne(id));
        mav.setViewName("boot03bookUpdate");
        return mav;
    }

    //修改，带有id就修改
    @RequestMapping(value="update",method = RequestMethod.POST)
    public String update(Book book){
        bookDao.save(book);
        return "redirect:/book/list";
    }

    //根据id删除
    @RequestMapping("/delete")
    public String delete(Integer id){
        bookDao.delete(id);
        return "redirect:/book/list";
    }

    //根据名字模糊查询  http://localhost:8080/book/findByName
    @ResponseBody
    @RequestMapping("/findByName")
    public List<Book> findByName(){
        return  bookDao.findBookByName("编程");
    }

    //随机显示n个  http://localhost:8080/book/randomList
    @ResponseBody
    @RequestMapping("/randomList")
    public List<Book> randomList(){
        return bookDao.randomList(2);
    }


    //根据条件动态查询
    @RequestMapping("/list2")
    public ModelAndView list2(Book book){
        ModelAndView mav =new ModelAndView();
        List<Book> bookList = bookDao.findAll(new Specification<Book>() {
            @Override
            public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                Predicate predicate = cb.conjunction();
                if (book != null) {
                    if (book.getName() != null && !"".equals(book.getName())) {
                        predicate.getExpressions().add(cb.like(root.get("name"), "%" + book.getName() + "%"));
                    }
                    if (book.getAuthor() != null && !"".equals(book.getAuthor())) {
                        predicate.getExpressions().add(cb.like(root.get("author"), "%" + book.getAuthor() + "%"));
                    }
                }
                return predicate;
            }
        });
        mav.addObject("bookList", bookList);
        mav.setViewName("boot03bookList");
        return mav;
    }

}
