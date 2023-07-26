package ex0621;

import java.util.Scanner;

public class Ex09산술연산자4 {

	public static void main(String[] args) {

		
		// 내가 한 답 (틀림)
//		Scanner sc = new Scanner (System.in);
//	
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		
//		System.out.print("첫 번째 정수 입력 : " + num1);
//		System.out.print("두 번쨰 정수 입력 : " + num2);
//		
//		System.out.println("두 수의 더하기 : " + num1 + num2);
//		System.out.println("두 수의 빼기 : " + num1 - num2);
//		System.out.println("두 수의 곱하기 : " + num1 * num2);
//		System.out.println("두 수의 나누기(몫) : " + num1 / num2);
//		
		
		
		Scanner sc = new Scanner (System.in);
		
		int a; // 쓸데 없는 코드를 썼을떄도 데드코드 (노란선)이 뜸
		
		
		System.out.print("첫 번쨰 정수 입력 : " );
		int num1 = sc.nextInt();
		
		System.out.print("두 번쨰 정수 입력 : " );
		int num2 = sc.nextInt();
		
		
		// System.out.println(" 두 수의 더하기 : " + num1 + num2); 이렇게만하면 문자 + 숫자 + 숫자라서 안됨 중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("두 수의 더하기 : " +(num1 + num2));
		System.out.println("두 수의 빼기 : " +(num1 - num2));
		System.out.println("두 수의 곱하기 : " +(num1 * num2));
		System.out.println("두 수의 나누기 : " +(num1 / num2));
		
		
	
	
		sc.close(); // sc를 닫아주면 sc의 노란선이 사라짐 
		
		
	
		
		
		
		
		
		
		
	}

}
