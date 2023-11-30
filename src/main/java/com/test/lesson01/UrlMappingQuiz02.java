package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet{
	//현재 시간은 14시 52분 43초 입니다.

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		out.print("현재 시간은 ");
		
		
		Date now = new Date(); // "현재 시간은" 을 합쳐서 써도 가능.
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초입니다");
		out.print(sdf.format(now));
	}
}
