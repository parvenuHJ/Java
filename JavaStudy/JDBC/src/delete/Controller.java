package delete;

public class Controller {

	public void delete (MemberDTO dto) {
		
		
		
		MemberDAO dao = new MemberDAO();
		int cnt = dao.delete(dto);
		if(cnt > 0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		
		
		
		
		
	}
	
	
	
	
}
