import java.util.Random;
import java.util.Scanner;

public class HARDQ19_good {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int [] lotto = new int [6];
		
		for(int i = 0 ; i < lotto.length ; i++ ) {
			lotto [i] = rd.nextInt(45)+1;
			for(int k = 0 ; k < i ; k++ ) {
				if(lotto[i] == lotto[k] ) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < lotto.length ; i++ ) {
			System.out.println("행운의 숫자 : " + lotto[i]);
		}

	}

}
