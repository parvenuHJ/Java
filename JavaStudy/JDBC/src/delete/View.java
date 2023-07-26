package delete;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		MemberDTO dto = new MemberDTO(id, pw);
		
		
		Controller con = new Controller();
		
		con.delete(dto);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
