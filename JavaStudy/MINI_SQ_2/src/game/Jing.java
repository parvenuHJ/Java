package game;

public class Jing {

	
	
	public static void progress(String[][] arr_glass2,int turn2) {
		for (int i = 0; i < arr_glass2.length; i++) {
			System.out.print("│");
			for (int j = 0; j < arr_glass2[i].length; j++) {
				System.out.print("   "+arr_glass2[i][j]+"   ");
			}
			System.out.print("│");
			if(i==turn2+1) System.out.println("<-------현위치");
			else System.out.println();
		}
	}

}
