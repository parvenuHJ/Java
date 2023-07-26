package ex0621;

public class Ex07산술연산자2 {

	public static void main(String[] args) {

		
		// 정수 연산 문자  - > 문자 ( 자동 형변환 )
		System.out.println(7 + 3 + "7"); // 앞쪽 부터 계산 7+3=10 (정수+정수=정수) , 정수(10)+문자 = 문자
		System.out.println(7 + "3" + 7); // 앞쪽부터계산 7+"3"(정수 +문자 = 문자) = "73"(문자), 문자("73") + 숫자(7) = "737"
		System.out.println("7" + 3 + 7); // "7"+3 = "73", "73" + 7 = "737"
		

		
		//문자 연산 문자 -> 문자
		String last_name = "김";
		String first_name = "훈종";
		System.out.println(last_name + first_name);  // l만 입력하고 자동완성(Ctrl + space) 하면 last_name 완성됨
		
		

		// 정수
		int a = 10;
		
		// 문자열
		String b = "9";
		
		System.out.println((a+b).getClass().getName()); // 외울필요는 없음 무슨 class인지, 무슨 Name인지 가져와라... java.lang 에 있는 String이라는 클래스입니다...
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
