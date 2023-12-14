<%@page import="com.test.common.MysqlService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 추가</title>
</head>
<body>
	<h1>즐겨찾기 추가</h1>
	<form method="post" action="/lesson04/quiz01_insert">
		<span>사이트명</span>
		<input type="text" name="name">
		<span>사이트 주소:</span>
		<input type="text" name="url">
		<button type="submit">추가</button>
	</form>
	
</body>
</html>