package ex0629;

import java.util.Arrays;

public class Ex02중요_실습2_split_ArraystoString {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		// .split("특정 문자") -> 특정문자를 기준으로 문자열을 잘라주는 함수(기능)!!!!!!!!!!!!!!!!!!
		// 주의사항 : A, A 이런식으로 컴마 기준으로 공백을 넣으면 공백까지 인식해버림!!!!!!!!!!!!!!!!!!!!!!!!!!
		String [] array = score.split(",");
		
//		for(int i = 0 ; i <array.length;i++) {
//			System.out.print(array[i]+" ");
//			
//		}
		// 위의 기능 을 간편하게 해주는 기능 --> array.toString(배열이름) !!!!!!!!!!!!!!!!!!!!!!
		
		System.out.println(Arrays.toString(array));
		
		int a = 0; //A를 카운트
		int b = 0; //B를 카운트
		int c = 0; //C를 카운트
		int d = 0; //D를 카운트
		int f = 0; //F를 카운트
		
		for(int i=0 ; i<array.length ; i++) {
			if(array[i].equals("A")) {
				a++;
			}else if(array[i].equals("B")) {
				b++;
			}else if(array[i].equals("C")) {
				c++;
			}else if(array[i].equals("D")) {
				d++;
			}else if(array[i].equals("F")) {
				f++;
			}
		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");
		 
		
		for(String sss : array) {   //  for (변수타입 변수명 : 배열변수) = for(int i=0 ; i<array.length ; i++)!!!!!!!
									//  
			if(sss.equals("A")) {
				a++;
			}else if(sss.equals("B")) {
				b++;
			}else if(sss.equals("C")) {
				c++;
			}else if(sss.equals("D")) {
				d++;
			}else if(sss.equals("F")) {
				f++;
			}
			System.out.print(sss);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
