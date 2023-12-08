package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/Quiz01")
public class lesson04Quiz01 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("type/plain");
		
		PrintWriter out = response.getWriter();
		
		// 연결
		MysqlService ms2 = MysqlService.getInstance();
		ms2.connect();
		
		// insert
		String insert = "insert into `real_estate`"
				+"(`realtorId`,`address`, `area`,`type`,`price`,)" 
				+"values"
				+"(3, '헤라펠리스 101동 5305호', 350, '매매', `1500000`)";
		try {
			ms2.update(insert);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// select, 출력
		String query = "select `address`, `area`, `type` from `real_estate` order by `id` desc limit 10";
				
		try {
			ResultSet res = ms2.select(query);
			
			while (res.next()) {
				out.print("매물주소 : " + res.getString("address"));
				out.print(", 면적 : " + res.getInt("area"));
				out.print(", 타입 : " + res.getString("type"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 연결 해제
		ms2.disconnect();
	}
}
