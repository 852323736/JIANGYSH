package com.spring.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.util.StringUtils;

import com.spring.pojo.Emp;
import com.spring.util.Pager;

public class EmpDaoImpl extends HibernateDaoSupport implements EmpDao {

	@Override
	public Pager<Emp> find(Integer pageno, Integer pagesize, String sort,String order, String ename,Date beginDate ,Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}
	
  @Override
  public Emp login(final String ename, final Integer empno) {
    final String hql = "from Emp where ename = :ename and empno = :empno";
    // jdk 1.8 新特性 (Lambda 表达式)
    return this.getHibernateTemplate().execute((Session session) -> {
      Query query = session.createQuery(hql);
      query.setString("ename", ename);
      query.setInteger("empno", empno);
      return (Emp) query.uniqueResult();
    });
    
    // jdk 低于 1.8
    /*return this.getHibernateTemplate().execute(new HibernateCallback<Emp>() {
      @Override
      public Emp doInHibernate(Session session) throws HibernateException {
        Query query = session.createQuery(hql);
        query.setString("ename", ename);
        query.setInteger("empno", empno);
        return (Emp) query.uniqueResult();
      }
    });*/
  }

  @Override
  public List<Emp> find(String ename, Date beginDate, Date endDate) {
    String tmphql = "from Emp where 1=1 ";
    if (!StringUtils.isEmpty(ename)) {
      tmphql += " and ename like :ename ";
    }
    if (beginDate != null && endDate != null) {
      tmphql += " and hiredate between :beginDate and :endDate ";
    }
    final String hql = tmphql;
    
    return this.getHibernateTemplate().execute(new HibernateCallback<List<Emp>>() {
      @SuppressWarnings("unchecked")
      @Override
      public List<Emp> doInHibernate(Session session) throws HibernateException {
        Query query = session.createQuery(hql);
        if (!StringUtils.isEmpty(ename)) {
          query.setString("ename", "%" + ename + "%");
        }
        if (beginDate != null && endDate != null) {
          query.setDate("beginDate", beginDate);
          query.setDate("endDate", endDate);
        }
        return query.list();
      }
    });
  }



}
