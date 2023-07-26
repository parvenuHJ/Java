import java.util.Scanner;

public class Q29_대시의개수 {

	public static void main(String[] args) {

		// 대시의 개수를 결과값으로

		// 1. 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);

		// 2. 숫자 입력받기

		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();

		// 3. 대시의 총 합을 구해서 출력하기
		int sum = 0;
		int[] arr2 = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 }; // 0 ~ 9 대시의 개수

		while (num > 0) {
			int i = num % 10;
			sum += arr2[i];
			num /= 10;
		}
		System.out.println("대시의 총합 >> " + sum);
	
	
	
	
	}
	
		
		
		
		
		
		
		
	}


