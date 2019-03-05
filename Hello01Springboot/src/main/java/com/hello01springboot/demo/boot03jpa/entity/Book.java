package com.hello01springboot.demo.boot03jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_book")
public class Book {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 100)
    private String name;
    @Column(length = 50)
    private String author;


}
