package calculator;

public class Circle extends Figure{

	private double radius;

	
	
	// 생성자 메소드
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	
	// 원 넓이 구해주는 메소드
	public double calArea() {	// Figure 부모클래스의 calArea()를 오버라이딩
		return 2*3.14*radius*radius;
		
	}
	
	
	
}
