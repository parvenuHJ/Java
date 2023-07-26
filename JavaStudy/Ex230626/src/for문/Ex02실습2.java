package for문;

import java.util.Scanner;

public class Ex02실습2 {

	public static void main(String[] args) {

		//100 이하의 두 개의 정수를 입력받아 작은수부터 큰수 까지 차례대로 출력하는 프로그램!
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째정수 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째정수 : ");
		int n2 = sc.nextInt();
		
		for(int n4 = n1 ; n4<=n2 ; n4++) {
			System.out.print(n4 + " ");
			
		}
		
		
	}

}
