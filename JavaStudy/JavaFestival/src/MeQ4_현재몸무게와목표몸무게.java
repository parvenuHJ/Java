import java.util.Scanner;

public class MeQ4_현재몸무게와목표몸무게 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int week = 0;
		int gam = 0;
		

		do {
			week++;
			System.out.print(week + "주차 감량 몸무게 : ");
			gam = sc.nextInt();
			now -= gam;
			
		}while (now > goal );
		
		System.out.println(now + "kg 달성!! 축하합니다!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
