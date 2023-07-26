import java.util.Random;
import java.util.Scanner;

public class MeQ12_랜덤으로정수2개를뽑아 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Random rd = new Random();
		
		
		
		int chance = 0;
		
		do {
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
			System.out.print(num1 + "+" + num2 + "= ");
			int sum = sc.nextInt();
			chance++;
			if(num1+num2==sum) {
				System.out.println("SUCCESS!");
				break;
			}else{
				System.out.println("FAIL...");
			}
		}while(chance<5);
		System.out.println("GAME OVER!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
