package animal_추상메소드;

public class Chicken extends Bird {

	// walk()    animal(walk) -> Bird(walk) -> Chicken(walk) :  walk()매소드 또 오버라이딩
	public void walk() {
		System.out.println("날지못함");
		
	}


	
	// egg() 메소드 구현하기
	// 수퍼클래스 Bird 의 추상메소드를 안적으면 오류남!!!!!!!!!!!!!!!!!!!!!!!!
	
	@Override
	public void egg() {
		System.out.println("닭 알 낳기");
	}
	
	
	
	
	
	
	
}
