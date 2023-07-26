import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_MusicList {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> music = new ArrayList<String>();
		
		System.out.println("====Music Play List====");
		while(true) {
			System.out.print("[1] 노래 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("[1] 원하는 위치에 추가 [2] 마지막 위치에 추가 >> ");
				int place = sc.nextInt();
				if(place == 1) {
					System.out.print("추가할 위치 : ");
					int place_num = sc.nextInt();
					System.out.print("제목 입력 >> ");
					String place_name = sc.next();
					music.add(place_num -1 , place_name); // 사용자가 1번위치에 추가하면 0번 인덱스에 들어가게
				}else {
					System.out.print("제목 입력 >> ");
					String name = sc.next();
					music.add(name);
				}
				
				
				
			}else if(num ==2){
				System.out.println("======================== 현재 재생 목록 ========================");
				if(music.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				}else {
					for(int i = 0 ; i < music.size() ; i++) {
						System.out.println((i+1) + ". " +music.get(i));
					}
				}
				
			}else if(num == 3) {
				System.out.print("[1] 선택 삭제 [2] 전체 삭제 >> ");
				int delete = sc.nextInt();
				if(delete == 1) {
					System.out.print("삭제할 번호 : ");
					int delete_num = sc.nextInt();
					music.remove(delete_num-1);
					System.out.println(delete_num + "번 노래가 삭제되었습니다.");
				}else {
					music.clear();
					System.out.println("전체 삭제 성공!");
				}
				
			}else {
				System.out.println("프로그램 종료!");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
