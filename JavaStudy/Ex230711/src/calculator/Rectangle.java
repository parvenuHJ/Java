package calculator;

public class Rectangle extends Figure{

	private double width;
	private double height;
	
	// 생성자 메소드
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	
	// 사각형 넓이 계산해주는 메소드
	public double calArea() {	// Figure 부모클래스의 calArea()를 오버라이딩
		return width*height;
	}
	
	
	
	
}
