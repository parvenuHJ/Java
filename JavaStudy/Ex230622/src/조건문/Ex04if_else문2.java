package 조건문;

import java.util.Scanner;

public class Ex04if_else문2 {

	public static void main(String[] args) {

		
		//한 정수를 입력받아 1의 자리에서 반올림 한 값 출력하기!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("반올림 수 : ");
		
		if(num%10 <= 4) {
			//버림
			System.out.println(num - num%10);
			
		}else {
			
			//올림
			System.out.println(num - num%10 + 10 );
		}
		
		
		
		// 나의 답 (맞음)
//		if (num%10 >4) {
//			
//			System.out.println("반올림 수 : " + (num + 10-num%10));
//			
//		}else {
//			
//			System.out.println("반올림 수 : " + (num - num%10));
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
