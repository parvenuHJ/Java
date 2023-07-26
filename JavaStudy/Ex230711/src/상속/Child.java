package 상속;

public class Child extends Parent {

	// 자식/서브/하위 클래스
	
	// 재정의 - 오버라이딩
	// 조건 : 메소드이름동일. 매개변수 갯수 및 데이터타입 동일, 리턴타입 동일
	public void makeTteokbokki() {
		System.out.println("맛있게 치즈떡볶이 만들기");
	}

	@Override // annotation  : 기능을 하는 주석
	public void makeKimbap() {
		System.out.println("맛있게 돈가스김밥 만들기");
//		super.makeKimbap();	// super : 상위클래스의 , .makeKimbap(); : 이 메소드를 그대로 실행시켜줘
	}
	
	public void makeFry(){
		System.out.println("맛있게 프라이만들기");
	}
	
	
	
}
