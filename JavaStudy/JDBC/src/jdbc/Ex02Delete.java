package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		int cnt = 0;
		
		
		System.out.print("삭제할 ID를 입력해주세요 >> ");
		String id = sc.next();
		System.out.print("비밀 번호 확인하겠습니다 >> ");
		String pw = sc.next();
		
		// 사용자가 입력한 ID와 PW가 일치하는 데이터 행을 삭제해주세요
		// delete from member where id = ? and pw =?
		
		// 1. 동적 로딩
		
		try {
			// 2. 연결 권한 확인하기 (준비물 3개 필요)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";
			
			conn = DriverManager.getConnection(url, db_id, db_pw); 
			
			// 3. SQL문 준비하기
			String sql = "delete from member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			// 4. executeUpdate() : 영향을 받은 행이 있는지 없는지에 대한 결과값 받아오기
			cnt = psmt.executeUpdate(); // 영향을 받은 행이 있는지
			// 삭제 구문을 통해 삭제가 된 행이 있는지 없는지에 대해서 "executeUpdate() : int -result" = int결과값을 받아온다
			
			// 5. 결과값 처리하기
			if(cnt > 0) {
				System.out.println("회원 정보 삭제 완료");
			}else {
				System.out.println("회원 정보 삭제 실패");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
								//conn = DriverManager.getConnection(url, db_id, db_pw); 에서 자동완성에서
								//Add exception 선택
								//또는 아래에 또 SQLException에 관한 catch 또 작성해도 됨
			System.out.println("동적 로딩 실패");
			// - ojdbc11.jar 파일 경로가 맞는지
			// - OracleDriver 클래스가 맞는지
			// - 오타가 있는지
		}finally {
			// 6. 자원 반납하기 (자원(->psmt, conn) 반납은 역순으로 진행하기)
			
			// 사용을 했는지 안했는지 판단
			// 사용을 했으면 반납 ---> 사용한 역순으로 반납하기
			
			try {
				if(psmt != null) 
					psmt.close();
				if(conn != null)
					conn.close(); // if(조건) { 실행문장 } --> 실행문장이 1줄이면 {} 생략가능
			} catch (SQLException e) {
				System.out.println("자원 반납 오류");
				e.printStackTrace();
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
