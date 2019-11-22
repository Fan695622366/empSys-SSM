<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/empAction/login.action" method="post">
		<input type="text" name="username" placeholder="用户名" />
		<br/>
		<input type="password" name="password" placeholder="密码"/>
		<br/>		
		<input type="submit"/>
	</form>
	
	${empMsg }
	

</body>
</html>