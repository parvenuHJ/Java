import java.util.Random;

public class Q14_8칸크기의배열을선언하고 {

	public static void main(String[] args) {

		
		
		Random rd = new Random();
		
		// 8칸 배열 만들기
		int [] arr = new int [8];
		
		
	
		// 8칸 배열 랜덤수로 초기화
		for (int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = rd.nextInt(100);
		}
		
		// 배열 값 출력
		System.out.print("배열에 있는 모든 값 : ");
		for( int i = 0 ; i < arr.length ; i++ ) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		// 최대값 비교 후 출력
		int max = arr[0];							// 최대(최소)값을 초기값으로 int[0]으로 설정할때 "랜덤수로 초기화"한 코드 밑에 적어야함. 위에적으면 int[0] = 0 (아무것도 입력하지 않은 int초기값) 이 되어버림!!!!!!!!!!!!!!!
		for (int i = 0 ; i < arr.length ; i++ ) {
			if(max <= arr[i]) {
				max = arr[i];
			}
		}System.out.println("가장 큰 값 : " + max);
		
		// 최대값 비교 후 출력
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}System.out.println("가장 작은 값 : " + min );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
