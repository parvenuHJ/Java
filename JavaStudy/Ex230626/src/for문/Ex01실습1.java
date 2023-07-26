package for문;

public class Ex01실습1 {

	public static void main(String[] args) {
		
		//for문
		//for(초기화구문 ; 검사조건; 반복후작업){
		//		검사조건이 true일때 실행문;
		//}

		//for문을 이용하여 21에서 57까지 출력하기
		for(int i=21 ; i<=57 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println(); // 한번 줄바꿈!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		//for문을 이용하여 96에서 53까지 출력하기
		for(int j=96 ; 53<=j ; j--) {
			System.out.print(j + " ");
		}
		System.out.println();
		//for문을 이용하여 21에서 57까지의 수 중 홀수만 출력하기
		for(int k=21 ; k<=57 ; k+=2) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		for (int i = 21 ; i<=57 ; i++) {
			if(i%2==1) {
				System.out.print((i + " "));
			}
		}
		
		
		
	}

}
