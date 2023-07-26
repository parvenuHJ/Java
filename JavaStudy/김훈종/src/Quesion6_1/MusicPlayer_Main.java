package Quesion6_1;

import java.util.Scanner;

public class MusicPlayer_Main {

	public static void main(String[] args) {

		
		
		MusicController con = new MusicController();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(true) {
			
			System.out.print("====뮤직플레이어====\n1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >>");
			int menu = sc.nextInt();
			
			if(menu ==1) {
				System.out.println("====등록====");
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int playTime = sc.nextInt();
				
				MusicVO vo = new MusicVO(title, singer, playTime);
				
				con.insert(vo);
				
				
			}
			
			else if (menu==2) {
				
				System.out.println("====노래목록====");
				con.mok();
			}
			
			else if (menu ==3) {
				System.out.println("====실행====");
				con.sil();
				
			}
			
			else if (menu ==4) {
				System.out.println("====이전곡====");
				con.before();
				
			}
			
			else if (menu ==5) {
				System.out.println("====다음곡====");
				con.next();
			}
		
			else if (menu == 6) {
				break;
			}
			
			else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
