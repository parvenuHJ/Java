package 조건문;

import java.util.Scanner;

public class Ex09switch문3_good {

	public static void main(String[] args) {

		//가위바위보 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("user1 : ");
		String user1 = sc.next();
		System.out.print("user2 : ");
		String user2 = sc.next();
		
		System.out.print(user1 + "님 : ");
		String rsp1 = sc.next();
		System.out.print(user2 + "님 : ");
		String rsp2 = sc.next();
		
		//rsp1 과 rsp2를 붙여주기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		String rsp = rsp1 + rsp2;
		
		switch (rsp) {
		
		case "가위보", "바위가위", "보바위" :
			System.out.println(user1 + "님 승리");
			break;
		
		case "보가위", "가위바위", "바위보" :
			System.out.println(user2 + "님 승리");
			break;
		
		case "가위가위", "보보", "바위바위" :
			System.out.println("무승부");
		break;
		default:
			System.out.println("다시 입력");
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
