package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test_City_DataCall {

	public static void main(String[] args)  {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			// 드라이버 정의 
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "1234";
			
			Class.forName(driver);
			//인스턴스를 만들어서 메모리에 올린다.
			Connection con = DriverManager.getConnection(url,username,password);
			
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select id, name, countrycode, district, population from city ");
			// 행렬 전체를 ResultSet이라는 걸 통해서 전달
			while(rs.next()) {
				System.out.print(rs.getString("id")+" ,"); //커서 프로세싱 커서를 하나씩 이동시키면서 출력
				System.out.print(rs.getString("name")+" ,");
				System.out.print(rs.getString("countrycode")+" ,");
				System.out.print(rs.getString("district")+" ,");
				System.out.print(rs.getString("population")+"");
				System.out.println();
		}
			System.out.println("성공");
			rs.close();
			st.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e.getMessage());
		}
	}
}