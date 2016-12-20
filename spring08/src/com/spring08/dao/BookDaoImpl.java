package com.spring08.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring08.pojo.Book;

@Repository("bookDao")
public class BookDaoImpl extends HibernateDaoSupport implements BookDao {

	@Resource(name="sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	
	
	@Override
	public void add(Book book) {
		this.getHibernateTemplate().save(book);

	}

	@Override
	public void modify(Book book) {
		this.getHibernateTemplate().update(book);

	}

	@Override
	public void remove(Book book) {
		this.getHibernateTemplate().delete(book);

	}

	@Override
	public void find(Integer id) {
		

	}

	@Override
	public List<Book> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
