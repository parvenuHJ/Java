package chapter2;

import java.util.Scanner;

public class Q3_good {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("급액을 입력하시오 >>");
		int money = sc.nextInt();
			System.out.println("오만원권" + money/50000 + "매");
			money%=50000;
			System.out.println("만원권" + money/10000 + "매");
			money%=10000;
			System.out.println("천원권" + money/1000 + "매");
			money%=1000;
			System.out.println("백원" + money/100 + "개");
			money%=100;
			System.out.println("오십원" + money/50 + "개");
			money%=50;
			System.out.println("십원" + money/10+ "개");
			money%=10;
			System.out.println("일원" + money + "개");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
