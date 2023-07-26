package for문;

public class Ex05실습5_다중for문_예제8 {

	public static void main(String[] args) {

		for( int dan=2 ; dan<=9 ; dan++ ) {
			System.out.print("\n"+dan+"단 : ");
			for( int gop=1 ; gop<=10 ; gop++ ) {
				System.out.print( dan +"*" +gop +"="+dan*gop+" ");
				
			}
			
		}
	}

}
