package 월급계산프로그램;

public class RegularEmployee extends Employee {

	// 필드 : 데이터 속성 변수
//	String empno; // 사번
//	String name; // 이름
//	int pay; // 연봉
	int bonus; // 보너스

	
	
	// 메서드 : 객체의 행위 ,기능
	// 생성자 메소드 : 객체를 생성과 동시에 초기화 시켜주기 위해서 생성자를 만든다!
	// 특징 : 클래스의 이름과 같다, 리턴타입이 없다 void 도 없음, 
	// 기본생성자는 새로운 생성자가 생기면 기능을 잃는다. -> 사용하고 싶으면 눈에 보이는 코드로 작성해준다
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);	// 수퍼클래스의 생성자 키워드 
		this.bonus = bonus;
	}


	@Override
	public int getMoneyPay() {

		return (pay+bonus)/12;
	}
	



//	public String print() {
//
//		return empno +" : "+ name +" : "+ pay;
//	}

}
