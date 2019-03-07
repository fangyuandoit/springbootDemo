package com.hello01springboot.demo.boot03jpa.dao;

import com.hello01springboot.demo.boot03jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: fang
 * @Date: 2019/3/5 21:56
 * @Description:
 */
public interface BookDao extends JpaRepository<Book, Integer>, JpaSpecificationExecutor<Book> {

    @Query(value = "select * from  t_book where name like %?1%", nativeQuery = true)
    List<Book> findBookByName(String name);

    @Query(value = "select * from t_book order by  RAND() limit ?1", nativeQuery = true)
    List<Book> randomList(Integer size);
}
