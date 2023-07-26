package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

	public int update(MemberDTO dto) {
		
		Connection conn = null;			// try문과 finally문(통로 닫아주기)에서도 conn을 같이 쓰려고 전역변수로 설정
		PreparedStatement psmt = null;  // try문과 finally문(통로 닫아주기)에서도 conn을 같이 쓰려고 전역변수로 설정
		int cnt = 0;
		
		try {
			// 1. 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB 연결(Connection 객체 생성)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";
			
			// 너무 길어서 conn에 담아줌
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			// 3. Sql문 작성 및 전송(PreparedStatement 객체)
			String sql = "update member set name = ? where id = ? and pw =?";
			psmt = conn.prepareStatement(sql);	// 바로 실행 안하고 준비하는 이유 : 실행하는 방식이 달라서 
												// executeUpdate() -> insert, update, delete
												// executeQuery() -> select
												// 두개의 실행 방식이 다르니까 우선 준비만!!!!
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());
			
			cnt = psmt.executeUpdate(); 
			
		} catch (ClassNotFoundException e) {
			System.out.println("OracleDriver 클래스를 못찾았습니다.");
		} catch (SQLException e) {
			System.out.println("SQL 오류~");
		}finally {
			// 4. 통로 닫아주기, 자원 반납하기
			try {
				psmt.close(); // 닫는 것은 역순으로
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			
		}
		
		return cnt;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
