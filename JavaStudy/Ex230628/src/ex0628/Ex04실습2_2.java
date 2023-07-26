package ex0628;

public class Ex04실습2_2 {

	public static void main(String[] args) {
		
		int [] intArray = {1,2,3,4,5,6,7,8,9};
		int count = 0;
		String odd = "";
		
		
		for(int i = 0 ; i < intArray.length ; i++) {
				if(intArray[i]%2==1) {
					count++;
					odd = odd + (intArray[i] + " ");  // String = String + int --> String 으로 자동형변환
				}
		}
		
		System.out.println("intArray에 들어있는 홀수는 " + odd + "입니다. 홀수의 총 개수는 " + count + "개 입니다.");
	}

}
