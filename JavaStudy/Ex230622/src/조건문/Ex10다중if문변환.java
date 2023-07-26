package 조건문;

import java.util.Scanner;

public class Ex10다중if문변환 {

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
		
		
		//int a = 2; 
		//int b = 2; 
//		if (a == b) 는 가능
		
		//String은 기본데이터 타입 (char, int 등 보라색으로 변함)이 아니라 레퍼런스 타입이라서 rsp1 == rsp2 가 안됨!!!!!!!!!!!!!!!!!!!!!!!!!!
		//Scanner , String 등등 검정색은 다 레퍼런스 타입
		
		//레퍼런스 타입으로 A1==A2 표현할때는 A1.equals(A2) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		if(rsp1.equals(rsp2)) {
			
			System.out.println("무승부");
		}else if(rsp1.equals("가위")) { // 이 중괄호가 어디까지 적용되어 있는지 보려면 중괄호 뒤에 더블클릭 or 중괄호 클릭
			
			if(rsp2.equals("바위")) {
				System.out.println(user2 + "님 승리");
			}else if(rsp1.equals("보")) {
				System.out.println(user1 + "님 승리");
			}
		}else if(rsp1.equals("바위")) {
			
			if(rsp2.equals("가위")) {
				System.out.println(user1 +"님 승리");
			}else { //가위 바위 보 중에서만 낸다고 가정할떄....축약가능
				System.out.println(user2 +"님 승리");
			}
		}else if(rsp1.equals("보")) {
			if(rsp2.equals("바위")) {
				System.out.println(user1 +"님 승리");
			}else { 
				System.out.println(user2 +"님 승리");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
