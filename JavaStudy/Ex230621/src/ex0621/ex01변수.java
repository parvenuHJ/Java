package ex0621;

public class ex01변수 {

	public static void main(String[] args) {
		
		
		// 변수 선언, 할당(초기화), 재할당
		// 1. 변수 선언
		int num;
		
		// 2. 할당(초기화)
		// 이때 또 int num = 10; 하게되면 똑같은 num 을 또 만드는 것이기때문에 int(x)
		num = 10;
		System.out.println(num);
		
		// 3. 재할당
		num = 20;
		System.out.println(num);
		
		// 4. 선언하면서 초기화하기
		int num2 = 30;
		
		// 변수를 왜 사용해야하나?
		
		int num3 = 200;
		System.out.println(num3 + 2);
		System.out.println(num3 - 3);
		System.out.println(num3 / 3);
		
		
		
	}

}
