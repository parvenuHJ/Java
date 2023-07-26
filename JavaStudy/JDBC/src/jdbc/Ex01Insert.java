package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Insert {

	public static void main(String[] args) {
		
		// //사용자의 id,pw,name,age 입력받기 랑 // 3. Sql문 작성 및 전송(PreparedStatement 객체) 만 바꿔주면 되고 다른 것들은
		// 복붙해서 사용하면됨.

		// JDBC 연결순서 (4단계)
		// 선행작업 -> ojdbc11.jar 추가
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null; // conn을 전역변수로 사용
		PreparedStatement psmt = null;
		int cnt = 0;
		
		//사용자의 id,pw,name,age 입력받기
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("NAME : ");
		String name = sc.next();
		System.out.print("AGE : ");
		int age = sc.nextInt();
		
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver"); 만 적으면 알아서 try/catch 적으라는 오류뜰것임 그거 클릭
			//OracleDriver의 통로를 열어놨는데, 만약 경로를 못찾았을경우 컴퓨터가 다운되거나 했을때 위험하니까...해킹당할수도있고
			// 1. 동적로딩 Class.forName(oracle.jdbc.driver.OracleDriver); <-OracleDriver가 있는 경로   동적로딩 - 어떤 작업이 끝나야 다음작업을 할 수 있다....
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// 2. DB 연결(Connection 객체 생성)
				// DB에 접근할 때, 접근할 DB의 url, db_id, db_pw 필요
				// 각각 항목들이 기니까 변수에 담아서 사용
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String db_id = "SERVICE";
				String db_pw = "12345";
				
				conn = DriverManager.getConnection(url, db_id, db_pw); // Connection - import해야함 , 오류뜨면 -> Add catch 
						// drivermanger에게 권한이 있는지 물어보고 있으면 가져와라
				
			// 3. Sql문 작성 및 전송(PreparedStatement 객체)
			String sql = "insert into member values(? ,? ,? ,?)";	// ? -> 바인딩 변수
			psmt = conn.prepareStatement(sql);	// 전송하려고 준비중
			
			psmt.setString(1, id); // (몇번 ?에, 무엇을 넣을건지) 주의!! 0번째 인덱스 이런게 아님
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			
			// executeUpdate() -> insert, update, delete
			// executeQuery() -> select
			cnt = psmt.executeUpdate(); // 자동완성 봐보면 - int  라고 써있는데 이 말은 int로 리턴한다는 뜻 : 정상적으로 삽입된 데이터의 갯수를 리턴해줌
			
			
			
			
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
		
		// try 문 바깥으로 빼놓는게 좋다! 오래안걸리고 바로 출력
		if(cnt > 0) {
			System.out.println("회원가입 성공!!!");
		}else {
			System.out.println("회원가입 실패.....");
		}
		
		
		
		
	}

}
	// 실행후 오류 코드 -> syntaxError -> 문법 오류
