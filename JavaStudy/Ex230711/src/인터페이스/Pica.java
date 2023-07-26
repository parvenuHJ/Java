package 인터페이스;

public class Pica implements Pokemon{

	@Override
	public void atk() {

		System.out.println("주먹");
	}

	@Override
	public void specialAtk() {
		System.out.println("백만볼트");
	}

	// 인터페이스를 상속할때는 implements(구현)
	// extends -> 다중상속 불가능(여러개의 부모클래스를 가질수 없음)
	// implements -> 다중상속 가능(여러개의 부모클래스를 가질 수 있음) => 기능확장이 용이하도록 만들었음
	// -> 생성할때 browse 는 한개만 선택가능하지만, Add..를 누르면 다중선택 가능
	
	
	
	
}
