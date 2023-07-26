package ex0621;

import java.util.Scanner;


public class Ex00입력 {

	public static void main(String[] args) {
		
		// 키보드를 통해서 (콘솔창을 통해서) 데이터를 입력하기
		// Scanner

		// import : 외부에 있는 도구(라이브러리)를 사용하기 위해 설정
		// 문자 완성 후 Ctrl + Space 눌러서 자동완성하기
		// sc : Scanner의 별명 (sc = Scanner)
		Scanner sc = new Scanner(System.in);
		
		// 콘솔창을 통해서 정수 받아오기
		// sc 인에 있는 기능을 사용하자 -> .
		
		int num = sc.nextInt();
		
		System.out.print("입력한 값 : " + num);
	}

}
