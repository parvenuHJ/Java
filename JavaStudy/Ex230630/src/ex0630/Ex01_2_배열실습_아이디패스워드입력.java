package ex0630;

import java.util.Scanner;

public class Ex01_2_배열실습_아이디패스워드입력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// String 배열 만들건데 배열이름 -> id,   크기 -> 3칸
		// String 배열 만들건데 배열이름 -> pw,   크기 -> 3칸
		String[] id = new String[3];
		String[] pw = new String[3];
		
		// 첫번쨰 회원 아이디 비번 정보 입력 (0번 인덱스)
		id [0] = "김훈종";
		pw [0] = "1234";
		
		// 두번째 회원 아이디 비번 정보 입력 (1번 인덱스)
		id [1] = "빅데이터";
		pw [1] = "smart";
		
		// 3번 인덱스에는 회원가입을 해서 아이디 비번 입력 받을 것임 id [2], pw[2]
		
		
		
		while(true) {
			System.out.print("[1] 회원가입 [2] 로그인 [3] 종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println(" ====회원가입==== ");
				System.out.print("회원가입할 ID : ");
				id[2]= sc.next();
				System.out.print("회원가입할 PW : ");
				pw[2]= sc.next();
				
				System.out.println(id[2] + "님 회원가입 성공!");
				
			}else if(menu==2) {
				System.out.println(" ====로그인==== ");
				System.out.print("ID : ");
				String input_id = sc.next();
				System.out.print("PW : ");
				String input_pw = sc.next();
				
				// 배열 돌면서 input_id 와 input_pw가 배열의 값과 일치하는지 확인
				// 일치한다면 -> "로그인 성공!"
				// 아니라면 -> "로그인 실패!"
				//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				boolean check = true;
				
				for(int i = 0; i < id.length ; i++) {
					if(id[i].equals(input_id) && pw[i].equals(input_pw)) {
						System.out.println("로그인 성공!");
						check = false;
						break;
					}
				}
				
				if(check == true) {
					System.out.println("로그인 실패!");
				}
				//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				
				
			}else if(menu==3) {
				System.out.println(" ====프로그램 종료==== ");
				break;
			}else {
				System.out.println("다시입력해주세요");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
