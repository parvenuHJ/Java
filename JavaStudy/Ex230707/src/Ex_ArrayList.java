

import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {

		// 1. 선언 및 생성
		// 배열
		int [] arr = new int [5];
		
		// ArrayList( = 가변리스트)
		// ArrayList 는 import해야함
		// ArrayList<데이터타입> 변수명 = new ArrayList<데이터타입>
		// 크래스 형태이기 때문에 import 해야하고,
		// () : 메소드를 사용해서 생성하기 때문에 뒤에 ()를 붙임
		// <> : 제네릭기법
		// <>안에 데이터타입 -> int(기본데이터타입)이 못들어옴!!, 객체형태(=클래스형태)으로 존재하야함 
		// ->int를 쓰고싶으면 : Integer (java.lang 안에 Integer.class) , 실수 : Float ( ava.lang 안에 Float.class)
		// String 은 원래 String.class로 존재하기 때문에 그대로 String으로 쓰면 됨!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// 생성 시 크기 지정X
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		// 크기 알아보기
		System.out.println("배열 크기 : " + arr.length);
		System.out.println("ArrayList 크기 : " + arrlist.size() );
		
		// 2. 값 추가
		// 배열
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// ArrayList 
		// 변수명.add(추가할 데이터) -> 맨 뒤의 인덱스로 추가됨 
		arrlist.add(1) ; // 이때의 1 -> 인덱스 아님, 데이터 
		arrlist.add(2) ; 
		arrlist.add(3) ;  
		arrlist.add(4) ; 
		arrlist.add(5) ; 
		
		// 변수명.add(인덱스, 추가할 데이터) -> 원하는 인덱스에 추가
		
		System.out.println("값 추가 후 ArrayList 크기 : " + arrlist.size());
		
		// 3. 값 조회
		// 배열  -> 변수명[인덱스]
		System.out.println("배열의 0번 인덱스 : " + arr[0]);
		
		// ArrayList
		// 변수명.get(인덱스)     --> 중요!! 변수명.add(추가할 데이터) 랑 헷갈리면 안됌
		System.out.println("ArrayList의 0번 인덱스 : " + arrlist.get(0));
		
		// for문을 사용해서 ArrayList 값 전체 조회
		System.out.println("for each 문 사용");
		int k = 0;
		for(int show : arrlist ) {
			System.out.println(k++ + "번째 인덱스 값: " +show);
			
		}
		System.out.println();
		
		System.out.println("for문 사용");
		for(int i = 0 ; i < arrlist.size() ; i++) {
			System.out.println(i + "번째 인덱스 값 : " + arrlist.get(i));
		}
		
		
		System.out.println();
		
		// 4. 값 삭제
		// 원하는 위치의 값 삭제 : 변수명.remove(인덱스);
		// 모든 값 다 삭제 : 변수명.removeAll(); 보다는
		// 모든 값 다 삭제 : 변수명.clear();  <<-- 안에 있는 로직이 clear가 더 간단하고 빨라서 clear 추천!!!!
		arrlist.remove(1);
		
		System.out.println("1번 인덱스 : " + arrlist.get(1));
		
		arrlist.clear();
		
		System.out.println("클리어 후 사이즈 : " + arrlist.size());
		
		
	}

}
