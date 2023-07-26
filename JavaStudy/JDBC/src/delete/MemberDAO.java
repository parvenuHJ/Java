package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

	public int delete(MemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;
		
		try {
			// 1. 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. DB 연결(Connection 객체 생성)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			// 3. Sql문 작성 및 전송(PreparedStatement 객체)
			String sql = "delete from member where id =? and pw =? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			
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
