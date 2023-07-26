package ex0629;

public class Ex06이차원배열4 {

	public static void main(String[] args) {

		// 5행 5열의 이차원 배열 생성하기
		int[][] array = new int[5][5];
		int cnt = 1;

		// 입력부
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {
				array[k][i] = cnt++;
			}
		}

		// 출력부
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {
				if(k%2==0) {
					System.out.print(array[k][i] + "\t");
				}else {
					System.out.print(array[k][4-i] + "\t");
				}
			}
			System.out.println();
		}

	}

}
