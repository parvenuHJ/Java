package ex0628;

import java.util.Scanner;

public class Ex06실습4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 5칸 짜리 배열 생성
		int[] array = new int[5];
		
		// 5개 점수 입력 받기  -> 배열에 차례대로 담기
		for( int i = 0 ; i < array.length ; i++ ) {
			System.out.print(i+1 + "번째 입력 : ");
			array[i] = sc.nextInt();                       // !!!!!!!!!!!!!!
			
		}
		
		
		// 입력 받은 값 출력
		System.out.print("입력된 점수 : ");
		for( int i = 0 ; i < array.length ; i++ ) {
			System.out.print(array[i] + " ");
		}
			
		
		// 최고 점수 출력
		int max = array[0];
		for( int i = 0 ; i < array.length ; i++ ) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.print("\n최고 점수 : " + max);
		
		// 최저 점수 출력
		int low = array[0];
		for( int i =0 ; i < array.length ; i++ ) {
			if(low > array[i]) {
				low = array[i];
			}
		}
		System.out.print("\n최저 점수 : " + low);
		
		// 점수 총합 출력
		int sum = 0;
		for( int i = 0 ; i < array.length ; i++ ) {
			sum += array[i];
		}
		System.out.print("\n점수 총합 : " + sum);
		
		// 점수 평균 출력
		
		System.out.print("\n점수 평균 : " + (double)sum/array.length);  //double 형 변환 -> 소숫점까지 출력, 총합/배열의 크기 = 평균!!!!!!!!!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
