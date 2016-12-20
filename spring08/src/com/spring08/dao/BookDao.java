package com.spring08.dao;

import java.util.List;

import com.spring08.pojo.Book;

public interface BookDao {
	
            void add(Book book);
            
            void modify(Book book);
            
            void remove(Book book);
            
            void find(Integer id);
            
            List<Book> find();
}
