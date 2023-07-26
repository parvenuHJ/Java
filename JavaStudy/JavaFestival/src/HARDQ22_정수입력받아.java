
public class HARDQ22_정수입력받아 {

	public static void main(String[] args) {

		// 2차원 배열 생성
		int [][] arr = new int [5][5];
		int cnt = 1;
		
		// 입력부
		for(int i = 0 ; i < arr.length ; i++) {
			for(int k = 0; k < arr[i].length;k++) {
				arr[i][k] = cnt++;
			}
		}
		
		// 출력부
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				if(i%2 ==0 ) {
					System.out.print(arr[i][k] + "\t");
				}else {
					System.out.print(arr[i][arr.length-1-k] + "\t");
				}
				
			}
			System.out.println();
		}
		
	}

}
