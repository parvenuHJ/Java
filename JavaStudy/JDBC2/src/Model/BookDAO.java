package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {

	// Connection, PrepareStatement, ResultSet을 insert, delete 등 모든 DAO전역에서 사용할 수
	// 있도록 전역변수로 설정
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	BookDTO dto = null;
	int cnt = 0;

	// getCon : DB에 연결권한을 확인하는 메소드(기능)
	// 기능 자체를 가진 메소드 -> 리턴타입 : void
	public void getCon() {
		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SERVICE";
			String db_pw = "12345";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL문 오류");
			e.printStackTrace();
		}

	}

	// getClose : DB 자원 반납하는 메소드 - 리턴타입 : void
	public void getClose() {
		// select : rs -> psmt -> conn (역순으로)
		// update,delete,insert : psmt --> conn (역순으로)
		
		try {
			if(rs !=null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	// insert
	public int insert(BookDTO dto) {
		// 1.DB 연결권한
		getCon();
		String sql = "insert into book values (?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			// ? 채우기
			// dto : title, name, price, bookNum
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getName());
			psmt.setInt(3, dto.getPrice());
			psmt.setString(4, dto.getBookNum());
			
			cnt = psmt.executeUpdate(); // 영향을 받은 행이 있는지 없는지 int자료형으로 반환   -> Controller가 궁금하는 값 --> 최종적으로는 Main으로 돌아갈것임
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 자원 반납
			getClose();
		}
		return cnt; 
	}
	
	
	// selectOne
	public BookDTO selectOne(String title) {
		// 1. DB 연결권한
		getCon();
		
		try {
			String sql = "select * from book where title = ?";
			psmt = conn.prepareStatement(sql);
			
			// ? 채우기
			psmt.setString(1, title);
			
			rs = psmt.executeQuery();
			
			
			if(rs.next()) {	// rs.next() ==true-> 한 칸내렸을때 데이터가 있다면
				String db_title = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				String bookNum  = rs.getString(4);
				dto = new BookDTO(db_title, name, price, bookNum);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return dto;
		
		
	}
	
	
	
	
	
	// selectAll
	public ArrayList<BookDTO> selectAll() {
		// 1. DB 연결권한
		getCon();
		
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		
		try {
			String sql = "select * from book";
			
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {	//rs.next() 가 false (그 다음 데이터가 없으면) 면 그만한다.
				
			String title = rs.getString(1);	// 컬럼 인덱스 : 1부터 시작
			String name = rs.getString("name");	// 컬렴명 : 문자열로 찾을수도 있음~
			int price = rs.getInt(3);
			String booknum = rs.getString(4);
			
			dto = new BookDTO(title, name, price, booknum);
			
			list.add(dto);
			
			}
			
		
			
		} catch (SQLException e) {
			e.printStackTrace(); // 어떤 예외상황이 발생했을때 콘솔창에 빨간글씨로 알려주는것
		} finally {
			getClose();
			
		}
		
		return list;
		
	}
	
	
	// delete
	public int delete(String bookNum) {
		
		getCon();
		
		try {
			
			String sql = "delete from book where bookNum = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, bookNum);
			
			cnt = psmt.executeUpdate(); //-> executeUpdate의 리턴타입은 int!
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return cnt;
		
	}
	
	
	
	
	// update
	public int update(BookDTO dto) {
		
		getCon();
		
		
		try {
			String sql = "update book set bookNum = ? , price = ?  where title = ?";
			psmt = conn.prepareStatement(sql);
			
			
			psmt.setString(1, dto.getBookNum());
			psmt.setInt(2, dto.getPrice());
			psmt.setString(3, dto.getTitle());
			
			cnt = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return cnt;
		
	}
	
	
	
	
	

}
