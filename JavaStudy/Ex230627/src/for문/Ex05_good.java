package for문;

public class Ex05_good {

	public static void main(String[] args) {

		for ( int k = 2 ; k<=9 ; k++ ) {
			System.out.print(k+"단 : ");
			for( int i = 1; i<=9; i++) {
				System.out.print(k + "*" + i + "=" + k*i + "\t");
			}
			System.out.println();
		}
		
		// 2단
		System.out.print("2단 : ");
		for( int i = 1; i<=9; i++) {
			System.out.print(2 + "*" + i + "=" + 2*i + " ");
		}
		System.out.println();
		
		// 3단
		System.out.print("3단 : ");
		for( int i = 1; i<=9; i++) {
			System.out.print(3 + "*" + i + "=" + 3*i + " ");
		}
		System.out.println();
		
	}

}
