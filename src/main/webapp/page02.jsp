<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>挂号</title>
</head>
<body>
<div>
<h2><center>挂号信息表</center></h2>
<h6><center><a href="all">刷新</a></center></h6>
<table border="1" align="center">
<tr>
<th>病人编号</th>
<th>看病日期</th>
<th>看病次数</th>
</tr>
<c:forEach items="${storage}" var="s">
<tr>
<td align="center">${s.id}</td>
<td align="center">${s.date}</td>
<td align="center">${s.num}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>