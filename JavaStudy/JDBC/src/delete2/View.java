package delete2;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		// id 와 pw를 입력받아서 테이블에 둘 다 일치하는 레코드가 존재한다면 해당 레코드 지우기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 ID : ");
		String id = sc.next();
		System.out.print("삭제할 PW : ");
		String pw = sc.next();
		
		MemberDTO dto = new MemberDTO(id,pw);
		
//		Controller con = new Controller();
//		con.delete(dto);
		
		new Controller().delete(dto);
		
		
		
		
		
	}

}
