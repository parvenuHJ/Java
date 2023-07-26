package ex0629;

public class Ex03이차원배열1 {

	public static void main(String[] args) {

		// 5행 5열의 이차원 배열 생성하기
		int [][] array = new int [5][5];
		int cnt = 1;
		
		// 이중 for문으로 
		// 입력부
		for(int j=0 ; j < array.length ; j++) {         	//이때 array.length -> 
			for(int i=0; i< array[j].length ; i++) {		// array.length[j].length
				array[j][i] = cnt++;
			}
		}
		
		// 출력부
		for(int k=0 ; k < array.length ; k++) {
			for(int i=0 ; i < array[k].length ; i++) {
				System.out.print(array[k][i] + "\t");
					}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		//배우는 과정임..
		// 0행
		for(int i = 0; i < array[0].length ; i++) { // !!!!!!!!!!!!!!! array[0].length : 0번째 행에 접근 후, 이 열의 길이 !!!!!!!!!
			array[0][i] = cnt++; // 1부터 1씩 증가한 값을 차례대로 넣어줌!!!!!!!!!
			
		} 
//		array [0][0] = 1;
//		array [0][1] = 2;
//		array [0][2] = 3;
//		array [0][3] = 4;
//		array [0][4] = 5;
		
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);
//		System.out.println(array[0][2]);
//		System.out.println(array[0][3]);
//		System.out.println(array[0][4]);
		
		// 1행
		for(int i=0; i < array[1].length ; i++) {
			array[1][i] = cnt++;
		}
//		array [1][0] = 6;
//		array [1][1] = 7;
//		array [1][2] = 8;
//		array [1][3] = 9;
//		array [1][4] = 10;
		
		// 2행
		for(int i=0; i < array[2].length ; i++) {
			array[2][i] = cnt++;
		}
		
		
		
	}

}
