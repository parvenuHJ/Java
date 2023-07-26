package while문;

import java.util.Scanner;

public class Ex08실습8_계산기_정답 {

	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
		
		while (true) {
			System.out.print("첫 번째 정수를 입력하세요 >>");
			int num1 = sc.nextInt();
			System.out.print("첫 번째 정수를 입력하세요 >>");
			int num2 = sc.nextInt();
			System.out.print("[1]더하기 [2]빼기 >>");
			int num3 = sc.nextInt();
			
			if ( num3 == 1) {
				//더하기
				System.out.println("더하기 연산 결과는 " +(num1+num2)+ "입니다.");
			}else {
				//빼기
				System.out.println("빼기 연산 결과는 " +(num1-num2)+ "입니다.");
			}
			System.out.print("다시 실행하시겠습니까? (Y/N) >>"  );
			String ans = sc.next();
			
			if (ans.equals("N")) {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
		
		
	}

}
