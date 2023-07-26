package 조건문;

import java.util.Scanner;

public class Ex05다중if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		
		int grade = sc.nextInt();
		
		if (grade >= 90) {
			
			System.out.println("A학점");
			
		}else if (grade >= 80){ // (grade >= 80 && grade < 90) 에서 && 생략가능 위 조건문에서 이미 걸러짐.
			
			System.out.println("B학점");
			
		}else if (grade >= 70 ){
			
			System.out.println("C학점");
			
		}else {
			
			System.out.println("재수강");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
