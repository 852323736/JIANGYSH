package com.spring08.service;

import java.util.List;

import com.spring08.pojo.Book;

public interface BookService {
    void add(Book book);
    
    void modify(Book book);
    
    void remove(Book book);
    
    void find(Integer id);
    
    List<Book> find();
}
