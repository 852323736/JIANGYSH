<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>Emp CRUD</title>
</head>

<body>
	<h1>Emp CRUD</h1>
	<h3>Struts2 + Spring 4 + Hibernate 4 + Oracle 11g</h3>
	<a href="empAction_list">gooooooooo</a>
	
	<br><br>
	<form action="empAction_login" method="post" name="f">
	  <input type="text" placeholder="用户名/雇员名" name="emp.ename"><br>
	  <input type="password" placeholder="密码/雇员号" name="emp.empno"><br>
	  <input type="submit" value="登录">
	</form>
</body>
</html>
