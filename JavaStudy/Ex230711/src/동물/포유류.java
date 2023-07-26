package 동물;

//import animal.Animal;

public class 포유류 extends Animal {

	
	// 추상메소드를 상속받는 자식클래스는
	// 반드시 추상 메소드를 구현해야한다.
	
	@Override
	public void move() {
		
		System.out.println("네 발로 움직인다.");
		
	}
	

	
}
