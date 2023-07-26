package while문;

import java.util.Scanner;

public class Ex06실습6_몸무게다이어트실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pw ; // 현재몸무게
		int fw ; // 목표몸무게
		int num = 1;// 주차 카운트
		int wei; //주차별 감량 몸무게
		System.out.print("현재몸무게 : ");
		pw = sc.nextInt();
		System.out.print("목표몸무게 : " );
		fw = sc.nextInt();
	
		do {
			
			System.out.print(num++ + "주차 감량 몸무게: "); // !!!!!!!!!!!!!!!!!!!!!!!!!!
			wei = sc.nextInt();
			pw -= wei;
			
		}while(pw >= fw); // 현재 몸무게 >= 목표 몸무게 일때 계속 감량몸무게를 빼야한다(do문 실행) !!!!!!!!!
							//말로 한번 적어보기!! 현재가 목표보다 크면 계속 do문 실행, 현재<목표 이면 그만 따라서 while(현재>목표) - > 계속 do 실행!!!
		
		System.out.println(pw + "kg달성!! 축하합니다");
		
	}

}
