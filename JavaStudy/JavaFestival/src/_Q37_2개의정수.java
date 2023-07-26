
public class _Q37_2개의정수 {

	public static void main(String[] args) {

		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인 " + result);
		
		
		
		
		
	}

	private static int powerN(int base, int n) {

		int result = base;
		for ( int i = 1 ; i <n ; i++) {
			result *= base;
		}return result;
		
		
	}

	
	
}
