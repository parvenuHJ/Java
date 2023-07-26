import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Mp3Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		// 음악 객체 생성하기
		Mp3 m1 = new Mp3("Anne Marie","2002",120,".\\music\\Anne Marie - 2002.mp3");
		Mp3 m2 = new Mp3("Billie Eilish", "bad guy", 200, ".\\music\\Billie Eilish - bad guy.mp3");
		Mp3 m3 = new Mp3("Carmen Twillie, Lebo M.", "Circle of Life", 300, ".\\music\\Carmen Twillie, Lebo M. - Circle of Life.mp3");
		Mp3 m4 = new Mp3("CHUNG HA", "벌써 12시", 400, ".\\music\\CHUNG HA - 벌써 12시.mp3");
		Mp3 m5 = new Mp3("Idina Menzel", "Let It Go", 500, ".\\music\\Idina Menzel - Let It Go.mp3");
		Mp3 m6 = new Mp3("Itzy", "Dalla Dalla", 600, ".\\music\\Itzy - Dalla Dalla.mp3");
		Mp3 m7 = new Mp3("JENNIE", "SOLO", 700, ".\\music\\JENNIE - SOLO.mp3");
		Mp3 m8 = new Mp3("Mena Massoud, Naomi Scott", "A Whole New World", 750, ".\\music\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		Mp3 m9 = new Mp3("Rain", "깡", 800, ".\\music\\Rain - 깡.mp3");
		Mp3 m10 = new Mp3("Ring Ding Dong", "Ring Ding Dong", 900, ".\\music\\SHINee - Ring Ding Dong.mp3");
		Mp3 m11 = new Mp3("TWICE", "FANCY", 550, ".\\music\\TWICE - FANCY.mp3");
		Mp3 m12 = new Mp3("이하이", "NO ONE", 860, ".\\music\\이하이 - NO ONE.mp3");
		
		
		// 음악 개체들을 담아줄 list 라는 이름의 arraylist 만들기
		ArrayList<Mp3> list = new ArrayList<Mp3>();
		
		// 배열에 각 객체들 넣어주기
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		list.add(m9);
		list.add(m10);
		list.add(m11);
		list.add(m12);
		
		// 틀 만들기
		// 1번 : 재생
		// 2번 : 정지
		// 3번 : 이전곡
		// 4번 : 다음곡
		// 5번 : 종료 -> "플레이어를 종료합니다!" 출력하고 break
		
		
		// 프로젝트 우클릭 -> build path-> configure build path> libaries 탭 -> add ExternalJARs..
		// 로 원래는 없는 메소드를 사용가능 (.play 등등)
		
		int index = 0;
		MP3Player mp3 = new MP3Player();
		
		
		while(true) {
			System.out.print("[1] 재생 [2] 정지 [3] 이전곡 [4] 다음곡 [5] 종료 [6] 랜덤재생 >> ");
			int menu = sc.nextInt();
			
		if (menu == 1) {
			
			System.out.printf("%s - %s(%d초)\n" , list.get(index).getSinger() , list.get(index).getName(), list.get(index).getPlay_time());
			mp3.play(list.get(index).getPath());
			
		}else if (menu ==2) {
			mp3.stop();
		}else if (menu ==3) {
			if(mp3.isPlaying() == true) {
				mp3.stop();
			}
			index--;
			
			if(index < 0) {
				index = list.size()-1;
			}
			System.out.printf("%s - %s(%d초)\n" , list.get(index).getSinger() , list.get(index).getName(), list.get(index).getPlay_time());
			mp3.play(list.get(index).getPath());
			
		}else if (menu == 4) {
			if(mp3.isPlaying() == true) {
				mp3.stop();
			}
			index++;
			if (index >= list.size()) {
				index = 0;
			}
			
			System.out.printf("%s - %s(%d초)\n" , list.get(index).getSinger() , list.get(index).getName(), list.get(index).getPlay_time());
			mp3.play(list.get(index).getPath());
			
		}else if (menu == 5) {
			System.out.println("플레이어를 종료합니다.");
			break;
			
		}else if (menu == 6) {
			if(mp3.isPlaying() == true) {
				mp3.stop();
			}
				int ran_index = rd.nextInt(list.size());
				// 중복제거는 어떻게하는지 모르겠다....
				
				System.out.printf("%s - %s(%d초)\n" , list.get(ran_index).getSinger() , list.get(ran_index).getName(), list.get(ran_index).getPlay_time());
				mp3.play(list.get(ran_index).getPath());
			
			
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
