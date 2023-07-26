
public class PiggyBank {

	// 1. 필드
	// 자본 : money (int)
	private int money;
	
	
	
	// 2. 메소드 (저금 : deposit, 출금 : withdraw , 잔액 : showMoney)
	
//	public PiggyBank(int money) {
//		super();
//		this.money = money;
//	}
	//필드가 하나라서 위는 굳이 필요없다....................?!
	
	

	// 저금하는 메소드
	// 사용자가 저금할 돈(매개변수)을 입력하면 현재 자본(money)에 추가되는 기능  -- 리턴없음
	public void desosit(int input) {
		money += input;
	}
	

	// 출금하는 메소드
	// 사용자가 출금할 돈(매개변수)를 입력하면 현재 자본(money)에 차감되는 기능  -- 리턴없음
	public void withdraw(int output) {
		money -= output;
	}
	
	
	// 잔액을 보여주는 메소드
	// 현재 자본을 출력해주는 기능    -- 매개변수없음 , 리턴없음
	public void showMoney() {
	
		System.out.print("잔액 >> " + money + "\n");
	}

	
	
	
}
