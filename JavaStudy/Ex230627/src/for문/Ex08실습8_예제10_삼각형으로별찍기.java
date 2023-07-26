package for문;

public class Ex08실습8_예제10_삼각형으로별찍기 {

	public static void main(String[] args) {

		for(int k = 1; k <=5 ; k++ ) {
			for(int i = 1; i <= k ; i++ ) {
				System.out.print("*");
		}System.out.println();
		}// k=1일때 * 하고 줄바꿈 / k=2일때 **하고 줄바꿈 / ...
	
	System.out.println("-----------------------");
		
		for( int y = 5 ; 1 <=y ; y--) {
			for( int x = 1 ; x <=y ; x++) {
				System.out.print("*");
		}System.out.println();
			//y=5일때 *****(x는 1부터 1일씩 증가) / y=4일때 ****
		}
	
		System.out.println("-----------------------");
		
//		//j=1일때 ....* / j=2일때 ...**
//		for (int j = 1 ; j <=5 ; j++) {
//			for(int k = 1 ; k <= (5-j); k++) {
//				System.out.print(" ");
//				for(int i = 1 ; i <=j ;  i++) {
//					System.out.print("*");
//				}System.out.println();
//				//내꺼 잘못입력
//			}
//		}
		System.out.println("-----------------------");
	
		// 오른차순 좌우대칭 별찍기 !!!!!!!!!!!!!!!!!!!!!!!!!!
		//정답
		
	
		// 공백출력
		for( int i = 1; i <= 4 ;  i++) {
			System.out.print(" ");
			
		}
		// 별출력
		for(int i = 1; i <=1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		
		System.out.println("-----------------------");
		
		// 공백출력 + 별출력 해서 다중for 문 구성해보기
		
		// for { for{ for {} } } 가 아니라 for { for {공백} for{별} } 이런식으로!!!!!!!!!!!!!!!
		for(int k = 1 ; k <= 5 ; k++) {
			// 공백출력
			for( int i = 1; i <= 5-k ;  i++) {
				System.out.print(" ");
				
			}
			// 별출력
			for(int i = 1; i <= k ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		


		for( int j = 1 ; j <=5 ; j++) {
			// 공백출력
			for(int i = 1 ; i <=(5-j) ; i++ ) {
				System.out.print(" ");
			}
			// 별출력
			for( int i = 1 ; i <=j ; i++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
