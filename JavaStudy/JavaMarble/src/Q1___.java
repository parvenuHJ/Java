import java.util.Scanner;

public class Q1___ {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		int i=0 ;
		
		do {
			i++;
			System.out.print(i + "주차 감량 몸무게 : ");
			int gam = sc.nextInt();
			now -= gam;
			
		}while (now > goal);
		
		System.out.println(now + "kg 달성!! 축하합니다!");
		
		
	}

}
