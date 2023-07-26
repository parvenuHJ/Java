package buildup;

public class Ex01Divide0 {

	public static void main(String[] args) {

		// 자바에서의 오류(=예외상황)
		
		// 1. 컴파일 오류(=예외상황) : 문법적인 오류
		System.out.println("컴파일 오류");
//		System.out.printl();
//		System.out.println()
//		System.out.println(" 괄호하나가 없다던가 ..등등);
		
		// 2. 런타임 오류 : 문법적인 오류는 아니고 실행 시에 나타나는 오류
//		System.out.println(100/0); -> 오류 : java.lang 클래스에 들어있는 (ArithmeticException) 실행되고 다음코드가 실행되지않음
		
		// 예외처리 문법
		// try{
		// 예외 상황이 생길 것 같은 문법
		// }catch(Exception e){
		// 예외 상황을 잡아주는 역할, 표시해주는 역할
		// }
		
		try {
			System.out.println(100 / 0);
		}catch(ArithmeticException e) {	// ArithmeticException - 데이터타입 , e - 이름
			System.out.println("0으로 나눴네요~");
		}
		
		
		
		System.out.println("다음 코드");
		
		
		
		
		
		
		
		
		
		
		
	}

}
