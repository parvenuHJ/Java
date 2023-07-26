package ex0621;

public class Ex03자료형 {

	public static void main(String[] args) {
		
		// 줄 이동 단축키 : ALt + 방향키
		// 줄 복사 단축키 : Ctrl + Alt + 방향키 
		// 줄 삭제 단축키 : Ctrl + D 
		
		// 1. 논리형
		// boolean : 1bit or 1byte (1 or 0)
		// 참  혹은 거짓 ( true or false)
		
		
		boolean isHot = false;
		System.out.println(isHot);
		
		// 2. 문자형
		// char : 2byte -> 2의 16승 (1byte - 2의 8승)
		char grade = 'A';
		char num = '4';
		char slash = '\'' ; // '\'를 넣을 수 없음 \n = enter \t = tab
						// '\'를 넣을려면 '\'' 따음표를 하나 더 넣어 주면 됨
		
		// 3. 정수형
		// byte : 1byte -> 8bit -> 2^8 - 256가지 (-128 ~127)
		byte age = 127;
		//byte age2 = 128; 은 오류
		
		//short : 2byte - 16bit - 2^16 = 65536 가지
		// int : 4byte -> 정수형의 대표 데이터 타입
		// long : 8byte
		short money = 32767;
		
		int account = 212212122;
		
		long population = 5000000000L; // 뒤에 L을 안붙이면 그냥 int로만 인식, l을 붙여서 long으로 인식 시켜줌
		
		// 4. 실수형 -> 소수점 존재
		// float: 4byte
		// double : 8byte
		
		float height = (float)164.4; // 1. 앞에 (float) -> 형 변환 , 2. 뒤에 f,F 붙여주기
		
		double pi = 3.141592;
		
		// 논리형 : boolean
		// 문자형 : char
		// 정수형 : byte short int long
		// 실수형 : float double
		
		
		// 레퍼런스 타입
		// 문자열을 담는 데이터 타입 
		// String 
		String name = "김훈종";
		
		System.out.println(name);
		

	}

}
