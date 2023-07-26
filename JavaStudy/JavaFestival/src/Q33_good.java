import java.util.Scanner;

public class Q33_good {

	public static void main(String[] args) {

	      Scanner input = new Scanner(System.in);
	      
	      System.out.print("==== 알파벳 빈도수 구하기 ====\n입력>> ");
	      String answer = input.nextLine();
	      
	      // 문장을 입력 받아, 글자 단위로 저장
	      String[] arr = answer.split("");
	      
	      // 알파벳을 대소문자 구분없이 세기 위해 대소문자가 모두 들어간 배열 생성
	      String[] alphabet = {
	            "a", "A", "b", "B", "c", "C", "d", "D", 
	            "e", "E", "f", "F", "g", "G", "h", "H", 
	            "i", "I", "j", "J", "k", "K", "l", "L", 
	            "m", "M", "n", "N", "o", "O", "p", "P", 
	            "q", "Q", "r", "R", "s", "S", "t", "T", 
	            "u", "U", "v", "V", "w", "W", "x", "X", 
	            "y", "Y", "z", "Z"
	      	   					};
	      int n = arr.length; // 입력받은 문장의 배열 크기
	      int m = alphabet.length; // 알파벳이 모두 들어간 배열 크기
	      
	      int[] output = new int[26]; // 문장의 알파벳 갯수를 저장할 배열
	      
	      // 입력받은 문장의 길이만큼 전체 반복
	         // 알파벳을 모두 순회하며 갯수 세기
	      for (int i=0; i<n; i++) {
	         for (int j=0; j<m; j++) {
	            // 대소문자 구분이 없음으로 output 배열에 갯수 저장
	            if (arr[i].equals(alphabet[j])) {
	                  output[j/2] = output[j/2] + 1;
	            }
	         }
	      }
	      // 알파벳 갯수 출력
	      for (int i=0; i<output.length; i++) {
	         System.out.println((char)(97+i)+" : "+output[i]);
	      }
	      
	      input.close();
	      
	   }
}
