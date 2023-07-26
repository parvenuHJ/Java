package for문;

public class Ex01실습1 {

	public static void main(String[] args) {

		//내 답
		for (int num=0 ; num<10 ; num++ ) {
			int res = 2*num;
			System.out.println("2*"+num+"="+res);
		}
		//good 반복문을 쭉 적어보고 안바뀌는 부분은 써놓고 바뀌는 부분만 for문 이용
		for (int i = 1; i<=9 ; i++) {
			System.out.println(2+"*"+i+"="+2*i);
		}
		
	}

}
