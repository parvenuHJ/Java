package for문;

public class Ex07실습7_3행4열별찍기 {

	public static void main(String[] args) {

		//3행4열 별찍기
		// ****
		// ****
		// ****
		
		//생각 >> 1) *을 4번 출력 2)****  3) ****을 3번 출력하면 알아서 아래로 3번 출력되겠네
		for( int k = 1; k <=3 ; k++ ) {
			for ( int i = 1 ; i <=4 ; i++ ) {
				System.out.print("*");
				
			}System.out.println();
			
		}
		
		
	}

}
