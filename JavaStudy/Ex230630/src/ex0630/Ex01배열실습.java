package ex0630;

import java.util.Scanner;

public class Ex01배열실습 {

	public static void main(String[] args) {

		// 프로그램을 실행하면
		
		// [1] 회원가입 [2] 로그인 [3] 종료 >>
		// Scanner를 사용해서 정수 입력받기 -> menu변수에 저장
		// menu가 1이라면
		// " ====회원가입==== " 출력
		// menu가 2라면
		// " ====로그인==== " 출력
		// menu가 3이라면
		// " ====프로그램 종료==== " 출력 -> 프로그램 종료시키기

		Scanner sc = new Scanner(System.in);
		
		
		// 123선택 -> 반복 {1,2,3 이면(if) -> 입력된 출력문 출력} => 무한반복
		// 반복 { 123선택 -> 1,2,3 이면(if) -> 입력된 출력문 출력 , 3이면 break;} 
		
		while(true) {
			System.out.print("[1] 회원가입 [2] 로그인 [3] 종료 >> ");
			int menu = sc.nextInt();
			if(menu == 1) {
				System.out.println(" ====회원가입==== ");
			}else if(menu==2) {
				System.out.println(" ====로그인==== ");
			}else if(menu==3) {
				System.out.println(" ====프로그램 종료==== ");
				break;
			}else {
				System.out.println("다시입력해주세요");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// while 문 --> 오류
//		System.out.print("[1] 회원가입 [2] 로그인 [3] 종료 >> ");
//		int menu = sc.nextInt();
//		while(true) {
//			if(menu==1) {
//				System.out.println(" ====회원가입==== ");
//			}else if(menu==2) {
//				System.out.println(" ====로그인==== ");
//			}else {
//				System.out.println(" ====프로그램 종료==== ");
//				break;
//			}
//		}
		
		
		
		
		
		
		
		//do while 문 --> 오류
//		System.out.print("[1] 회원가입 [2] 로그인 [3] 종료 >> ");
//		int menu = sc.nextInt();
//		do {
//			if(menu==1) {
//				System.out.println(" ====회원가입==== ");
//			}else if(menu==2) {
//				System.out.println(" ====로그인==== ");
//			}else {
//				System.out.println(" ====프로그램 종료==== ");
//				break;
//			}
//			System.out.print("[1] 회원가입 [2] 로그인 [3] 종료 >> ");
//		}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	

}
