package ex0629;

public class Ex04이차원배열2 {

	public static void main(String[] args) {

		// 2차원배열 생성하기
		int [][] array = new int [5][5];
		int cnt =  1;
		
		// 입력부
		for(int j=0 ; j < array[0].length ; j++) {         	 
			for(int i=0; i< array.length ; i++) {		
				array[i][j] = cnt++;
			}
		}
		// 출력부
			for(int k=0 ; k < array.length ; k++) {
				for(int i=0 ; i < array[k].length ; i++) {
					System.out.print(array[k][i] + "\t");
						}
				System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
