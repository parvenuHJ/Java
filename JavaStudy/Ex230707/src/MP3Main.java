import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MP3Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 뮤직 객체 생성하기
		MP3 music1 = new MP3("Anne Marie", "2002", 100, ".\\music\\Anne Marie - 2002.mp3");
		MP3 music2 = new MP3("Billie Eilish", "bad guy", 200, ".\\music\\Billie Eilish - bad guy.mp3");
		MP3 music3 = new MP3("Carmen Twillie, Lebo M.", "Circle of Life", 300, ".\\music\\Carmen Twillie, Lebo M. - Circle of Life.mp3");
		MP3 music4 = new MP3("CHUNG HA", "벌써 12시", 400, ".\\music\\CHUNG HA - 벌써 12시.mp3");
		MP3 music5 = new MP3("Idina Menzel", "Let It Go", 500, ".\\music\\Idina Menzel - Let It Go.mp3");
		MP3 music6 = new MP3("Itzy", "Dalla Dalla", 600, ".\\music\\Itzy - Dalla Dalla.mp3");
		MP3 music7 = new MP3("JENNIE", "SOLO", 700, ".\\music\\JENNIE - SOLO.mp3");
		MP3 music8 = new MP3("Mena Massoud, Naomi Scott", "A Whole New World", 750, ".\\music\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		MP3 music9 = new MP3("Rain", "깡", 800, ".\\music\\Rain - 깡.mp3");
		MP3 music10 = new MP3("Ring Ding Dong", "Ring Ding Dong", 900, ".\\music\\SHINee - Ring Ding Dong.mp3");
		MP3 music11 = new MP3("TWICE", "FANCY", 550, ".\\music\\TWICE - FANCY.mp3");
		MP3 music12 = new MP3("이하이", "NO ONE", 860, ".\\music\\이하이 - NO ONE.mp3");
		
		// 뮤직 객체를 담을 수 있는 뮤직 리스트 만들기
		ArrayList<MP3> list = new ArrayList<MP3>();
		
		// 리스트에 뮤직 넣어주기
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);
		list.add(music6);
		list.add(music7);
		list.add(music8);
		list.add(music9);
		list.add(music10);
		list.add(music11);
		list.add(music12);
		
		// 틀 만들기
		// 1번 : 재생
		// 2번 : 정지
		// 3번 : 이전곡
		// 4번 : 다음곡
		// 5번 : 종료 -> "플레이어를 종료합니다!" 출력하고 break
		
		int index = 0;
		MP3Player mp3 = new MP3Player(); // 새로 build path 한 MP3player.class
		// MP3Player는 클래스 이름에 해당하고, mp3는 변수 이름에 해당합니다.
		// MP3Player 클래스에 play(), pause(), stop()과 같은 메소드가 있다면, 
		// mp3 변수를 통해 해당 메소드를 호출할 수 있습니다. 예를 들면 mp3.play()와 같이 사용할 수 있습니다.

		while (true) {
			System.out.print("[1] 재생 [2] 정지 [3] 이전곡 [4] 다음곡 [5] 종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 재생
				// 여자아이들 - 퀸카(100초)

				// list.get(i).getSinger() -> i번 인덱스의 싱어이름 가져옴
				// System.out.printf("%s - %s(%d초)\n" , list.get(i).getSinger() ,
				// list.get(i).getTitle() , list.get(i).getPlayTime());
				// 이렇게 해도 되고
				String singer = list.get(index).getSinger();
				String title = list.get(index).getTitle();
				int playTime = list.get(index).getPlayTime();

				System.out.printf("%s - %s(%d초)\n ", singer, title, playTime);
				mp3.play(list.get(index).getPath());
				
			} else if (menu == 2) {
				// 정지
				mp3.stop();
			} else if (menu == 3) {
				// 이전곡
				// 현재 노래가 재생중이면 중지하고(중지안하면 두 노래가 겹쳐서 들림), index--
				if(mp3.isPlaying() == true) { // == true 는 안써도 됌
					mp3.stop();
				}
				index--;

				// 첫번째 곡 재생 중에 이전곡 -> 제일 마지막 곡으로
				if (index < 0) {
					index = list.size() - 1;
				}
				String singer = list.get(index).getSinger();
				String title = list.get(index).getTitle();
				int playTime = list.get(index).getPlayTime();

				System.out.printf("%s - %s(%d초)\n ", singer, title, playTime);
				mp3.play(list.get(index).getPath());
			} else if (menu == 4) {
				// 다음곡
				if(mp3.isPlaying() == true) { // == true 는 안써도 됌
					mp3.stop();
				}
				index++;

				// 3개의 인덱스( 0 , 1, 2 ) 2번인덱스 듣다가 다음곡 -> 3번인덱스 (인덱스가 사이즈와 같아지면 3번인덱스(존재x) = 사이즈
				// 3) =>0번 인덱스로 넘어가야함
				if (index >= list.size()) {
					index = 0;
				}
				
				
				//menu==1 일때 재생하는 코드 그대로
				String singer = list.get(index).getSinger();
				String title = list.get(index).getTitle();
				int playTime = list.get(index).getPlayTime();
				
				System.out.printf("%s - %s(%d초)\n " , singer , title, playTime);
				mp3.play(list.get(index).getPath());
			}else if(menu == 5) {
				// 종료
				System.out.println("플레이어를 종료합니다!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
