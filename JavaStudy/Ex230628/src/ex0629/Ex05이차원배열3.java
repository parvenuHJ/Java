package ex0629;

public class Ex05이차원배열3 {

	public static void main(String[] args) {

		// 5행 5열의 이차원 배열 생성하기
		int [][] array = new int [5][5];
		int cnt = 1;
		
		// 입력부
		for(int j=0 ; j < array.length ; j++) {         	
			for(int i=0; i< array[j].length ; i++) {		
				array[j][i] = cnt++;
			}
		}
		
		// 출력부
		for(int k=0 ; k < array.length ; k++) {
			for(int i=0 ; i < array[k].length ; i++) {
				System.out.print(array[k][4-i] + "\t"); 
				// 00 01 02 03 04   --> 04 03 02 01 00 = 0(4-0) 0(4-1) 0(4-2) ...
					}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
