package for문;

import java.util.Scanner;

public class Ex02실습2_정답 {

	public static void main(String[] args) {

		//100 이하의 두 개의 정수를 입력받아 작은수부터 큰수 까지 차례대로 출력하는 프로그램!
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째정수 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째정수 : ");
		int n2 = sc.nextInt();
		
		//작은 정수부터 큰 정수까지 1씩 증가하는 프로그램 만들기
		if(n1 < n2) {
			for(int i = n1; i<=n2 ; i++) {
				System.out.print(i + " ");
			}
		}else {
			for(int i = n2; i<=n1 ; i++) {
				System.out.print(i + " ");
			
		}
		}
		

			
		}
		
		
	}

