package while문;

import java.util.Scanner;

public class Ex01실습1 {

	public static void main(String[] args) {

		// while 문
		// while(조건식){
		//	반복할 실행 문장;
		//}
		
		Scanner sc = new Scanner(System.in);
		
		//while 조건문에 (true) --- >> 무한입력
		while (true) {
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if (num > 10) {
				System.out.println("종료되었습니다.");
				break; // break 써야 반복 끝남!!!!!!!!!
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
