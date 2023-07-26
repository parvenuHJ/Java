import java.util.Scanner;

public class Ex04메소드실습 {

	public static void main(String[] args) {

		// 정수 num1, num2  문자열 s 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 : ");
		String s = sc.next();
		
		cal(num1, num2, s); // 만약 여기서 메소드 안만들고 그냥 cal 만 적었을때, 오류난거 더블클릭하면 알아서 메소드 만들어줌
							// 순서도 중요!!! (int int string)의 순서로 메소드를 만들었으니까
	}
	public static void cal(int num1, int num2, String s) {
		
		//s가 +라면 num1 + num2 출력
		//s가 -라면 num1 - num2 출력
		//s가 *라면 num1 * num2 출력
		//s가 /라면 num1 / num2 출력
		if(s.equals("+")) {
			System.out.println(num1 + num2);
		}else if(s.equals("-")) {
			System.out.println(num1 - num2);
		}else if(s.equals("*")) {
			System.out.println(num1 * num2);
		}else if(s.equals("/")) {
			System.out.println(num1 / num2);
		}
		
	}

}
