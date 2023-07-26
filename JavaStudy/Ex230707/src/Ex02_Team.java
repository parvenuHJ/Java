import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02_Team {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. ArrayList 선인 및 생성
		ArrayList<String> team = new ArrayList<String>();

		// 팀원 수만큼 입력받아서 ArrayList(team)에 저장

//		for(int i = 0 ; i < team.size() ; i++) { // i < team.size() 을 넣게 되면 지금 team.size가 0이기 때문에 값이 입력이 안됨!!!!!!!!!!!!!!!!
//			System.out.print("이름을 입력하세요 : ");
//			String name  = sc.next();
//			team.add(i, name);					// team.add(name)으로 해도 어차피 0번 인덱스에 들어가기 때문에 똑같음
//		}

		for (int i = 0; i < 5; i++) { // 처음에 i < 5 로 몇명까지 추가할 건지 적어주는게 중요!!!!!! 안적어주면 무한으로 적게 된다!!!!!!!!!!!!!!!!!!
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			team.add(name);
		}

		// 팀원 출력하기
		System.out.print("연구개발팀의 팀원은 : ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		System.out.println("입니다.");

		// 팀원 퇴출시키기
		// 입력받은 이름이 ArrayList에 있다면 해당하는 이름 삭제
		System.out.print("퇴출시킬 이름 입력 : ");
		String out = sc.next();
		for (int i = 0; i < team.size(); i++) {
			if (out.equals(team.get(i))) {
				team.remove(i);
			}
		}

				
				
				
		// remove에 커서 놓고 ctrl space 바 눌러보명 remoeve(int index) 와 remove(object) 있는데
		// remove(object) 를 사용하여 team.remove(이름)을 적어도 됌
		// for문 안돌리고
//				if (out.equals(team.get(i))) {
//					team.remove(이름);
//				}
				
				
				
				

		// 퇴출 시키면 알아서 team.size가 하나 줄어듬
		
		// 팀원 이름 출력하기
		System.out.print("퇴출후 팀원은 : ");
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + " ");
		}
		
		
		
		
		
		
		
	}

}
