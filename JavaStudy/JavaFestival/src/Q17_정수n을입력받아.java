import java.util.Scanner;

public class Q17_정수n을입력받아 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		// 1 / 1+1=2 / 2+2 =4 / 4+3 =7
		// 1 + i++;
		int sum = 1;
		
		for(int i = 0 ; i < num ; i++) {
			sum += i;
			System.out.print(sum + " ");
		}
		
		
		
	
	}

}
