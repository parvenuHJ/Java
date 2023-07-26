package for문;

public class Ex04실습4_다중for문_예제7 {

	public static void main(String[] args) {

		
		// 2단
		for( int dan = 1 ; dan <10 ; dan++ ) {
			System.out.println("2*"+dan+"="+2*dan);
			
		}
		
		// 3단
		for( int dan = 1 ; dan <10 ; dan++ ) {
			System.out.println("3*"+dan+"="+3*dan);
			
		}
		
		// 4단
		for( int dan = 1 ; dan <10 ; dan++ ) {
			System.out.println("4*"+dan+"="+4*dan);
			
		}
		// 5단
		for( int dan = 1 ; dan <10 ; dan++ ) {
			System.out.println("5*"+dan+"="+5*dan);
			
		}
		
		//다중 for문
		for( int gop = 2 ; gop < 10 ; gop++ ) {
			System.out.println("=="+gop+"단==");
			for(int dan = 1; dan < 10 ; dan++ ) {
				System.out.println(gop+"*"+dan+"="+gop*dan);
			}
		}
	}

}
