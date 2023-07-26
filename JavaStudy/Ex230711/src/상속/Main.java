package 상속;

public class Main {

	public static void main(String[] args) {

		// 부모님 가게
		Parent p = new Parent();
		p.makeTteokbokki();
		p.makeKimbap();
		
		// 2호점 가게 
		Child c = new Child();
		c.makeTteokbokki();
		c.makeKimbap();
		
		
		// Casting
		// 형변환 -> 레퍼런스(Object=객체) 타입의 형변환은 어떻게 일어날까?
		// 레퍼런스 타입의 형변환 : 상속이 전제되어 있어야 함
		
		// Upcasting
		// 자식클래스가 부모클래스로 자동으로 형변환이 되는것
		
		Parent p1 = new Child();
		p1.makeTteokbokki();
		p1.makeKimbap();
		// p1.makeFry(); --> 오류 이유 : 상위 클래스의 변수, 메소드에만 접근가능
		
		// 객체(하위클래스)에 있는 모든 필드와 메소드에 접근할 수 있는게 아니라
		// 상위클래스의 필드와 메소드에만 접근 가능
		// 만약에 오버라이딩 된 메소드가 있다면 하위클래스의 메소드 호출!
		
		
		System.out.println("===============================");
		// Downcasting
		Child c1 = (Child) new Parent();     // 업케스팅 된 것을 강제적으로 형변환
		c1.makeFry();	// 내가만든 객체는 Parent (떡볶이, 김밥)   --> Child 로 강제 형변환 
		c1.makeKimbap();
		c1.makeTteokbokki();
		// 런타임 오류 -> 실행하고나서 오류를 알 수 있음
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
