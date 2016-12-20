<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>SSMO Demo</title>
</head>

<script src="${pageContext.request.contextPath }/resources/js/jquery-2.2.2.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("tr").filter(":odd").css("background-color", "orange");
		$("tr").filter(":even").css("background-color", "red");
	});
</script>
<body>
	<h1>SpringMVC - Spring - Mybatis - Oracle</h1>
	<img alt="26" src="${pageContext.request.contextPath }/resources/images/26.jpg">
	
	<table border="1">
	  <tr>
	    <th>ID</th>
	    <th>Name</th>
	    <th>Sale Date</th>
	    <th>Price</th>
	    <th>操作</th>
	  </tr>
	  <c:forEach var="car" items="${requestScope.cars }">
	    <tr>
	      <td>${car.id }</td>
	      <td>${car.name }</td>
	      <td>
	        <fmt:formatDate value="${car.saleDate }" pattern="yyyy-MM-dd"/>
	      </td>
	      <td>${car.price }</td>
	      <td>
	        <a href="carController_findById?id=${car.id }">Modify</a> 
	        &nbsp;&nbsp; 
	        <a href="carController_remove?id=${car.id }"
	          onclick="return confirm('是否确认删除 ${car.name } ?')">Remove</a>
	      </td>
	    </tr>
	  </c:forEach>
	</table>
	
	<a href="caredit.jsp">add a Car</a>
</body>
</html>
