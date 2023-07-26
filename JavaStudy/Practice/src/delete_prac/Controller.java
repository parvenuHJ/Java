package delete_prac;



public class Controller {

	
	public void delete (MDTO dto) {
		
		MDAO dao = new MDAO();
		int cnt = dao.delete(dto);
		if(cnt > 0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		
		}
	}
	
	
}
