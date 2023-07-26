
public class MeQ36_num1num2 {

	public static void main(String[] args) {

		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1, num2, op));
		
		
		
		
		
		
	}

	private static int cal(int num1, int num2, char op) {

		if(op == '-') {
			return num1-num2;
		}else if(op == '+') {
			return num1+num2;
		}else if(op == '*') {
			return num1*num2;
		}else {
			return num1/num2;
		}
		// 빠져나가는게 없으면 ( else if ->  마지막에 return 0; 을 적어줘야함 )
	}
	
	
	
	

}
