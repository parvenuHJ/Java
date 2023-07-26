package 동물;

public abstract class Animal {
	// 추상메소드가 정의되어있는 클래스는 반드시 추상클래스가 되어야 한다.
	// 추상클래스는 반드시 추상메소드를 포함할 필요는 없다.
	
	public void eat() {
		System.out.println("먹다");
		
	}
	
	public void sleep() {
		System.out.println("자다");
	}
	
	// 추상 메소드 : body {} 가 없는 메소드
	// abstract : 추상 키워드
	public abstract void move() ;
	
	
	
}
