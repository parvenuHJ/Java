package buildup;

import java.util.Scanner;

public class Ex03ScannerClose {

	public static void main(String[] args) {

		
		// Scanner 사용해서 달러를 입력했을때 우리나라 돈으로 환전해주는 프로그램
		// while 문 사용해서 계속 입력받다가 -1을 입력하면 탈출!
		// 달러 입력 : 2
		// 2600원 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
	
		
			System.out.print("달러 입력 : ");
			int dollar = sc.nextInt();
			if(dollar == -1) {
				System.out.println("종료");
				break;
			}else {
				System.out.println(dollar * 1300 +"원 입니다.");
			}
			
			
			
		
		
		}
		
		sc.close(); // Scanner 닫아주기
		
		
		
		
		
	}

}
