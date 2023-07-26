
public class Q27_2차원배열왼쪽90도회전 {

	public static void main(String[] args) {

		// 5x5 배열 생성
		int[][] arr = new int[5][5];

		int cnt = 1;

		// 입력부
		for (int i = 0; i < arr.length; i++) { // 행
			for (int k = 0; k < arr[i].length; k++) { // 열
				arr[i][k] = cnt++;
			}
		}

		// 출력부
		System.out.println("원본");
		for (int i = 0; i < arr.length; i++) { // 행
			for (int k = 0; k < arr[i].length; k++) { // 열
				System.out.print(arr[i][k] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("90도 회전");
		for (int i = 0; i < arr.length; i++) { // 행
			for (int k = 0; k < arr[i].length; k++) { // 열
				System.out.print(arr[k][4 - i] + "\t");
			}
			System.out.println();
		}

	}

}
