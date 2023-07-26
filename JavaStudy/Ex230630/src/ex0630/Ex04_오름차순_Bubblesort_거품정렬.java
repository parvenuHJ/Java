package ex0630;

import java.util.Arrays;

public class Ex04_오름차순_Bubblesort_거품정렬 {

	public static void main(String[] args) {

		// 버블정렬을 이용해 오름차순으로 정렬
		// 비교하기 위해서 처음부터 오름차순으로 초기화해주기
		
		int [] array = {9,7,6,3,1};
		int temp ;
		
		// 이중 for문으로 변환
		for(int j = 1 ; j < array.length; j++) {
			for(int i = 0; i < array.length -j ; i++) { 
				
				if(array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
			
		}
		}
		}System.out.println(Arrays.toString(array)); // --> 오른차순으로 바뀜
		
		
		
		
		
		
		
		
		
//		// 1 step : 7 6 3 1 9  -->제일 큰 숫자가 제일 오른쪽으로 (4번 비교)
//		for(int i = 0; i < array.length -1 ; i++) { // array.length -1 : 자료가 5개 있을때 4번만 비교!!!!!!
//			
//			if(array[i] > array[i+1]) {
//				temp = array[i];
//				array[i] = array[i+1];
//				array[i+1] = temp;
//			}
//			
//			
//			
//		}
//		System.out.println(Arrays.toString(array));
//		
//		// 2 step : 6 3 1 7 9 --> 그 다음 큰 숫자가 오른쪽에서 2번째에 (3번 비교)
//		for(int i = 0; i < array.length -2 ; i++) { 
//			
//			if(array[i] > array[i+1]) {
//				temp = array[i];
//				array[i] = array[i+1];
//				array[i+1] = temp;
//			}
//			
//			
//			
//		}
//		
		
		
		
		
		
		
		
		
		
//		if(array[0] > array[1]) {
//			temp = array[0];
//			array[0] = array[1];
//			array[1] = temp;
//		}
//		// System.out.println(Arrays.toString(array)); 바꼈는지 확인
//		
//		if(array[1] > array[2]) {
//			temp = array[1];
//			array[1] = array[2];
//			array[2] = temp;
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
