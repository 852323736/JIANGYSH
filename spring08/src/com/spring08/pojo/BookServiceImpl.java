package com.spring08.pojo;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring08.dao.BookDao;
import com.spring08.service.BookService;

@Service("bookService")
@Transactional(readOnly=true,propagation=Propagation.NOT_SUPPORTED)
public class BookServiceImpl implements BookService {
	@Resource(name="bookDao")
	   private BookDao bookDao;

	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public void add(Book book) {
		bookDao.add(book);

	}

	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public void modify(Book book) {
		bookDao.modify(book);

	}

	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public void remove(Book book) {
		bookDao.remove(book);

	}

	@Override
	public void find(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
