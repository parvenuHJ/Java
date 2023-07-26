
public class Ex14메소드실습_완전수_어려움 {

	public static void main(String[] args) {

		int startValue = 1;
		int endValue = 1000;

		System.out.println("1~1000까지의 완전수 : ");
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int a, int b) {

		for (int k = a + 1; k <= b; k++) { // 2 3 4 ...
			int sum = 0; 					// 한번 싸이클로 약수를 다 구하고나서 sum을 0으로 초기화 해줘야함!!!!

			for (int i = 1; i < k; i++) { // (2 - 1), (3 - 1 2) , (4 - 1, 2, 3) ...

				if (k % i == 0) {

					sum += i;

				}

			}
			if (sum == k) {

				System.out.print(k + " ");
			}

		}

	}

}
