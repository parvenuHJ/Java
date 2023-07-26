package ex0628;

public class Ex05실습3 {

	public static void main(String[] args) {

		// 1.정수형 배열 임의로 초기화
		int [] array = {1, 3, 5, 11, 9, 100};
		
		//  배열의 값 중 가장 큰 값을 찾아 출력하는 프로그램
		
		int max = 0;
		
		for(int i = 0 ; i < array.length ; i++ ) {
			if(array[i] > max) {
				max = array[i];
		}
			
		}
		System.out.println("가장 큰 수는 " + max + "입니다." );
		
		
		// 배열이 모두 음수라면????
		
		int [] array1 = {-1, -3, -5, -11, -9, -100};
		
		int max1 = array1[0]; // 0부터가 아니라 0번째 인덱스부터 비교한다고 하면 됨!!!!!!!!!!!!!!
		
		for(int i = 0 ; i < array1.length ; i++ ) {
			if(array1[i] > max1) {
				max1 = array1[i];
		}
			
		}
		System.out.println("가장 큰 수는 " + max1 + "입니다." );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
