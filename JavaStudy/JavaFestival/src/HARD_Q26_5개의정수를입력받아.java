import java.util.Scanner;

public class HARD_Q26_5개의정수를입력받아 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] arr  = new int [5];
		int temp;
		
		for(int i =0 ; i < 5 ; i++ ) {
			System.out.print((i+1) + "번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		for(int k = 1 ; k <arr.length ; k++){
			for (int i = 0 ; i < arr.length - k; i++) {
				if( arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
			}
			
			
		}System.out.println("정렬 후");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		
		
	}

}
