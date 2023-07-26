package ex0629;

public class Ex07이차원배열5_왼쪽으로90도회전 {

	public static void main(String[] args) {

		// 배열생성
		int[][] array = new int [5][5];
		int num = 1;
		
		//입력부
		for(int k = 0 ; k < array.length ; k++ ) {
			for( int i = 0 ; i < array[k].length ; i++ ) {
				array[k][i] = num++;
			}
		}
		
		// 출력부
		for(int k = 0 ; k < array.length ; k++ ) {
			for( int i = 0 ; i < array[k].length ; i++ ) {
				array[k][i] = num++;
				System.out.print(array[k][i] + "\t");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
