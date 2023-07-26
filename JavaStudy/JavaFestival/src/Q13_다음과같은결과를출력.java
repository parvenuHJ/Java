
public class Q13_다음과같은결과를출력 {

	public static void main(String[] args) {

		// 공백출력 + 별출력 해서 다중for 문 구성해보기
		
//				// for { for{ for {} } } 가 아니라 for { for {공백} for{별} } 이런식으로!!!!!!!!!!!!!!!
//				for(int k = 1 ; k <= 5 ; k++) {
//					// 공백출력
//					for( int i = 1; i <= 5-k ;  i++) {
//						System.out.print(" ");
//						
//					}
//					// 별출력
//					for(int i = 1; i <= k ; i++) {
//						System.out.print("*");
//					}
//					System.out.println();
//				}
		
		
		for(int k = 1; k<=5 ; k++) {
			
			// 공백출력
			for(int i = 1 ; i <=5-k ;i++ ) {
				System.out.print(" ");
			}
			
			// 별 출력
			for(int i = 1 ; i <=k ; i++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
