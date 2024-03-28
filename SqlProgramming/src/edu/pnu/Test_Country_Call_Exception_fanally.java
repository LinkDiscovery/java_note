package edu.pnu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test_Country_Call_Exception_fanally {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Table Name:");
			String tnlname = sc.next();
			test(tnlname);
		}
	}

	public static void test(String tblname) {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			// 드라이버 정의
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "scott";
			String password = "1234";

			Class.forName(driver);
			// 인스턴스를 만들어서 메모리에 올린다.
			con = DriverManager.getConnection(url, username, password);
			st = con.createStatement();
//			select * from city ,                                띄어쓰기 중요
			rs = st.executeQuery("select * from " + tblname + " limit 10");
			// 행렬 전체를 ResultSet이라는 걸 통해서 전달
			ResultSetMetaData meta = rs.getMetaData();
			// 데이터의 데이터를 meta데이터라고 한다. ResultSetMetaData 데이터의 데이터
			while (rs.next()) {
				// 열 이름으로 직접적으로 불러오는 방법
//				System.out.print(rs.getString("CountryCode")+" ,"); //커서 프로세싱 커서를 하나씩 이동시키면서 출력
//				System.out.print(rs.getString("Language")+" ,");
//				System.out.print(rs.getString("IsOfficial")+" ,");
//				System.out.print(rs.getString("Percentage")+" ,");

				// 색인(index)으로 가져오는 방법
//				System.out.print(rs.getString(1)+" ,"); //커서 프로세싱 커서를 하나씩 이동시키면서 출력
//				System.out.print(rs.getString(2)+" ,");
//				System.out.print(rs.getString(3)+" ,");
//				System.out.print(rs.getString(4)+" ,");

				for (int i = 1; i <= meta.getColumnCount(); i++) {
					// ColumnCount() 열 길이 만큼
					int len = meta.getColumnDisplaySize(i);
					System.out
							.print(rs.getString(i) + ((i == meta.getColumnCount()) ? "" : " ,") );
				}
				System.out.println();
			}
			System.out.println("성공");


		} catch (Exception e) {
			System.out.println("실패");
			System.out.println(e.getMessage());
		}finally{
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("실패");

			}

		}
	}
}