<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>欢迎登录:${emp.username }</h1>
	<br/>
	<a href="${pageContext.request.contextPath}/empAction/findAllEmp.action">查看所有员工</a>
</body>
</html>