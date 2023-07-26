package ex0621;

public class Ex04형변환1 {

	public static void main(String[] args) {

		// 작은걸 큰곳에 넣을떄
		// 자동 형변환  double b = (double)a 를 안해도 자동으로 바뀌니까
		// 묵시적 형변환
		// int (4byte) -> double(8byte)
		int a = 3; 
		double b =a;
		
		System.out.println("a값 : " + a);
		
		System.out.println("b값 : " + b);
		
		
		
		//큰걸 작은곳에 넣을때
		//강제 형변환
		// 명시적 형변환 (int) 이런 식으로 (자료형)을 꼭 명시 해줘야함.
		//double (8byte) -> int (4byte)
		
		double c = 7.1;
		
		int d = (int)c;

		System.out.println("D값 : " + d);
		
		//소숫점 이 잘려서 강제 형변환됨
		
	}

}
