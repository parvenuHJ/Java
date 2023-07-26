import java.util.Scanner;

public class Q5_AB숫자를입력받는다 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("A 입력 >> ");
			int n1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int n2 = sc.nextInt();
			
			int result = n1 - n2;
			
			if(n1 == 0 && n2 == 0) {
				break;
			}else {
				System.out.print("결과 >> " + result + "\n");
			}
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
