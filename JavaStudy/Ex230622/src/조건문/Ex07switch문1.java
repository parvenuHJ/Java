package 조건문;

import java.util.Scanner;

public class Ex07switch문1 {

	public static void main(String[] args) {

		// switch문
		// if문과 달리 조건식이 아닌 식(값)을 비교할 떄 사용
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("선풍기 풍속을 조걸합니다.");
//		System.out.println("1번 : 약, 2번 : 중, 3번 : 강");
		
		//또는 \n : enter 기능 을 이용해보면
		System.out.println("선풍기 풍속을 조절합니다. \n1번 : 약, 2번 : 중, 3번 : 강");

		System.out.print("선택한 번호 : ");
		
		int fan = sc.nextInt();
		
		switch (fan) {
		
			case 1 : 
				System.out.println("약한 바람이 나옵니다.");
				break;
			case 2 :
				System.out.println("중간 버람이 나옵니다.");
				break;
			case 3 : 
				System.out.println("강한 버람이 나옵니다.");
				break;
			default : 
				System.out.println("잘못 입력하셨습니다!");
		}
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
