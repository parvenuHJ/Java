package ex0621;

public class Ex06산술연산자1 {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 3;
		
		// 출력문을 사용해서 num1과 num2의 +, -, *, /, %
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2); // 몫(/)은 정수/정수 에만 나타남
		System.out.println(num1 % num2);

		// ctrl + alt 방향키  - > 줄 복사 이용해서 하면 편함
		
		
		double num3 = 7.0;
		double num4 = 3.0;
		
		// 정수 연산 정수 -> 정수
		System.out.println(num1 / num2); // 2 
		
		// 정수 연산 실수 -> 실수
		System.out.println(num1 / num4); // 2.3333...
		
		// 실수 연산 정수 -> 실수
		System.out.println(num3 / num2); // 2.3333...
		
		
	}

}
