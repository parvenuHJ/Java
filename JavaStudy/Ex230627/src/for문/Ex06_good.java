package for문;

public class Ex06_good {

	public static void main(String[] args) {

		for( int k = 1 ; k<=9 ; k++) {
			for(int i =2 ; i <=9 ; i++ ) {
				System.out.print(i + "*" + k + "=" + i*k + "\t");
			}System.out.println();  // for문 밖에 ln(줄바꿈) 써주면 for문 다 끝나고 줄바꿈
			
		}
	}

}
