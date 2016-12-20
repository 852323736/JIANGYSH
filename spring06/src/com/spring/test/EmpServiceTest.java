package com.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Emp;
import com.spring.service.EmpService;

public class EmpServiceTest {
  private EmpService empService;

  @Test
  public void login() {
    String ename = "KING";
    Integer empno = 7839;
    Emp emp = empService.login(ename, empno);
    if (emp != null) {
      System.out.println("登录成功");
      System.out.println(emp.getEname() + " " + emp.getSal());
    } else {
      System.out.println("错误的用户名或密码");
    }
  }

  @SuppressWarnings("resource")
  @Before
  public void init() {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    empService = ctx.getBean("empService", EmpService.class);
  }
}
