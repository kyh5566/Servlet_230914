package com.test.lesson04;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01/deleteQuiz01")
public class deleteQuiz01 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		int id = Integer.valueOf(request.getParameter("id"));
		//db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		//delete query
		String deleteQuery = "";
		
		//연결해제
		ms.disconnect();
	}
}
