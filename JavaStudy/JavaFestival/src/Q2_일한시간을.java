import java.util.Scanner;

public class Q2_일한시간을 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int hour = sc.nextInt();
		if (hour<8) {
			System.out.println("총 임금은 "+hour*5000+"원 입니다.");
		}else {
			System.out.println("총 임금은 "+(int)(8*5000+(hour-8)*5000*1.5)+"원 입니다.");
			//int(정수형)에 실수 곱해져서 실수로 결과값이 나옴--> 여기에 다시 (int)로 강제 형변환-> 값이 정수로 나옴!!!!!!!!
		}
	}

}
