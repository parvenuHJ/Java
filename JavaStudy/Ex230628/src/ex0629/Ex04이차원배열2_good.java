package ex0629;

public class Ex04이차원배열2_good {

	public static void main(String[] args) {

		// 5행 5열의 이차원 배열 생성하기
		int [][] array = new int [5][5];
		int cnt = 1;
				
		// 입력부
		for(int k = 0 ; k < array.length ; k++) {         	 
			for(int i=0; i< array[k].length ; i++) {		
				array[k][i] = cnt++;
			}
		}
		
		
		// 입력부는 그대로 두고 출력부만 바꾸면 됌!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 출력부
		for(int k = 0 ; k < array.length ; k++) {         	 
			for(int i=0; i< array[k].length ; i++) {		
				System.out.print(array[i][k] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
