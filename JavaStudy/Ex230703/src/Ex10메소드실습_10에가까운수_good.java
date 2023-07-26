import java.util.Scanner;

public class Ex10메소드실습_10에가까운수_good {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int n2 = sc.nextInt();
		
		int result = nearTen(n1,n2);
		
		System.out.println("10에 가까운수  : " + result);

	}

	public static int nearTen(int n1, int n2) {
		
		// 1. 어떤 수가 10보다 큰지 모르기 때문에 우선 10을 기준으로 차이값 구하기
		int a = 10 - n1;
		int b = 10 - n2;
		
		if(a < 0 ) {
			a *= -1;
		}
		if(b < 0) {
			b *= -1;
		}
		
		// 2. 10으로부터 더 가까운 수 구하기
		if(a == b) {
			return 0;
		}else {
			return a > b ? n2 : n1;
		}
		
		
	}

	
}
