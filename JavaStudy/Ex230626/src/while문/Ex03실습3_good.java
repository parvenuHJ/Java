package while문;

import java.util.Scanner;

public class Ex03실습3_good {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;

		while (true) {

			System.out.print("숫자입력: ");
			int num = sc.nextInt();

			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			} else if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			System.out.println("짝수개수 : " + even);
			System.out.println("홀수개수 : " + odd);

		}
	}
}
