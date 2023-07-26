
public class Q23 {

	public static void main(String[] args) {

		System.out.println("원본");
		
		int [][] arr = new int [5][5];
		
		int [][] arr2 = new int[5][5];
		
		int num = 1;
		
		int num2 = 1;
		
		// 입력부
		for(int i = 0 ; i < arr.length; i++ ) {
			for(int k = 0; k <arr[i].length ; k++) {
				arr[i][k] = num++;
			}
		}
		// 출력부
		for(int i = 0 ; i < arr.length; i++ ) {
			for(int k = 0; k <arr[i].length ; k++) {
			 System.out.print(arr[i][k] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("90도 회전");
		
		// 입력부
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				arr[a][b] = num2++;
			}
		}
		// 출력부
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				
				
				System.out.print(arr[b][4-a] + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}

	
	
	
}
