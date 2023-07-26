
public class HARDQ21_정수N을입력받아 {

	public static void main(String[] args) {

		// 2차원 배열 생성
		int [][] array = new int[5][5];
		int cnt = 1;
		
		// 입력부
		for (int k = 0; k < array.length;k++) { // array.length -행 개수
			for (int i = 0; i < array[k].length ; i ++) { // array[0].length - 열의 개수
				array [k][i] = cnt++;
				
			
			}
		}
		
		// 출력부
		for (int k = 0; k< array.length;k++) { // array.length -행 개수
			for (int i = 0; i < array[k].length ; i ++) { // array[0].length - 열의 개수
				System.out.print(array[i][k] + "\t"); // 행과 열 바꿔서 출력
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
