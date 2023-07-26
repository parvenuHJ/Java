
package 동물;

public class Main {

	public static void main(String[] args) {

		// . : 참조하다
		// 자동완성 목록에서 초록색 동그라미 : 메소드 라는 뜻
		
		//추상 클래스는 인스턴스화 (오브젝트(객체)로 구현 할 수 없다)
//		Animal a = new Animal();
//		a.eat();
//		a.sleep();
//		a.move();
		
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.move();
		b.egg();
		
		Charm c = new Charm();
		c.eat();
		c.sleep();
		c.move();
		c.egg();
		c.cry();
		
		Penguin p = new Penguin();
		p.eat();
		p.sleep();
		p.move();
		p.sliding();
		
		
	
		
		
		
		
		
		
		
	}

}
