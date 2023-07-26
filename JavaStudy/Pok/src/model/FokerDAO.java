package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FokerDAO {
	
	// 전역변수 설정
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	
	
	// getCon
	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String db_id = "campus_e_0718_3";
			String db_pw = "smhrd3";
			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			System.out.println("connection 문제");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("db연결 문제");
			e.printStackTrace();
		}

	}
	
	// getClose
	public void getClose() {

		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	// 회원가입 후 insert 하는 메서드
	public int insert(FokerPlayer playerdto) {
		getCon();
		
		String sql = "insert into members values(?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
