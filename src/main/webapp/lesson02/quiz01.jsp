<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!	
	// 1.
	public int getSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
%>
	<h1>1부터 50까지의 합은 <%=getSum(50) %> 입니다.</h1>

<%
	// 2.
	int[] scores = {80, 90, 100, 95, 80};
	int sum = 0;
	for (int i = 0; i < scores.length; i++) {
		sum+= scores[i];		
	}
	double avg = sum / (double)scores.length;	
%>
	<h1>평균 점수는 <%=avg%> 입니다<h1>
	
<%
	//3.
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	int scoreSum = 0;
	for (int i = 0; i < scoreList.size(); i++) {
		String score = scoreList.get(i);
		if (score.equals("O")) {
			scoreSum += 10;
		}
	}
%>
	<h1>채점 결과는 <%= scoreSum %> 점 입니다</h1>
	
<%
	// 4.
	String birthDay = "20010820";
	String b = birthDay.substring(0, 4);
	int age = 2023 - Integer.valueOf(b);
%>
	<h1><%=birthDay %> 의 나이는 <%=age %>세 입니다</h1>
</body>
</html>