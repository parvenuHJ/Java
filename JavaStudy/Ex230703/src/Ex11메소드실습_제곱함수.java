import java.util.Scanner;

public class Ex11메소드실습_제곱함수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int base = sc.nextInt();
		System.out.print("제곱수 입력 >> ");
		int n = sc.nextInt();
		
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
		
		
		
	}

	public static int powerN(int base, int n) {
		
		
		return (int)Math.pow(base,n);
	}
	

}
