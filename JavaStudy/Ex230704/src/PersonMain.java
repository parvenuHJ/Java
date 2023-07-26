
public class PersonMain {

	public static void main(String[] args) {
		// 직접 실행할 클래스라서 main 필요
		
		// Person 설계도 클래스를 이용해서 사람(Object)이 만들어지는 클래스
		
		// 1. 사람(객체) 생성하기
		// 객체를 생성할 때 -> new 키워드 사용
		Person p1 = new Person(); // ()있으니까 Person은 메소드 (기본생성자메소드 -> public person() ...)
		
		p1.name = "김훈종";
		p1.gender= "남";
		p1.height = 190.9;
		
		System.out.println(p1); // p1은 레퍼런스 변수라서 p1만 출력하면 주소값이 나온다
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.height);
		
		p1.eat();
		p1.talk();
		
		
		
		Person p2 = new Person();
		
		p2.name = "차은우";
		p2.gender = "남";
		p2.height = 180.5;
		
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.height);
		
		p2.eat();
		p2.talk();
		
		Person p3 = new Person("유도언", "남", 170);
		
		
		
		
		
		
	}

}
