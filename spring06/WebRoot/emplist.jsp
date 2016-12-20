<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Emp CRUD</title>
</head>

<body>
	<h1>Emp CRUD</h1>
	<h3>Struts2 + Spring 4 + Hibernate 4 + Oracle 11g</h3>

	<br><br>
	<form action="empAction_list" method="post" name="f">
	  <input type="text" placeholder="雇员名" name="emp.ename">
	  <input type="date" name="beginDate">
	  <input type="date" name="endDate">
	  <input type="submit" value="查询">
	</form>
	<br><br>
	
	<table border="1">
	  <tr>
	    <th>empno</th>
	    <th>ename</th>
	    <th>hiredate</th>
	    <th>sal</th>
	    <th>操作</th>
	  </tr>
	  
	  <c:forEach var="emp" items="${requestScope.emps }">
	    <tr>
	      <td>${emp.empno }</td>
	      <td>${emp.ename }</td>
	      <td>${emp.hiredate }</td>
	      <td>${emp.sal }</td>
	      <td>Modify &nbsp;&nbsp; Remove</td>
	    </tr>
	  </c:forEach>
	</table>
</body>
</html>
