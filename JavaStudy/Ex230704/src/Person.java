
public class Person {

	// 클래스로 그냥 틀만 만들어 놓을거라서 main method 필요 없음
	
	// 창조주가 되어서 원하는 사람을 만들자!
	// 설계도 
	
	// 클래스의 구조
	// 1. Field - 특정 속성 데이터적으로 정의할 수 잇는 것
	String name;
	String gender;
	double height;
	
	
	
	// 생성자 메소드 --> 생성과 동시에 필드에 값을 적용 (위치는 아래 맘대로 막 생겨버림..)
	// 생성자 메소드의 특징
	// 1. 리턴타입이 없다(void 자체도 없음)
	// 2. 메소드 이름은 클래스 이름과 동일
	// 3. 생성자는 new 키워드를 통해서만 이루어짐
	// 4. 객체를 생성할 때 한번만 호출
	public Person(String name, String gender, double height) {   	// 메소드 이름은 클래스 이름과 똑같이 알아서 됨
		super();
		this.name = name;
		this.gender = gender;
		this.height = height;
	}
	
	// 5. 생성자 메소드는 오버로딩(중복정의)이 가능
	// 기본 생성자, default 생성자
	// 생성자가 없는 클래스는 존재하지 않는다.
	// 객체 생성 시, 또다른 생성자가 없는 경우 compile할 때 기본 생성자가 자동으로 생성됨
	// but, 생성자가 하나 이상 존재하면 기본 생성자는 자동 생성되지 않음
	public Person() {
		
	}
	
	// 위 2개는  Person (매개변수 있을떄) , Person() --> 메소드 오버로드 된것임
	
	// 2. Method - 기능 행동 
	public void talk() {			// static - > main() 가 있는 곳에서 메소드 생성할 때만 필요
		System.out.println("조잘조잘 말하기");
	}
	

	public void eat() {
		System.out.println("냠냠 맛있게 먹기");
	}
	
	
}
