import java.util.Random;

public class Q1 {

	public static void main(String[] args) {

		int [] arr = new int [8];
		int max = 0;
		int min = 0;
		
		Random rd = new Random();
		System.out.print("배열에 있는 모든 값 : ");
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = rd.nextInt(100) +1 ;
			System.out.print(arr[i] + " ");
			
			
			if(max < arr[i] ) {
				max = arr[i];
			}
			
			min = arr[0];
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print("\n가장 큰 값 : " + max);
		System.out.print("\n가장 작은 값 : " + min);
		
		
		
		
	}

}
