package 월급계산프로그램;

public class PartTimeEmployee extends Employee {

	
//	String empno; //사번
//	String name; //이름
//	int pay; //일당
	int workDay; //일수
	
	
	// 메소드
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);	// 수퍼클래스의 생성자 키워드 
		this.workDay = workDay;
	}
	
	@Override
	public int getMoneyPay () {
		
		return pay*workDay;
	}
	
//	public String print() {
//		
//		return empno +" : "+ name +" : "+ pay;
//	}
//	
	
	
	
	
	
}
