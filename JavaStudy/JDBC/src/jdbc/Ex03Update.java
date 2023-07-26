package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;

		System.out.print("ID를 입력해주세요 >> ");
		String id = sc.next();
		System.out.print("PW를 입력해주세요 >> ");
		String pw = sc.next();
		System.out.print("변경할 Name을 입력해주세요 >> ");
		String name = sc.next();

		// 사용자가 입력한 ID, PW와 일치하는 Name의 값을 변경하자
		// update 테이블명 set 열 = '변경할 값' where 조건

		// 1. 동적로딩 Class.forName();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB 연결 (Connection 객체 생성)
			// 준비물 3개 필요 url, id, pw
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			String sql = "update member set name = ? where id = ? and pw =?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("회원 정보 업데이트 성공");
			} else {
				System.out.println("회원 정보 업데이트 실패");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("동적 로딩 실패");

		} finally {

			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("자원 반납 오류");
				e.printStackTrace();
			}
		}


	}

}
