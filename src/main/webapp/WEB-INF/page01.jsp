<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>医院挂号系统——挂号管理</title>
</head>
<body>
<div>
		<label style="color: red;">${msg}</label>
		<form action="all" method="post">
			<label>病人编号：</label><input name="id"><br> 
			<label>看病日期：</label><input name="date"><br> 
			<label>看病次数：</label><input name="num"><br> 
				<input type="submit" value="挂号">
		</form>
	</div>
</body>
</html>