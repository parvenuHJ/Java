import java.util.Scanner;

public class Q10_행개수를입력받아다음과같이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int hang = sc.nextInt();
		int i = 0;
		String star = "";
		
		
		while(i < hang) {
			i++;
			star += "*";
			System.out.println(star);
		}
		
		System.out.println("------------------");
		
		
		for(int k = 1; k <=hang ; k++ ) {
			for(int j = 1; j <= k ; j++ ) {
				System.out.print("*");
		}System.out.println();
		}// k=1일때 * 하고 줄바꿈 / k=2일때 **하고 줄바꿈 / ...
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
