<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工信息</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<style type="text/css">

	body{
		text-align: center;	
	}
	
	hr{
		width:80%;
	}


</style>


</head>
<body>

	<h1>员工信息表</h1>
	<hr>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>序号</th>
				<th>id</th>
				<th>姓名</th>
				<th>密码</th>
				<th>性别</th>
				<th>年龄</th>
				<th>入职日期</th>
				<th>薪资</th>
				<th>电话</th>
				<th>邮箱</th>
				<th colspan="2">操作</th>
			</tr>
			<c:forEach items="${empList }" var="e" varStatus="vs">
				<tr>
					<td>${vs.count }</td>
					<td>${e.id }</td>
					<td>${e.username }</td>
					<td>${e.password }</td>
					<td>${e.gender }</td>
					<td>${e.age }</td>
					<td>${e.hiredate }</td>
					<td>${e.salary }</td>
					<td>${e.phone }</td>
					<td>${e.email }</td>
					<td><a href="${pageContext.request.contextPath }/system/updateServlet?id=${e.id}">修改</a></td>
					<td><a
					 href="javascript:if(confirm('确认删除吗?'))window.location='${pageContext.request.contextPath }/system/deleteEmpServlet'">删 除</a></td>
				</tr>
			
			</c:forEach>
			<span>${UpdateErrorMsg }</span>
		</thead>
	</table>
</body>
</html>
