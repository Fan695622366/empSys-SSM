<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎使用员工管理系统</title>
<link rel="stylesheet" type="text/css" href="../css/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../css/themes/icon.css">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>	
</head>
<body>
	
	<form action="${pageContext.request.contextPath }/empAction/register.action" method="post">
		
		<input type="text" name="username" placeholder="请输入用户名"/>
		<br/>
		<input type="password" name="password" id="pwd1" placeholder="请输入密码"/>
		<br/>
		<input type="password"  id="pwd2" placeholder="请再次输入密码"/>
		<br/>
		性别:<input type="radio" name="gender" value="f">女 &emsp;&emsp;
			<input type="radio" name="gender" value="m">男
		<br/>
		年龄:<input type="number" name="age" required="required">
		<br/>
		入职日期:<input id="dd" type="text" name="hiredate"/>
		<br/>
		工薪:<input type="text" name="salary" required="required" />
		<br/>
		电话:<input type="text" class="easyui-numberbox" name="phone" required="required"></input>  
		<br/>
		邮箱:<input type="email" name="email" id="email" required="required" />
		<br/>
		<input type="submit"/>
		
	</form>
</body>
<script type="text/javascript">

	$('#dd').datebox({    
    	required:true
	});  

</script>
</html>