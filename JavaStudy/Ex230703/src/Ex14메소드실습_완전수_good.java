
public class Ex14메소드실습_완전수_good {

	public static void main(String[] args) {

		int startValue = 1;
		int endValue = 1000;

		System.out.print("1~1000까지의 완전수 : ");
		getPerfectNumber(startValue, endValue);
		
	}

	private static void getPerfectNumber(int startValue, int endValue) {

		for(int i = startValue; i <= endValue ; i++) {
			
			int sum = 0;
			for(int k = 1 ; k < i ; k++) {
				if(i % k == 0) {
					sum +=k;
					
				}
			}
			if(sum ==i) {
				System.out.print(i + " ");
			}
		}
		
	}

	
	
}
