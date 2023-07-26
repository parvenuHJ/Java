package while문;

import java.util.Scanner;

public class Ex05실습5_dowhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//	
//		do {
//			System.out.print(">");
//			int num = sc.nextInt();
//		}while(num!=0); 
		// num이 0이 아니라면 계속 실행  , num 이라는 값이 do { num } 처럼 이 중괄호 안에만 선언되어있으면, {} 안에서만 가능됨!!!!!!!!!!
		//따라서 오류남
				
		
		
		int num; // 여기서 전체 범위에서 num 의 변수를 선언하고
		
		do {
			System.out.print(">");
			num = sc.nextInt();
		}while (num!=0);
		System.out.println("프로그램 종료");
		
	}

}
