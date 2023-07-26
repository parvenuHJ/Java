package ex0628;

import java.util.Random;
import java.util.Scanner;

public class Ex01배열 {

	public static void main(String[] args) {

		// 변수 선언
		int a;
		
		// 초기화 (최초의 할당)
		a = 5;
		
		// 변수를 선언과 초기화 한꺼번에
		int b = 6;
		
		
		
		
		// 배열을 선언하고 생성하는 방법
		// 데이터타입 [] 레퍼런스변수 = new 데이터타입 [배열크기];
		int [] numbers = new int [4];
		
		// 이것도 나눠서 가능
		
		// 배열 선언
		// 데이터타입 [] 레퍼선스변수 ;
		int [] number ;
		// 배열 생성
		number = new int [4];
		// new : 무언가를 생성할 때 쓰는 키워드
		
		
		// 자바책 65페이지~
		// 기본데이터 타입 (8가지)
		// byte char double int... < 메모리 용량이 딱 정해져있음   --> stack(정적인 공간) 이라는 공간에 들어감
		// 레퍼런스 변수들은 메모리 용량이 선언하기 전에는 정해져있지 않아서   --> heap(동적인 공간) 이라는 공간에 4byte로 저장해놈
		
		// 레퍼런스 타입 (기본데이터 타입 이외는 레퍼런스 타입)
		// Scanner , Random, 배열 , String ... -> new 라는 키워드를 사용해야함
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String name = new String("이주희"); // 원래는 이렇게 new를 사용해야되지만
		String name2 ="김다희"; // java.lang(String) -> java.lang에 있는 것은 import 안해도 됨  
				 	         // java.util(Scanner, random) 에 있는 것은 import(자동완성 or ctrl shift o) 필요
				
	
		
		System.out.println(a);
		System.out.println("배열의 주소값 : " + numbers); // 배열의 주소값만 출력됨
		
		// 인덱스 값에 접근 ( 배열 중 몇 번째 위치인가? )
		// 방법 : 레퍼런스 변수 이름 (=배열의 이름) [인덱스변호]
		System.out.println(numbers[0]); // numbers 배열 4칸으로 만들었었음 
		System.out.println(numbers[1]); // numbers 배열 4칸으로 만들었었음 
		System.out.println(numbers[2]); // numbers 배열 4칸으로 만들었었음 
		System.out.println(numbers[3]); // numbers 배열 4칸으로 만들었었음 
		// 위의 의미는 |0|0|0|0| 이렇게 담겨 있다는 말, 배열안에 int -> 기본값이 0으로 지정되어잇음. 참고) Stirng 은 기본값 = null
		
		// 인덱스 값 수정 (넣어주기)
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		
		
		System.out.println(numbers[0]); 
		System.out.println(numbers[1]); 
		System.out.println(numbers[2]); 
		System.out.println(numbers[3]);
		// 배열에 값을 넣어줌 -> |5|10|15|20| 이렇게
		
		
		// 배열은 for문 사용에 적합하다
		// for 문을 사용해서 배열 안에있는 값 출력
		// 배열의 크기 : 배열이름.length !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("배열의 크기 : " + numbers.length);
		
		for(int i = 0 ; i < numbers.length ; i++) {    		// 배열의 크기를 바로 알 수 있게 i<=3 말고 i < 4 --> 이런식으로 사용 배열의 크기 : numbers.length!!!!!
			System.out.println(numbers[i]);					// 인덱스는 0부터 시작이니까 i <= 가 아님 < 임!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		}
		
		// 배열 생성 방법 2가지
		// 1. new 키워드 사용해서 생성
		// new 데이터타입 [배열크기] ;
		
		// 2. 배열 선언과 동시에 초기화 
		// 배열 안에 어떤 데이터가 들어갈지 명확하게 알 때 사용하는 방법 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int [] array = {1,2,3,4,5,6};
		// |1|2|3|4|5|6| 
		// 0번 인덱스 -> 1, 5번 인덱스 ->6 값이 들어있음
		System.out.println(array.length); // 배열의 크기는 6
		
		// for 문으로 배열 안에 있는 값 출력
		for (int i = 0 ; i < array.length ; i++ ) {
			System.out.print(array[i]);
		}
		
		
		// 변수 뒤에 [] 를 써되되긴함
		// int array[] 하지만 
		// int[] array 를 추천 변수이름이 엄청 길 경우 변수인지 배열인지 바로 알 수 있으니까
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
