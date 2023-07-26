package 인터페이스;

public interface Pokemon {

	// 인터페이스는 프로젝트 지침서, 규칙, 설계만 되어있다.
	// 추상메서드만 포함할 수 있다!!
	
	final String name = "피카츄"; // 필드들도 무조건 상수로 존재해야한다.
	
	// 일반공격
	public abstract void atk();
		
	// 특수공격
	public abstract void specialAtk();
	
	
}
