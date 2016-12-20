package com.spring08.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring08.pojo.Book;
import com.spring08.service.BookService;

public class BookServiceTest {
         private BookService bookService;

	@Test
	public void add() {
		Book book=new Book();
		book.setName("jsck");
		book.setPrice(99d);
		bookService.add(book);
	}

	@SuppressWarnings("resource")
	@Before
	public void init(){
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		bookService=ctx.getBean("bookService", BookService.class);
	}
}
