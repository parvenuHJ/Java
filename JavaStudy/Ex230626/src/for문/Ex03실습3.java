package for문;

import java.util.Scanner;

public class Ex03실습3 {

	public static void main(String[] args) {

		//숫자 2개를 입력 받아 두 수 사이의 총합을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int n2 = sc.nextInt();
		
		int result = 0; //누적합을 담을 변수
		if (n1<=n2) {
			for(int i = n1 ; i<=n2 ; i++)
				result += i;
			System.out.println("총합 : " + result);
		}else {
			for(int i = n2 ; i<=n1 ; i++)
				result += i;
			System.out.println("총합 : " + result);
		}
			
		
		
	}

}
