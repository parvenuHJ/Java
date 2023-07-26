
public class PiggyBankMain {

	public static void main(String[] args) {

		// 객체생성
		
		PiggyBank pig = new PiggyBank(); // 메소드를 호출하기 위해
		
		//1500, 700 저금하기
		pig.desosit(1500);
		pig.desosit(700);
		pig.showMoney();
		
		// 500 출금하기
		pig.withdraw(500);
		pig.showMoney();
	}

}
