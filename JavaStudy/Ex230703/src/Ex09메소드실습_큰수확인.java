import java.util.Scanner;

public class Ex09메소드실습_큰수확인 {

	public static void main(String[] args) {

		
		// 2개의 양수를 입력받아서 더 큰수를 반환하기
		// 만약 두 숫자가 같다면 0을 반환
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		
		int result = lagerNumbers(a,b);
		System.out.println("큰 수 확인 : " + result);
		
		
	}

	public static int lagerNumbers(int aaa, int bbb) { // 메소드 변수이름은 다른 것으로 써도 됌

		if(aaa == bbb) {
			return 0;
		}else {
			return aaa > bbb ? aaa : bbb ;
			// 삼항 연산자 -> 조건식 ? true일때 : false일때;
		}
				
	}

	
	
}
