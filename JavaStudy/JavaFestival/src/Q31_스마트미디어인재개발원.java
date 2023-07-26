import java.util.Scanner;

public class Q31_스마트미디어인재개발원 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		System.out.println("=== 채점하기 ===");
		String ox = sc.next();
		
		String [] array = new String [ox.length()];
		array = ox.split("");
		
		
		for (int i = 0 ; i < array.length ; i++) {
			switch(array[i]) {
			case "o":{
				count++;
				sum += count;
				break;
			}
			case "x":{
				count = 0;
				break;
			}
			
			
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
