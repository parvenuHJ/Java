package chapter2;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.print("금액을 입력 >> ");
		int money = sc.nextInt();
		int r1_money = 0;
		int fiveman = 0;
		int fiveman_r = 0;
		int oneman = 0;
		int oneman_r = 0;
		
		
		
		if (money >= 50000) {
			fiveman_r = money / 50000 ;
			fiveman += fiveman_r;
			System.out.println("오만원권 "+ fiveman + "매");
			r1_money = money - 50000*fiveman;
			if (r1_money >=10000) {
				oneman_r = r1_money/10000;
				oneman += oneman_r;
				System.out.println("만원권 "+ oneman + "매");
				
			}
				
			}
			
		}
		
		
	}


