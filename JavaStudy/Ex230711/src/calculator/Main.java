package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 도형의 넓이를 계산해주는 프로그램
		// 다양한 도형을 확장할 수 있게 설계
		Scanner sc = new Scanner(System.in);
		
		// 사각형, 삼각형, 원
		// 계산기 객체 생성
		AreaCalculator cal = new AreaCalculator();
		Figure f = new Figure();
		
		
		while(true) {
			System.out.print("[1]사각형 [2]삼각형 [3]원 [4]종료 >> ");
			int num = sc.nextInt();
			
			if(num ==1) {
				// 사각형 넓이
				System.out.print("가로 길이 : ");
				double width = sc.nextDouble();
				System.out.print("세로 길이 : ");
				double height = sc.nextDouble();
				
				f = new Rectangle(width, height);	
				
				
			}else if(num==2) {
				// 삼각형 넓이
				System.out.print("밑변 길이 : ");
				double width = sc.nextDouble();
				System.out.print("높이 길이 : ");
				double height = sc.nextDouble();
				
				f = new Triangle(width, height);	
				
			}else if(num==3) {
				// 원 넓이
				System.out.print("반지름 길이 : ");
				double radius = sc.nextDouble();
				
				f = new Circle(radius);
				
			}else {
				// 종료
				System.out.println("계산기 프로그램 종료");
				break;
			}
			double result = cal.calArea(f);
			System.out.println("넓이 : " + result);
			
			
		}
		
		
	}

}
