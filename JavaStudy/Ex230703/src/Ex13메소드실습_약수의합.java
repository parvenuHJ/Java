import java.util.Arrays;

public class Ex13메소드실습_약수의합 {

	public static void main(String[] args) {

		int num = 100;
		int result = getSum(num);
		
		System.out.println(num + "의 약수의 합 : " + result );
		getDivisor(num);
		
	}

//	public static void getDivisor(int num) {
//		
//		System.out.print(num + "의 약수 : ");
//		for(int i = 1 ; i<=num ; i++) {
//			if(num%i == 0) {
//				System.out.print(i + " ");
//			}
//		}
//	}
	
	public static void getDivisor(int num) {
		
		String result = ""; 						//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		for(int i = 1 ; i<=num ; i++) {
			if(num%i == 0) {
				result +=i + " ";					//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
		}
		System.out.println(num + "의 약수 : " + result); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	
	public static int getSum(int num) {
		int [] arr = new int [100];

		int sum = 0;
		for (int i = 1; i <= num ; i ++ ) {

			if( (num / i) * i  == num ) {
				
				arr[i-1] = i;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		return sum;
	}
	

	
	
	
}
