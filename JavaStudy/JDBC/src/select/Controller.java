package select;

public class Controller {

	
	public void selectCon(MemberDTO dto) {
		
		String data = new MemberDAO().select(dto);
		
		if( data.equals("")) {
			System.out.println("로그인 실패!");
		}else {
			System.out.println(data + "님 환영합니다!");
		}
		
		
		
		
	}
	
	
}

