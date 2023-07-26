package ex0621;

public class Ex05형변환2 {

	public static void main(String[] args) {

		// 정수형 : byte, int
		
		
		// byte의 범위
		byte num1 = 3; // byte -> -128~127
		
		int num2 = 8000;
		
		num1 = (byte)num2;
		
		System.out.println(num1);
		
		//값이 양의 방향으로 넘어가는 현상 : overflow
		
		
		
		
		int num3 = -129;
		
		num1 = (byte)num3;
		
		System.out.println(num1);
		
		//값이 음의 방향으로 넘어가는 현상 : underflow
		
		
		
		// int(4byte) , short (2byte)
		//              -32768 ~ 32767
		int num4 = 30000;
		short num5 = 0;
		
		//short int  (숫자 자체는 30000이라서 범위안에는 들어가는데, 오류나는 이유 : 타입이 달라서)
		// num5 = num4; - 오류
		
		num5 = (short)num4;
		 
		// 자료형이 같을 때 ( int 와 short) 는 작은것을 큰곳에 넣을때 자동 형변환이 안됨.
		// 들어있는 값과는 상관없음 -> 자료형이 상관이 있다. -> 강제 형변환
		
		
		
		
		
		
	}

}
