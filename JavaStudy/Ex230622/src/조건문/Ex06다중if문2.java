package 조건문;

import java.util.Scanner;

public class Ex06다중if문2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		
		System.out.print("학년 입력 : ");
		
		int grade = sc.nextInt();
		
		if ( age <= 100 ) {
			
			if ( grade != 4) {
				
				if (  10 <= age && age < 20 ) {
					
					System.out.println("10대");
					
				}else if (20 <= age && age < 30 ) {
					
					
					System.out.println("20대");
					
				}else if ( 30 <= age && age < 40 ) {
					
					System.out.println(age + "는 30대");
					
				}else {
					
					System.out.println("40대 이상입니다. ");
				}
			}else {
				
				System.out.println("4학년은 무조건 불합격이므로 나이를 불문하고 불합격");
			}
			
			}else {
				
				System.out.println("100세 초과입니다");
			}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
