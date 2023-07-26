package select;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		// 만약 내가 관리자일때, 전체 회원 조회하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		MemberDTO dto = new MemberDTO(id, pw);
		
		Controller conn = new Controller();
		conn.selectCon(dto);
		
		
		
	}

}
