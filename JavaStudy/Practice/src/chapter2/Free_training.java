package chapter2;

import java.util.Scanner;

public class Free_training {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

////		1 byte = 8 bit
////				
////		논리형 : boolean
////		문자형 : 		char : 2^16= 65536
////		정수형 : byte short int long
////		실수형 : 			float double
//		
////		int a = 3; // 작은걸
////		double b = a; // 큰 곳에 넣을때
////		
////		System.out.println("a값 " + a);
////		System.out.println("b: " + b);
////		//알아서 형변환
////		
////		//큰것을 작은곳에
////		
////		double c = 7.1;
////		int d = (int)c; // 강제 형변환, 명시적 형변환 (int) 자료형을 꼭 명시 해야함
////		
////		System.out.println("d: " + d);
////		
//		
//
//		
//		//정수형 범위
//		//정수형 : byte short int long
//		// 		 2^8	2^16 2^32 2^64
//		//byte 범위->  2^8 = 256 > -128 ~ 127
//		//int 범위 -> 2^32 = 
//		byte num1 = 3;
//		
//		int num2 = 8000;
//		
//		num1 = (byte) num2;
//		
//		System.out.println(num1);
//		//64 가 출력되는 이유 : 8000%256 = 64
//		
//		//음수는 반대로
//		int num3 = -129;
//		
//		num1 = (byte)num3;
//		
//		System.out.println(num1);
//		
//		// 256 = -128~ 127, -127 -128 127 126 ... 127
//		//값이 음의 방향으로 넘어가는 현상 : overflow
//		
//		int num4 = 30000;
//		short num5 = 0;
//		
//		//정수형 : byte short int long
//		
//		num5 = (short)num4;
//		
//
//		System.out.println(num5);
//		//
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 456;
//		
//		System.out.println(num - num%100);
//		
//		
//		
//		System.out.print("num1 : ");
//		int nn1 = sc.nextInt();
//		System.out.print("num2 : ");
//		int nn2 = sc.nextInt();
//		
//		boolean result = nn1 > nn2 ? true : false;
//		
//		System.out.println(result);
//		
//		
//		
//		
//		
//		
//		
//		
//		
		
		
		
		
		
//		System.out.print("입력 : ");
//		int num = sc.nextInt();
//		
//		
//		
//		String result = num%2==0 ? "짝수" : "홀수";
//		
//		System.out.println(result);
//		
//		
		
		
//		System.out.print("입력 :");
//		int num = sc.nextInt();
//		if(num%10 <= 4) {
//			
//			System.out.println(num - num%10);
//		} else {
//			
//			System.out.println(num + 10 - num%10);
//		}
//		
		

		
		//가위바위보 게임 만들기
		
//		System.out.println("1번뭐냄 ");
//		String user1 = sc.next();
//		System.out.println("2번뭐냄");
//		String user2 = sc.next();
//		
//		if (user1.equals(user2)) {
//			
//			System.out.println("무승부");
//		}else if (user1.equals("가위")) {
//			if(user2.equals("바위"){
//				System.out.println("user2승리");
//			}else {
//				System.out.println("user1승리");
//		}else if (user1.equals("바위"){
//			if(user2.equals("))
//		}
//		
		
//		System.out.println("풍속조절 \n1번 : 약, 2번 : 중, 3번 : 강");
//		System.out.println("번호 : ");
//			
//		int fan = sc.nextInt();
//		
//		switch (fan ) {
//		
//		case 1 :
//			System.out.println("약");
//			break;
//		case 2 :
//			System.out.println("중");
//			break;
//		case 3 :
//			System.out.println("강");
//			break;
//			
//		default :
//			System.out.println("잘못입력");
//			
//			
//			
			
	
			
//		
//		
//
//		int sum = 0;
//		
//		while(true) {
//			
//			System.out.println("숫자입력 : ");
//			int num = sc.nextInt();
//			if (num !=-1) {
//				
//				sum +=num;
//				
//				System.out.println("누적결과 : " + sum);
//			}else {
//				
//				sum += num;
//				
//				System.out.println("누적결과 : " + sum +"\n종료되었습니다.");
//				
//				break;
//			}
//		}
//		
//		
		
//		int num2 = 0;
//		int num3 = 0;
//		
//		while(true) {
//			
//			System.out.print("숫자입력 : ");
//			int num = sc.nextInt();
//			
//			if (num%2 == 0) {
//				
//				num2 += 1;
//				System.out.println("짝수개수 : " + num2 +"\n홀수개수 : " + num3);
//			}else if (num%2 == 1) {
//				
//				num3 += 1;
//				System.out.println("짝수개수 : " + num2 +"\n홀수개수 : 2" + num3);
//			}else if (num == -1) {
//				
//				System.out.println("종료되었습니다.");
//				break;
//				
//			}
//			
//			
//			
//		}
//		
//		
		
		
		
		
		
		
		
	}
}