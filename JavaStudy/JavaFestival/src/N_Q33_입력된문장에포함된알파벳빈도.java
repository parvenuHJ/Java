import java.util.Scanner;

public class N_Q33_입력된문장에포함된알파벳빈도 {

	public static void main(String[] args) {

		// 알파벳 빈도수 구하기
		// 1. 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);

		// 2. 문자열 입력받기 ----> nextLine()
		System.out.print("입력 >> ");

		// next() ---> 스페이스바 기준으로 앞쪽만 기억을함 ex) smart Media 입력 -> smart 만 저장됨
		//	String str = sc.next();
		//	System.out.println(str1);

		// nextLine() ---> enter 할때까지 모두 기억
		// .toLowerCase() ---> 문자열을 소문자로 바꿔주는 메소드
		String str = sc.nextLine().toLowerCase();

		// .toCharArray() - > char로 쪼개서 배열에 저장해주는 메소드
		char[] alpha = str.toCharArray();

		// 3. 알파벳들의 갯수가 저장될 int [] index 배열 만들기 26개 배열
		// index[0] : a의 갯수
		int[] cnt = new int[26];

		// 유니코드 a ---> 97 , z ---> 122
		// char --> int : a->97 list[97-97=0]
		// char --> int : z->122 list[122 - 97 = 25]

		// alpha에 들어있는 소문자가 뭔지 판단을 해서 해당 알파벳의 갯수가 저장되는 cnt에 +1 해주자

		for (int j = 0; j < alpha.length; j++) {
			for (int i = 'a'; i <= 'z'; i++) { //
				if (alpha[j] == i) {
					cnt[i - 97]++;

				}
			}

		}

		// a : list[0] -----> (char)97 : list [97-97]

		for (int i = 97; i <= 122; i++) {
			System.out.println((char) i + " : " + cnt[i - 97]);
		}
				
			
			
			
		
		
		
		
		
		
	}

}
