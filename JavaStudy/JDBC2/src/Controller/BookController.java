package Controller;

import java.util.ArrayList;

import Model.BookDAO;
import Model.BookDTO;

public class BookController {

	BookDAO dao = new BookDAO();
	BookDTO dto = null;
	int cnt = 0;
	
	
	
	// insert 메소드
	public void insert(BookDTO dto) {
		
		cnt = dao.insert(dto); // dao의 결과값 : cnt
		
		if(cnt >0 ) {
			System.out.println("도서 등록에 성공했습니다.");
		}else {
			System.out.println("도서 등록에 실패했습니다.");
		}
		
	}
	
	
	// selectOne 메소드
	public void selectOne(String title) {
		
		
		dto = dao.selectOne(title);
		
		if(dto.getTitle().equals(title)) {
			System.out.printf("%s(%s) : %d원 - %s\n"
					,dto.getTitle(),dto.getName(),dto.getPrice(),
					dto.getBookNum());
		}else {
			System.out.println("찾으시는 책은 현재 제고가 없습니다.");
		}
		
	}
	
	
	
	
	// selectAll 메소드
	public void selectAll() {
		// 그냥 바로 출력해도 되지만 조직화 하기 위해서 컨트롤러를 거침
		ArrayList<BookDTO> list = dao.selectAll();
		
//		System.out.println(list.get(0).getTitle()); // -> 첫번째 목록 타이틀이 잘 넘어오는지 확인
		
		for(int i = 0 ; i <list.size();i++) {
			String title = list.get(i).getTitle();
			String name = list.get(i).getName();
			int price = list.get(i).getPrice();
			String bookNum = list.get(i).getBookNum();
			
			// 1. 해와달 (나무꾼) - 5000원 - A500번
			System.out.printf("%d. %s (%s) - %d원 - %s번\n"
						      ,i+1, title, name, price, bookNum );
			
		}
		
	}
	
	
	
	
	// delete 메소드
	public void delete(String bookNum) {
		
		cnt = dao.delete(bookNum);
		
		if(cnt>0) {
			System.out.println("책에 대한 정보가 삭제되었습니다.");
		}else {
			System.out.println("책 번호를 다시 한번 확인해주세요.");
		}
		
		
		
		
	}
	
	
	// update
	public void update(BookDTO dto) {
		
		cnt = dao.update(dto);
		
		if(cnt>0) {
			System.out.println(dto.getTitle()+"책 업데이트 성공");
		}else {
			System.out.println("업데이트 실패");
		}
		
	}
	
	
	
	
	
}
