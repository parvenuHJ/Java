package ex0628;

import java.util.Scanner;

public class Ex06_더간결하게 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[5];
		String score = ""; // 입력된 점수
		int max = 0; // 최고점수
		int min = 0; // 최저점수
		int sum = 0; // 총합
		for(int i = 0 ; i < array.length; i++) {
			System.out.print(i+1 + "번째 입력 : ");
			array[i] = sc.nextInt();
			score += array[i] + " ";
			sum += array[i];
			if(max < array[i]) {
				max = array[i];
			}else if(min > array[i]) {
				min = array[i];
			}
		}
			System.out.print("입력된 점수 : " + score );
			System.out.print("\n최고 점수: " + max);
			System.out.print("\n최저 점수: " + min);
			System.out.print("\n점수 총합: " + sum);
			System.out.print("\n점수 평균: " + sum/array.length);
			
		
		
		
		
		
		
		
		
		
		
	}

}
