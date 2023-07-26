import java.util.Scanner;

public class HARD_Me__Q16_10진수를2진수로 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		int count = 0;
		int size = num;
		
		
		// 2진수 값을 넣을 배열 생성하기전 배열크기 정하기 -> count 에 배열 크기 저장
		while(size > 0) {
			size /=2;
			count++;
		}
		
		
		
		// 2진수 값을 넣을 배열 생성하기 전 위에서 배열크기 정한 count 넣어서 배열 생성
		int [] arr = new int[count];
		
		int j = 0;
		
		// 2를 나눈 나머지 값을 배열에 저장하고
		// 결과값이 0이 되기까지 2로 나누기
		int result = num;
		
		while(result >0 ){
			arr[j] = result%2;
			result/=2;
			j++;
		}
		
		
		for(int i = arr.length ; 0<i ; i--) {
			System.out.print(arr[i-1]);
		}
		
	
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
