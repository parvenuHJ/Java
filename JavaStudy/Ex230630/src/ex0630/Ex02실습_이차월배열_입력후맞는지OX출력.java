package ex0630;

import java.util.Scanner;

public class Ex02실습_이차월배열_입력후맞는지OX출력 {

	public static void main(String[] args) {

		// 다음과 같이 3행 5열 배열 answer을 만들고 다음과 같이 초기화 하세요
		
		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 3행 5열 이차원 배열 만들기  --> 이차원 배열 바로 초기화 할때 -> { {0행}, {1행}, {2행} } ;!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int [][] ans = { {4,5,4,1,2}, {0,0,0,0,0}, {10,20,30,20,20} };
		int [] input2 = new int [5];
		int sum = 0 ; // 정답이 맞았을 때 sum에다가 배점을 누적
		
	
	
		for(int i = 0; i < ans[1].length ; i++) {
			System.out.print(i+1 + "번째 답 >> ");
			int input = sc.nextInt();
			ans[1][i] = input;
			
			if(ans[1][i] == input) {
				input2[i] =ans[1][i];
			}
		}
		
		for(int i = 0 ; i < input2.length; i++) {
			if(input2[i] == ans[0][i]) {
				System.out.print("O\t");
				sum += ans[2][i];
				
			}else {
				System.out.print("X\t");
			}
		}
		System.out.print("\n총점 : " + sum + "점");
		

			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
