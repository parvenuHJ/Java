package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

	
	
	// 데이터 베이스에 데이터를 삽입하는 기능
	public int insert(MemberDTO dto) {	// return 값이 cnt이므로 int 자료형
		
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;
		
		try {
		
			// 1. 동적로딩 Class.forName(oracle.jdbc.driver.OracleDriver); <-OracleDriver가 있는 경로   동적로딩 - 어떤 작업이 끝나야 다음작업을 할 수 있다....
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// 2. DB 연결(Connection 객체 생성)
				
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String db_id = "SERVICE";
				String db_pw = "12345";
				
				conn = DriverManager.getConnection(url, db_id, db_pw); 
						
				
			// 3. Sql문 작성 및 전송(PreparedStatement 객체)
			String sql = "insert into member values(? ,? ,? ,?)";	
			psmt = conn.prepareStatement(sql);	
			
			psmt.setString(1, dto.getId()); 
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			
			cnt = psmt.executeUpdate();  
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("OracleDriver 클래스를 못찾았습니다.");
		} catch (SQLException e) {
			System.out.println("SQL 오류~");
		} finally {
			// 4. 통로 닫아주기, 자원 반납하기
			try {
				psmt.close();	// 닫는 것은 역순으로 
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // 통로가 열리지 않았는데 닫으라고 할때는 어떻게 할거냐? -> try catch 문으로 
		}
		
		
		return cnt;
		
		
		
	}
	
}
