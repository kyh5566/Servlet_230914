package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class ProstMethodQuiz10 extends HttpServlet{
	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		out.print("<html><head><title></title></head><body>");
		if (userMap.get("id").equals(id) == false) {
			out.print("id가 일치하지않습니다");
		} else if (userMap.get("password").equals(password) == false) {
			out.print("비밀번호가 일치하지않습니다");
		} else {
			out.print(userMap.get("name") + "님 환영합니다");
		}
		out.print("</body></html>");
	}
}
