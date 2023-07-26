package buildup;

import java.util.Scanner;

public class Ex02ArrayOut {

	public static void main(String[] args) {

		int [] array = {1, 2, 3};
		
		
		try {
			// 오류가 발생하는 처음 (100 / 0) 코드만 실행되고 아래 코드는 넘어가버림
			System.out.println(100 / 0); // 만약에 이 코드가 DB랑 Connection 하는 코드였다면
			System.out.println(array[3]);
			
			System.out.println("DB통로 닫아주기"); // DB랑 연결을 끊어주는 코드가 실행이 안되어버림
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 번호가 잘못되었습니다~ ");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눴습니다~");
		}finally {
			System.out.println("try문 안에서 예외상황(오류)이 일어나든, 일어나지않든 fianlly {} 의 코드는 무조건 실행시키는 문법");
		}
		System.out.println("다음코드~");
		
		
		
		
		
		System.out.println("===================================================================");
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수입력 : ");
			int a = sc.nextInt();	//이때 여기서 문자열을 입력하는 예외상황 ->(InputMismatchException)
			System.out.println(100 / 0);
			System.out.println(array[3]);
						
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 번호가 잘못되었습니다~ ");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눴습니다~");
		}catch(Exception e) {
			e.printStackTrace();	// 어떤 예외상황이 발생했는지 콘솔창에 출력해주는 메소드!
									// 보통 위에 있는 ArrayIndexOutOfBoundsException, ArithmeticException 등등 
									// 내가 무슨 오류가 날지 안다면 적어주지만, 
									// 보통 printStackTrace(); 만 적어서 오류를 찾아낸다.
		}
		System.out.println("다음코드~");
		
		
		
		
		
		
		
		
		
		
		
	}

}
