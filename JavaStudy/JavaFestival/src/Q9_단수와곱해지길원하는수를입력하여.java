import java.util.Scanner;

public class Q9_단수와곱해지길원하는수를입력하여 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력: ");
		int dan = sc.nextInt();
		System.out.println("어느 수까지 출력 :");
		int soo = sc.nextInt();
		
		System.out.println(dan + "단");
		
		for(int i = 1 ; i<=soo ;i++ ) {
			System.out.print(dan+ "*"+soo+ "="+ dan*i+"\n");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
