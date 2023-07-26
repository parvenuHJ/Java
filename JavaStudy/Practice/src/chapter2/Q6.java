package chapter2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >>");
		int num = sc.nextInt();
		
		if (num>=10 && num%10%3 == 0) {
			System.out.println("박수 짝짝");
		}else if (num%3 == 0) {
			
			System.out.println("박수 짝");
		}
	}

}
