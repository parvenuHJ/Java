package ex0628;

public class Ex02주소공유 {

	public static void main(String[] args) {
				// int [] array1 = new int [3];
				// int [] array2 = array1;
				// array2가 array1의 주소값을 공유 
		
		// 배열 - > 레퍼런스 변수 -> 주소값을 저장
		// 주소를 공유 -> 같은 공간(배열) 을 공유
		int [] intArray = new int [5];
		int [] myArray = intArray;
		
		System.out.println(intArray);
		System.out.println(myArray);
				// 둘의 주소값이 같은것을 볼 수 있음
		
		intArray[2] = 8 ;  // --> |0|0|8|0|0| ->2번 인덱스에 8 값 입력
		System.out.println(intArray[2]);
		System.out.println(myArray[2]);
		
		myArray[3] = 5;
		System.out.println(intArray[3]);
		System.out.println(myArray[3]);
		
		
		
	}

}
