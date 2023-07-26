
public class Ex03논리연산자 {

	public static void main(String[] args) {

		// 논리 연산자
		// 부정 연산자 (NOT) -> !
		// 앞선 값의 반대값을 나타내고 싶을 때 사용
		
		boolean check = true;
		
		System.out.println(!check);
		
		int a = 5;
		int b = 13;
		
		System.out.println(!(a > b)); // !(false) = true
		
		
		// AND 연산자 (곱 연산자) -> &&
		System.out.println( (10>3) && (5 < 2));		
		System.out.println( (10 <= 3) && (5 < 2));	// 10 <= 3 자체가 이미 false 여서 5<2 는 계산할 필요가 없어서 DEAD code 로 뜬다.
		System.out.println( (10!=3) && (5 < 2));	
		
		
		// OR 연산자 (합 연산자) -> ||
		
		System.out.println( (10!=3) || (5 < 2));	// 앞의 명제가 이미 true 여서 뒤에는 데드코드
		System.out.println( (10<=3) || (5 > 2));	
		System.out.println( (10>3)  || (5 < 2));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
