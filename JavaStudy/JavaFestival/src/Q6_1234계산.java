
public class Q6_1234계산 {

	public static void main(String[] args) {


		int num = 0; 
		int sum = 0;
		

//		// do while 문
//		do {
//			 ++num;
//			 if (num % 2 == 1) { 
//			        sum1 += num; 
//			    } else {
//			        sum2 -= num;  
//			    }
//		}while (num < 100);
//		System.out.println("결과1 : " + (sum1 +sum2));
//		
		
		// while 문
		while (num < 100) { 
		    ++num; 
		    // 홀수이면 sum에 더한다.
		    if (num % 2 == 1) { 
		    	System.out.print(num + " ");
		        sum += num; 
		    // 짝수이면 -1 곱해서 sum에 더한다.
		    } else {
		        sum -= num;  
		        System.out.print(-num + " ");
		    }
		}
		System.out.println("\n결과2 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
