package ex0629;

import java.util.Scanner;

public class Ex01실습1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 팀원의 이름을 담을 String 형태의 team 배열 초기화하기
		String [] team = {"김훈종","홍용명","백지수","서윤","장채린"};
		
		// 이름을 입력받아 몇번째 인덱스에 있는지 출력하기
		System.out.print("이름 : ");
		String name = sc.next();
		
		for ( int i = 0 ; i < team.length ; i++ ) {

			if(name.equals(team[i])) {
				System.out.print(name + "님은 " + i + " 번 인덱스에 있습니다.");
				break;
		}
		
		}
		
		
		
		
		
		
		
		
		
	}

}
