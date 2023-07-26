package insert;

public class Controller {

	
	// Controller : View와 Model 중간다리 역할
	// DAO에서 데이터를 삽입하는 기능 Insert에 접근하는 기능
	public void insert (MemberDTO dto) {
		// 1. 틀만 먼저 만들어줌 -> 일단 그냥 void로 적음
		MemberDAO dao = new MemberDAO();
		int cnt = dao.insert(dto);
		if(cnt > 0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
	}
	
	// delete 등 다른 기능 추가할떄...
	public void delete() {
		
	}

	

	
	
	
	
	
	
	
}
