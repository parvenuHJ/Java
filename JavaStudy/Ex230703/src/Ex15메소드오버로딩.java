
public class Ex15메소드오버로딩 {

	public static void main(String[] args) {

		// 메소드 오버로딩 (중복정의) -> 메소드 이름이 같으면
		// 조건1 : 매개변수의 데이터타입으로 구분 가능
		// 조건2 : 매개변수의 갯수 로 구분 가능
		
		// 정수 + 정수 -> add
		add(1 , 2);
		
		
		// 실수 + 정수 -> add2
		add(1.5 , 1);
		
		
		// 실수 + 정수 + 실수 -> add3
		add(1.5 , 1 , 0.1);
		// 모두 add 로 통일 시켜도  --> 매개변수가 알맞는 걸로 알아서 구분해서 실행함!!!!!!!!!!!!!!
		
		
		
		
		
	}
	public static void add(int a, int b) {
		
		System.out.println(a + b);
	}
	
	public static void add(double a, int b) {
		
		System.out.println(a + b);
	}
	public static void add(double a, int b, double c) {
		
		System.out.println(a + b + c);
	}
	
	

}
