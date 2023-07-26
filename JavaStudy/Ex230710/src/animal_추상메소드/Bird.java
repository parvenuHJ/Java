package animal_추상메소드;

// Animal 클래스 상속 - > extends
public abstract class Bird extends Animal {	 	// abstract --> 추상메소드를 하나라도 가지고있으면 abstract입력해줘야함
	
	// 하위, 서브, 자식 클래스
	
	// walk() -> "날기"
	// 재정의 = 오버라이딩
	// 오버라이딩 특징
	// 메소드 이름동일, 매개변수 개수 및 데이터타입, 리턴타입 동일해야함
	
	// 우클릭 source -> override/implemnet Methods 누르면 어떤 메소드를 오버라이딩 할것인지 목록이 나와서 선택 할 수 있음!!!!!!!!!!
	
	

	@Override
	public void walk() {
		System.out.println("날기");
		
	}
	
	// 조류라면 무조건 가지고 있는 특징
	// body 가 없는 추상메소드
	// 상위클래스의 메소드(기능)을 무조건 구현시키고 싶을 때 사용
	public abstract void egg();
	
	
	

}
