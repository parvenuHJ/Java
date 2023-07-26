import java.util.Scanner;

public class Q30_세자리수세자리수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int n3 = num1 * (num2 %10);
		
		int n4 = num1 * (num2 %100 /10);
		
		int n5 = num1 * (num2 /100 );
		
		int n6 = num1 * num2;
		
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		
	}

}
