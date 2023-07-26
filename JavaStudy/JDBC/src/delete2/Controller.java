package delete2;

import delete.MemberDAO;

public class Controller {

	
	public void delete(MemberDTO dto) {
		
		delete2.MemberDAO dao = new delete2.MemberDAO();
		int cnt = dao.delete(dto);
		if(cnt > 0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
