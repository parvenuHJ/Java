package ex0628;

public class Ex04실습2 {

	public static void main(String[] args) {

		// 1. 임의의 값으로 배열 초기화  > {}사용
		int [] intArray = {1,2,3,4,5,6,7,8,9};
		int count = 0;
		System.out.print("intArray에 들어있는 홀수는 ");
		
		for(int i = 0 ; i < intArray.length ; i++) {
			//2. 배열 값 중에서 홀수만 출력. 
				if(intArray[i]%2==1) {
					count++;
					System.out.print(intArray[i] + " ");
				}
		}
		
		System.out.print("입니다. ");
		System.out.println("홀수의 총 개수는 " + count + "개 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
