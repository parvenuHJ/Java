import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {

		int [][] arr = new int [5][5];
		int num = 1;
		
		
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int k = 0 ; k < arr[i].length ; k++) {
				arr[i][k] = num++;
			}
			
			
		}
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int k = 0 ; k <arr[i].length ; k++) {
				if(i %2 == 0) {
					System.out.print(arr[i][k] + "\t");
				}else {
					System.out.print(arr[i][4-k] + "\t");
				}
			}
			System.out.println();
			
			
		}
		
		
		
		
	}

}
