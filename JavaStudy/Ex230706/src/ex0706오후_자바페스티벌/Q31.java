package ex0706오후_자바페스티벌;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {

		// 1. 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 사용자한테 o,x 문자열 입력받기
		System.out.print("ox입력 >> ");
		String ox = sc.next();
		
		// 3. ooooxoo 분리 -->.split("")
		// 배열에다가 저장하기
		String [] array = ox.split("");
		
		
		// 4. 배열에 들어가 있는 값 o , x 판단
		// 점수 :  변하는 수
		// 총합을 받을 변수 생성
		// 점수를 변수로 하나 만들어서 --> +1씩 증가하거나, 0부터 시작하는 경우가 있음
		// +1씩 증가해서 누적되는 경우는 o
		// 0부터 다시 시작하는 순간 -> x를 만났을때
		
		int score = 0;
		int sum = 0;
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i].equals("o")) {
				score++;
				sum += score;
			}else {
				score = 0;
			}
			
		}
		System.out.println("총점 : " + sum);
		
		
		
	}

}
