package com.spring.service;

import java.util.Date;
import java.util.List;

import com.spring.dao.EmpDao;
import com.spring.pojo.Emp;

public class EmpServiceImpl implements EmpService {
  private EmpDao empDao;

  @Override
  public Emp login(String ename, Integer empno) {
    return empDao.login(ename, empno);
  }

  @Override
  public List<Emp> find(String ename, Date beginDate, Date endDate) {
    return empDao.find(ename, beginDate, endDate);
  }

  public void setEmpDao(EmpDao empDao) {
    this.empDao = empDao;
  }

}
