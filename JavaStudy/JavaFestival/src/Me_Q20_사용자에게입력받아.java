import java.util.Scanner;

public class Me_Q20_사용자에게입력받아 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int star [] = new int [5];
		
		for(int i = 0 ; i < star.length ; i++) {
			System.out.print(i + "번째 별의 수 : ");
			star[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < star.length ; i++) {
			System.out.print(star[i] + " : ");
			for(int k = 1 ; k <= star[i] ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
		
		
		
		
		
		
		
		}
		
		
		
		
		
	}


