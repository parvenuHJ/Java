
public class Ex03메소드1 {

	public static void main(String[] args) {
		
		// 메소드 호출
		// 메소드 이름(매개변수)
		sum(5, 6);
		sub(10,5);
		mult(10,2);
		div(10,2); // -> 아무것도 안뜸 ( 이 메소드에는 출력하는 기능 x , 반환하는 기능만 있음)
		System.out.println("---------");
		System.out.println(div(10,2));
		System.out.println(div(10,2)+10); // 응용가능
		
		
	}
	
	// 메소드 만들기  -> main 메소드 밖에 만든다!!!!!!!!!!!
	
	// 1. 접근제한자 - public : 내/외부에서 접근이 가능한 제한자
	// 2. static - 저장위치
	// 3. 리턴타입 (리턴타입이 없는 경우 - void 사용)
	// 4. 메소드이름(매개변수) 
	
	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	// 이 sum 이라는 메소드를 만들었는데, 이 메소드를 호출하려면 다시 위의 main {} 안에서 호출해야함!!!!!!!!!!!!!!!!!
	
//	public static int sum2() {
//		return 0; // int는 {} 안에 아무것도 안적으면 에러 -> 에러보기싫으면 return 0; 그냥 적어주면 에러없어짐
//	}
	
	public static void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	public static void mult(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static int div(int num1, int num2) {
		return num1/num2;
	}
	
	
	
	
	
	
	
	

}
