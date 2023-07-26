import java.util.Scanner;

public class HARDMe___Q32_2진수를10진수로 {

	public static void main(String[] args) {

		
		// 이진수 문자열을 split으로 배열에 넣어줌
		
			// arr[마지막배열] * 2^0 , arr[마지막배열-1] * 2^1  --> 규칙 : (마지막배열-A)+(A) = 마지막 배열 
			
			
			String str = "01001101";
			
			String [] arr = str.split("");
			
			// 문자열 --> 숫자 메소드
			// int num = Integer.parseInt(str)
			
			int sum = 0;
			int pow = 1;
			
			// 2의 승 -> 0~7 (++)   => 7-i
			// 인덱스 -> 7~0 (--)    => i
			for (int i = str.length()-1 ; 0 <= i; i--) {  // i : 7 6 5 4 3 2 1 0 
				int num = Integer.parseInt(arr[i]);
//				sum +=Math.pow(2, 7-i) *num );    //  sum += 2^7-i * 문자열arr[i]의 정수형 !!!!!!!
				sum += pow*num;
				pow *= 2;
				// pow = 1, 2 , 2*2, 2*2*2.....
				// num = 0 or 1

			}
				System.out.println(sum);
	
		
		
		
		
		
		
	}

}
