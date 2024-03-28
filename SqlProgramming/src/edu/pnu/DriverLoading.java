package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;

public class DriverLoading {

	public static void main(String[] args)  {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "1234";
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			
			
			
			
			System.out.println("성공");
			con.close();
			
		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e.getMessage());
		}
	}
}
