import java.util.Scanner;

public class Ex10메소드실습_절대값함수 {

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
		
		// Math 클래스 abs() 함수 사용
		// 절대값 함수!!- 절대값 (absolute - abs) --> math.abs( 변환할 수 ) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int a = Math.abs(10-n1);
		int b = Math.abs(10-n2);
		// 2. 10으로부터 더 가까운 수 구하기
		if(a == b) {
			return 0;
		}else {
			return a > b ? n2 : n1;
		}
		
		
	}
}
