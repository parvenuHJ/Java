package 월급계산프로그램;

public abstract class Employee {
	

	// 정규직, 비정규직, 아르바이트생이 가지는 공통적인 필드와 메소드
	
	// default
	// public : 클래스 내/외부에서 마음대로 접근가능
	// private : 클래스 내부에 설계되어있는 매서드를 통해서만 접근가능
	// protected : 상속관계에 있는 클래스에서만 접근이 가능
	
	
	
	// 필드 //protected를 씀으로써 캡슐화(정보은닉)을 더 가능케함
	protected String empno;
	protected String name;
	protected int pay;
	
	
	// 부모클래스가 생성자를 포함하고 있으면
	// 반드시 자식클래스에서 생성자가 구현되어야 한다.
	public Employee(String empno, String name, int pay) {
		this.empno=empno; // 현재 클래스에 있는 empno를 empno로 초기화한다 라는 뜻
		this.name = name;
		this.pay = pay;
	}
		
	// 추상 메소드
	// getMoneyPay() ---> 구현{}  바디 부분이 다 다름  ==>틀만 부모클래스에서 설계해준다 ===> 추상메소드로 만들어준다
	public abstract int getMoneyPay();
	
	
	
	
	
	// print() --> {} 바디 부분까지 똑같았음
	// 자식 클래스에서 따로 안적어도됨
	public String print() {
		return empno +" : "+ name +" : "+ pay;
	}
	
	
	
	
	
	

}
