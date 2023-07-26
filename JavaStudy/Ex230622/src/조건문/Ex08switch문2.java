package 조건문;

import java.util.Scanner;

public class Ex08switch문2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇월인가요 : ");
		
		int month = sc.nextInt();
		
		switch ( month ) {
		
			case 12, 1, 2 :
				System.out.println("겨울");
				break;
				
			case 3, 4, 5 :
				System.out.println("봄");
				break;
		
			case 6, 7, 8 :
				System.out.println("여름");
			break;
			
			case 9, 10, 11 :
				System.out.println("가을");
			break;
			default:
			System.out.println("다시 입력");
		
		}
		
//			case 12 :
//				System.out.println("겨울");
//				break;
//			case 1 :
//				System.out.println("겨울");
//				break;
//			case 2 :
//				System.out.println("겨울");
//				break;
//			case 3 :
//				System.out.println("봄");
//				break;
//			case 4 :
//				System.out.println("봄");
//				break;
//			case 5 :
//				System.out.println("봄");
//				break;
//			case 6 :
//				System.out.println("여름");
//				break;
//			case 7 :
//				System.out.println("여름");
//				break;
//			case 8 :
//				System.out.println("여름");
//				break;
//			case 9 :
//				System.out.println("가을");
//				break;
//			case 10 :
//				System.out.println("가을");
//				break;
//			case 11 :
//				System.out.println("가을");
//				default:
//				System.out.println("다시 입력");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
