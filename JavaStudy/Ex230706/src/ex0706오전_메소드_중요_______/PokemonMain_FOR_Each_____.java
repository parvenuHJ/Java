package ex0706오전_메소드_중요_______;

public class PokemonMain_FOR_Each_____ {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료형[] 배열이름 = new 자료형[배열크기];
		// 포켓몬 자료 3개를 저장할 수 있는 배열 생성 -> bag
		Pokemon [] bag = new Pokemon[3];
		
//		Pokemon pk1 = new Pokemon("피카츄", "전기", "수컷", 1000, 100, 50, "전기발사");   // new pok 만 하고 자동완성 하면 () 안에 데이터 타입 다 뜸!!!!!!!!!!!!!!!!!!!
//		Pokemon pk2 = new Pokemon("꼬부기", "물", "수컷", 2000, 200, 10, "물발사");
//		Pokemon pk3 = new Pokemon("이상해씨", "풀", "수컷", 500, 500, 20, "풀발사");
//		
//		
//		
//		
//		// bag[0]에 포켓몬 하나 넣기
//		bag [0] = pk1;
//		bag [1] = pk2;
//		bag [2] = pk3;
		
		
		// 더 간단하게하는법 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		// bag[]에 포켓몬 넣기
		bag [0] = new Pokemon("피카츄", "전기", "수컷", 1000, 100, 50, "전기발사");
		bag [1] = new Pokemon("꼬부기", "물", "수컷", 2000, 200, 10, "물발사");
		bag [2] = new Pokemon("이상씨", "풀", "암컷", 500, 500, 20, "풀발사");
		
		
		// for문을 사용해서 배열안에 들어있는 포켓몬들의 이름, 속성, hp, atk, dpd, 스킬
		// 형식
		// ===== 포켓몬 정보 출력 =====
		// 1) 피카츄 전기 1000 100 50 백만볼트
		// 2) 꼬부기 물 2000 200 10 물대포
		// 3) 이상씨 풀 500 500 20 풀발사
		
		System.out.println("===== 포켓몬 정보 출력 =====");
//		for(int i = 0 ; i < bag.length ; i++) {
//			System.out.println(i+1 + ") " + bag[i].getName() +"\t" + bag[i].getType()+"\t" + bag[i].getHp()+"\t"
//							   + bag[i].getAtk()+"\t" + bag[i].getDpd()+"\t" + bag[i].getSkill());
//		}
		
		for(int i = 0 ; i < bag.length ; i++) {
			System.out.printf("%d) %s\t %s\t %d\t %d\t %d\t %s\n" ,
							   i+1, bag[i].getName(), bag[i].getType() , bag[i].getHp(), bag[i].getAtk(), bag[i].getDpd() , bag[i].getSkill());
			
		}
		
		
		// for - each (확장 for문)
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작원리
		// 배열안에 저장되어있는 데이터를 for문에서 순차적으로 꺼내서
		// :(콜론) 기준으로 왼쪽에 있는 변수에 담아 사용한다.
		// for(자료형 변수명 : 배열이름) - > 알아서 0번 인덱스부터 마지막 인덱스까지 뽑아줌 
		System.out.println("==== for-each ====");
		int i = 1;
		for(Pokemon poke : bag) {			// 이 for문 안에서만 쓰이는 poke 라는 변수를 새로 만든것
			System.out.printf("%d) %s\t %s\t %d\t %d\t %d\t %s\n", 
							    i++, poke.getName(), poke.getType(), poke.getHp(), poke.getAtk(), poke.getDpd(), poke.getSkill());
		}
		
		
		
		
		
		
		
		
		
	}

}
