package while문;

import java.util.Scanner;

public class Ex02실습2 {

	public static void main(String[] args) {

		// 반복되는 코드
		// 숫자입력 : " + sc.nextInt()
		// 누적결과 : " + 누적합

		Scanner sc = new Scanner(System.in);

		int sum = 0; // 누적합을 담을 변수

		while (true) {

			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			if (num != -1) {

				sum += num;

				System.out.println("누적결과 : " + sum);

			} else {

				sum += num;

				System.out.println("누적결과 : " + sum + "\n종료되었습니다."); // \n은 문자열 안에 사용해야함!!!!!!!!!!!!!!!

				break;

			}
		}

	}

}
