package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberDAO {

	
	public String select(MemberDTO dto) {
		
		Connection conn = null;
		PreparedStatement psmt = null; //prepared~ 는 클래스 이름
		ResultSet rs = null;
		String data = "";
		
//		Class.forName("oracle.jdbc.driver.OracleDriver"); 만 적으면 만약 못찾으면 어떡할 건데?? 라고 오류 뜸 --> try catch 문 안에 넣어 줘야함
		try {
			// 1. 동적 로딩 -> OracleDriver 클래스 찾가
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB 연결
			// 필요한 준비물 3개 => url, db_id, db_pw 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(url, db_id, db_pw); //--> 값들이 길어서 한 곳에 넣음 --> 이값도 오류나면 어떡할건데?? --> catch 문에 ADD catch 사용해서 넣어줌
			
			// 3. SQL문 작성 및 전송
			String sql = "select * from member where id = ? and pw = ? ";
			psmt = conn.prepareStatement(sql); // prepare~ 는 메소드 이름
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			
			// select는 insert, update, delete와는 달리 DB에서 조회한 결과를 반환
			// ResultSet -> 커서객체
			rs = psmt.executeQuery(); // 지금 커서가 										   	      | ID PW NAME 이렇게 존재
									  // rs.next(); => 실제로 아래 데이터 내용을 보려면 커서를 내려줘야함 --->   |
									  //              해당하는 값이 있으면 true, 없으면 false 반환
			
		

			
			if(rs.next()) {
				// NAME 컬럼이 3번째에 있음
//				String name = rs.getString(3);
				// 혹은 컬럼 이름을 정확히 안다면 컬럼 이름을 입력 
				String name = rs.getString("NAME");
//				System.out.println(name + "님 환영합니다!");
				data += name;
				return data;
			}else {
//				System.out.println("로그인 실패");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 찾기 실패!");
		} catch (SQLException e) {
			System.out.println("SQL오류");
		} finally {
			try {
				// 4. 통로 닫기 (= 자원 반납)
				rs.close();
				psmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return data;
		
	}
	
	
	
}
