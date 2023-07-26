
public class MeQ24_아래와같이학생들의 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String [] array = score.split("");
		

		int a = 0; //A를 카운트
		int b = 0; //B를 카운트
		int c = 0; //C를 카운트
		int d = 0; //D를 카운트
		int f = 0; //F를 카운트		
		
		
		
		for(int i=0 ; i<array.length ; i++) {
			if(array[i].equals("A")) {
				a++;
			}else if(array[i].equals("B")) {
				b++;
			}else if(array[i].equals("C")) {
				c++;
			}else if(array[i].equals("D")) {
				d++;
			}else if(array[i].equals("F")) {
				f++;
			}
		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");		
		
	}

}
