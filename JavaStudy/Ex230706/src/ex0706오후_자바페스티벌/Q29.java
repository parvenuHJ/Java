package ex0706오후_자바페스티벌;

import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int n3 = num1 * (num2 %10);
		
		int n4 = num1 * (num2 %100 /10);
		
		int n5 = num1 * (num2 /100);
		
		int n6 = num1 * num2;
		
		System.out.println(n3);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
