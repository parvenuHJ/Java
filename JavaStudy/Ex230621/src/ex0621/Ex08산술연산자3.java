package ex0621;

import java.util.Scanner;

public class Ex08산술연산자3 {

	public static void main(String[] args) {

		
		// 정수 입력받기 -> Scanner
		
		Scanner sc = new Scanner(System.in);
	
		// 정수를 입력 받는다 : nextInt();
		
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt(); // sc.next 는 문자열입력  int를 먼저써서, sc. 을 입력하면 next 보다 nextInt가 먼저 뜬다.
				
				
				
		// 연산 우선순위 () ->  */  -> +-
		
		// 첫번째 방법 (나머지 이용하기) : System.out.println (num - (num%100) );
		

		// 두번째 방법 (몫 이용하기) : System.out.println( (num/100) * 100 );
		
		// 정수 + 문자 ("00") 이용하기
		//System.out.println(num/100 + "00");
		
		// 강제 형변환 이용하기
		System.out.println((int)(num*0.01) * 100);
		
//		 
//		
//		double num2 = num / 100;
//		
//		int num3 = (int) num2;
//		
//
//		System.out.println(num3 *100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
