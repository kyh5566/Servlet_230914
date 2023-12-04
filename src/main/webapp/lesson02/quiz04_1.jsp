<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz04 길이 변환</title>
</head>
<body>
	<%
	int cm = Integer.valueOf(request.getParameter("rows"));
	double in = 
	double ft = cm / 100.0;
	%>
	<h2>길이 변환 결과</h2>
	<%= cm %>
	<hr>
	
</body>
</html>