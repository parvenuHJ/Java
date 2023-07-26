
public class __Q35_가운데글자구하기 {

	
		public static void main(String args[]) {
	        System.out.println(getMiddle("test"));

		}
	    public static String getMiddle(String a) {
			
			String[] b = new String[a.length()-1];
			b = a.split("");
			String result = "";
			if(a.length()%2==1) {
				result = b[a.length()/2];
			}
			else {
				result = b[a.length()/2-1] + b[a.length()/2];
			}
			return result;
	    }
	}
