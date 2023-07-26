package animal;

public class Main {

	public static void main(String[] args) {

		
		// Dog, Cat, 객체 만들기
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		c.eat();
		// 형제 클래스끼리는 캐스팅 불가
		
		
		
		
		// Upcasting
		// 하위 타입을 상위타입으로 형변환
		Animal a =c;
		a.eat();
		// a에는 Animal 객체가 아니라 Cat 객체의 주소값이 들어있음
		// -> 실제 객체가 변환되는게 아니라 껍데기가 상위타입으로 변환되는 것
		
		
		
		// Downcasting : 업케스팅 된 객체를 원래의 객체로 되돌려주는것
		// 상위 타입을 하위타입으로 형변환  ---> 부모를 자식으로 형변환하는거라 강제로 형변환해야함
//		Cat c2 = (Cat)new Animal(); -> 메모리적으로 불가능  동물은 고양이다 -> 불가능
		Cat c2 = (Cat)a;
		
		
		
		
		
		
	}

}
