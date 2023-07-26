package while문;

import java.util.Scanner;

public class Ex03실습3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num2 = 0;
		int num3 = 0;
	
		
		while (true) {
			
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			
			if (num%2 == 0) {
				num2 += 1;
				System.out.println("짝수개수 : " + num2 + "\n홀수개수 : " + num3);
			}else if (num%2 == 1){
				num3 += 1;
				System.out.println("짝수개수 : " + num2 + "\n홀수개수 : " + num3);
				
			}if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
