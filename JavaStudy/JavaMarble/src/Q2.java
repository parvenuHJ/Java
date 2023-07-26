import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int money = 0;
		
		
		if(time < 8) {
			money = 5000 * time;
			System.out.print("총 임금은 " + money + "원 입니다." );
		}else {
			money = (int) ((5000 * 8) + (1.5*5000*(time-8)));
			System.out.print("총 임금은 " + money +"원 입니다.");
		}
		
		
		
		
		
	}

}
