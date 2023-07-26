package 월급계산프로그램;

public class TempEmployee extends Employee {

	// 필드 : 데이터 속성 변수
//	String empno; // 사번
//	String name; // 이름
//	int pay; // 연봉
	
	// 생성자 메소드
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name,pay);
		
	}
	
	@Override
	public int getMoneyPay() {
		return pay / 12;
	}
	

//	public int getMoneyPay() {
//
//		return pay / 12;
//	}
	
//	public String print() {
//
//		return empno +" : "+ name +" : "+ pay;
//	}


	
	
	
	
	
	
	
	
}
