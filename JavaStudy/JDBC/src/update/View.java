package update;

import java.util.Scanner;

import insert.Controller;

public class View {

	public static void main(String[] args) {

		
		
		// MVC 패턴을 사용해서
		// 사용자한테 아이디, 패스워드 입력받아
		// NAME을 바꾸는 코드를 작성해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("바꿀 NAME : ");
		String name = sc.next();
		
		MemberDTO dto = new MemberDTO(id, pw, name);
		
		// 1. Controller 객체 생성하기
		update.Controller con = new update.Controller();
		
		// controller에 있는 update에다가 dto를 전송(전달)
		con.update(dto);
		
	}

}
