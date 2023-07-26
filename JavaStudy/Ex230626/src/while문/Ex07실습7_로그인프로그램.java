package while문;

import java.util.Scanner;

public class Ex07실습7_로그인프로그램 {

	public static void main(String[] args) {

		//로그인 프로그램 만들기
		//ID = Hello, PW = 1234
		//while 문 사용
		Scanner sc = new Scanner(System.in);
		String id ;
		String pw ;
		
		while (true) {

			//아이디, 비번 입력받기
			//로그인 성공시 성공 출력문 후 반복문 탈출
			//로그인 실패시 잘못 출력
			
			System.out.print("아이디를 입력해 주세요>> ");
			id = sc.next();
			System.out.print("비밀번호를 입력해 주세요>> ");
			pw = sc.next();
			
			if (id.equals("Hello") && pw.equals("1234")){
				System.out.println("로그인 성공!");
				break;
			}else {
				System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
			}
			
		}
		
	
		
	}

}
