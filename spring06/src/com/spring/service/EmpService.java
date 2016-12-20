package com.spring.service;

import java.util.Date;
import java.util.List;

import com.spring.pojo.Emp;

public interface EmpService {
  Emp login(String ename, Integer empno);

  List<Emp> find(String ename, Date beginDate, Date endDate);
}
