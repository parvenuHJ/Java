package for문;

import java.util.Scanner;

public class Ex03실습3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단과 곱해지는 수 입력받아서 구구단 작성\n단 입력 : ");
		int dan = sc.nextInt();
		System.out.print("곱해지는 수 입력 : ");
		int mult = sc.nextInt();
		
		for (int i = 1 ; i<=mult ; i++ ) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
	}

}
