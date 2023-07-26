package calculator;

public class Triangle extends Figure{

	private double width;
	private double height;
	
	// 생성자 메소드
	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 삼각형 넓이를 구해주는 메소드
	public double calArea() {	// Figure 부모클래스의 calArea()를 오버라이딩
		return width*height*0.5;
		
	}
	
	
	
	
	
	
	
	
}
