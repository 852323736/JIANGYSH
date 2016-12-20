package com.spring.dao;

import java.util.Date;
import java.util.List;

import com.spring.pojo.Emp;
import com.spring.util.Pager;

public interface EmpDao {
  Emp login(String ename, Integer empno);

  List<Emp> find(String ename, Date beginDate, Date endDate);
  
  Pager<Emp> find(Integer pageno,Integer pagesize,String sort,String order, String ename,Date beginDate,Date endDate);
}
