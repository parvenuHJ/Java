package 동물;

public class Bird extends Animal{

	
	
	
	// alt + shift + s ---> Override 메뉴 --> 오버라이드 할 메소드 목록이 나옴
	//Animal 의 move 메소드를 오버라이딩
	@Override
	public void move () {
		System.out.println("날다");
		
	}
	
	
	public void egg () {
		System.out.println("알을 낳다");
	}
	
	
	
	
	
	
}
