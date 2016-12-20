package com.spring08.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.spring08.pojo.Book;
import com.spring08.service.BookService;

@Controller
public class BookAction {
            private Book book;
            private List<Book> books;
            
            @Resource(name="bookService")
            private BookService bookService;

			public Book getBook() {
				return book;
			}

			public void setBook(Book book) {
				this.book = book;
			}

			public List<Book> getBooks() {
				return books;
			}

			public void setBooks(List<Book> books) {
				this.books = books;
			}

			public BookService getBookService() {
				return bookService;
			}

			public void setBookService(BookService bookService) {
				this.bookService = bookService;
			}
            
}
