import java.util.Scanner;

public class Ex06삼항연산자2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		//System.out.println(num % 2 == 1 ? "홀수" : "짝수"); // num 이 짝수라면 num % 2 ==0
		
		// result 로 할때
		String result = num % 2 == 1 ? "홀수" : "짝수" ;
		System.out.println(result);
		
				
		
		
		
		
		
		
	}

}
