import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("정렬 후");
		
		int temp;
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			
			if (arr[i] > arr[i+1]) {
				temp = arr[i];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}else {
				continue;
			}
			
			System.out.print(arr[i]);
		}
		
		
		
		
	}
	

}
