package for문;

public class Ex06실습6_다중for문_예제9 {

	public static void main(String[] args) {

		//2~9단 
		for( int gop = 1 ; gop <=9 ; gop++ ) {
			for( int dan =2 ; dan<=9 ; dan++ ) {
				if(dan!=9) {
					System.out.print(dan +"*" + gop + "=" + dan*gop + "\t");
					
				}else {
					System.out.print(dan +"*" + gop + "=" + dan*gop + "\n");
					
				}
			}
		}
	}
}

		
		
		
	
