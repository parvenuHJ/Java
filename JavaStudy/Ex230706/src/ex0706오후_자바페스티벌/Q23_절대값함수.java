package ex0706오후_자바페스티벌;

public class Q23_절대값함수 {

	public static void main(String[] args) {

		// 차이가 가장 적은 값을 찾는다
		// 위치를 찾아준다
		// 차이가 음수가 나올 수 도 있음 -> 절대값으로 비교해야한다.
		
		// 1. point 배열 만들기
		int [] point = {92,32,52,9,81,2,68};
		
		// 2. 인덱스값들이 적어도 서로 한번씩은 빼기 연산이 이루어질 수 있도록 코드 작성
		// -> 자기 자신과의 비교는 제외 (이유 : 결과값이 0이 나오기때문)
		// 빼기 연산결과들을 전부 절댓값으로 만들어줘야함
		// 가장 작은 값이 나왔을때 두 숫자의 위치를 저장
		int min = Math.abs(point[0] - point[1]); // 최소값에 영향을 주지 않을 배열 내에서의 뻬기 결과값으로 초기화
		int a = 0;
		int b = 0;

		// Math.abs(point[i] - point[j]) -> 해당 수치값을 절대값으로 만들어줌
		for (int j = 0; j < point.length; j++) {
			for (int i = 0; i < point.length; i++) {
				if (i != j) {
					// i 가 j이 아닐경우에만 동작
					if (Math.abs(point[j] - point[i]) < min) {
						min = Math.abs(point[j] - point[i]);
						// 가장 작은 값이 나왔을때 두 숫자의 위치를 저장
						a = j;
						b = i;

					}

				}
			}

		}
		System.out.println("result : [" + a + "," + b + "]");
		
		
		
		
		
		
	}

}
