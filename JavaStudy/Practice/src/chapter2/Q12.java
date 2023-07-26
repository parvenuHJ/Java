package chapter2;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

//		12. 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 
//		연산자는 + - * / 의 네 가지로 하고 피연산자는 모두 실수로 한다. 
//		피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다. 
//		0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산>> ");
		int op1 = sc.nextInt();
		String op = sc.next();
		int op2 = sc.nextInt();
		int res = 0;
		
		if(op.equals("+")) {
			res=op1+op2;
		}else if(op.equals("-")) {
			res=op1-op2;
		}else if(op.equals("*")) {
			res=op1*op2;
		}else if(op.equals("/")) {
			if(op2==0) {
				System.out.println("0으로 나눌수없다");
			}else {
				res=op1/op2;
			}
		}else {
			System.out.println("사칙연산이 아니다");
		}
		System.out.println(op1+op+op2 +"의 계산결과는" + res);
	}

}
