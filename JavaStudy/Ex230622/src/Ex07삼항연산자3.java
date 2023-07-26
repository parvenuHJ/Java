import java.util.Scanner;

public class Ex07삼항연산자3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		//1
		//int result = num1 > num2 ? num1 - num2 : (num1 - num2)*-1 ;
		//System.out.println("두 수의 차 : " + result );
		
		
		//2
		System.out.println("두 수의 차 : " + (num1 > num2 ? num1 - num2 : (num1 - num2)*-1) ); // "문자" +  (연산) <- (연산)을 먼저 계산하라고 ()사용
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
