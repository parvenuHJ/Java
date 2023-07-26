import java.util.Scanner;

public class Q1_정수입력받아 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		
		if (num%10 >4) {
			System.out.print("반올림 수 : " + (num+10-num%10));
		}else {
			System.out.print("반올림 수 : " + (num-num%10));
		}
		
	}

}
