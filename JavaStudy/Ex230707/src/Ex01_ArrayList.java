import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {

		// 1. ArrayList 선언 및 생성
		ArrayList<Integer> list = new ArrayList<Integer>(); //<- () 있으니 기본생성자메소드
		// Interger는 I 대문자로, 
		
		// 2. 값 추가
					 // 알아서 아래의 인덱스에 들어감
		list.add(5); // 0번 인덱스
		list.add(4); // 1번 인덱스
		list.add(3); // 2번 인덱스
		
		// 3. 값 조회
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(i +"번 인덱스 : " + list.get(i));
		}
		
		// 4. 내가 원하는 위치에 값 추가
		list.add(1, 44);
		System.out.println("원하는위치에값추가후");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(i +"번 인덱스 : " + list.get(i));
		}
		
		
		// 5. 값 삭제
		list.remove(1);
		System.out.println("원하는인덱스값 삭제후");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(i +"번 인덱스 : " + list.get(i));
		}
		
		// 6. 모두 삭제
		list.clear();
		System.out.println("모두 삭제후");
		System.out.println("list배열의 크기 : " + list.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
