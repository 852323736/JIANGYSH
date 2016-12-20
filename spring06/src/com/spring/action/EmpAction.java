package com.spring.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.spring.pojo.Emp;
import com.spring.service.EmpService;

public class EmpAction extends ActionSupport implements SessionAware {
  private static final long serialVersionUID = 1L;
  private Emp emp; // setter & getter (jsp -传入参数 action -输出参数 jsp)
  private Date beginDate; // setter (jsp -传入参数 action)
  private Date endDate;// setter (jsp -传入参数 action)
  private List<Emp> emps; // getter (action -> jsp)
  private EmpService empService; // setter (spring 注入)

  private Map<String, Object> session;

  public String list() {
    if (emp == null) {
      emp = new Emp();
    }
    emps = empService.find(emp.getEname(), beginDate, endDate);
    return "list";
  }

  public String login() {
    String result = NONE;
    if (emp != null) {
      // 第一个emp对象是查询数据库后的结果集对象
      // 第二/三个emp对象是表单实例化对象
      emp = empService.login(emp.getEname(), emp.getEmpno());
      if (emp != null) {
        System.out.println("登录成功");
        result = LOGIN;

        // 把emp对象放入session
        session.put("emp", emp);
      } else {
        System.out.println("错误的用户名或密码.");
        result = INPUT;
      }
    }
    return result;
  }

  public Emp getEmp() {
    return emp;
  }

  public void setEmp(Emp emp) {
    this.emp = emp;
  }

  public List<Emp> getEmps() {
    return emps;
  }

  public void setBeginDate(Date beginDate) {
    this.beginDate = beginDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public void setEmpService(EmpService empService) {
    this.empService = empService;
  }

  @Override
  public void setSession(Map<String, Object> session) {
    this.session = session;
  }
}
