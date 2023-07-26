package for문;

import java.util.Random;
import java.util.Scanner;

public class Ex09_랜덤함수_랜덤게임 {

	public static void main(String[] args) {

//		랜덤으로 정수 2개를 뽑기
//		두 수의 합을 맞추면 "SUCCESS" 출력
//		두 수의 합을 틀리면 "FAIL.." 출력, (실패변수(fail) +1 카운트 <-while문 사용, 기회는 4번까지로 설정)
		
		Random rd = new Random();  //random 기능 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		Scanner sc = new Scanner(System.in);
		
		int fail = 0;  // 실패했을때 +1 씩 해줄 변수
		while(fail < 5) {
			
			int num1 = rd.nextInt(10) + 1; // nextInt(10) : 0~9까지의 10개의 수만 출력 , 1~10 까지는 nextInt(10)+1 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			int num2 = rd.nextInt(10) + 1;
			
			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();
			
			if (answer == num1+num2) {
				System.out.println("SUCCESS");
			}else {
				fail++;
				System.out.println("Fail...");
			}
			
		}
		System.out.println("Game Over!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
