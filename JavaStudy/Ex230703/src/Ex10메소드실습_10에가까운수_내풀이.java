import java.util.Scanner;

public class Ex10메소드실습_10에가까운수_내풀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int n2 = sc.nextInt();
		
		int result = nearTen(n1,n2);
		
		System.out.println("10에 가까운수  : " + result);
		
		
	}

	public static int nearTen(int a, int b) {
		int m = 10 - a;
		int n = 10 - b;
		
		if (m < 0 && n < 0) {
			m = -1 * m;
			n = -1 * n;
		}else if ( m < 0 & n > 0) {
			m = -1 * m;
		}else if (m > 0 && n < 0) {
			n = -1 * n;
		}
		
		if (m == n) {
			return 0;
		
		}else {
			return m > n? b : a;
		}
			
			
			
	}
	
	
	

}
