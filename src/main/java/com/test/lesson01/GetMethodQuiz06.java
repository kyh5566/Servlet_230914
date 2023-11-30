package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		PrintWriter out = response.getWriter();
//  {
//		"addtion": 1570,
//	    "subtraction": 1430,
//	    "multiplication": 105000,
//	    "division": 21
// 	}
		
		int a = Integer.valueOf(request.getParameter("number1"));
		int b = Integer.valueOf(request.getParameter("number2"));
		
		out.print("{\"addition\":" + (a + b) + ", \"subtraction\":" + (a - b) + ", \"multiplication\":" + (a * b) + ", \"division\":" + (a / b) + "}");
	}
}
