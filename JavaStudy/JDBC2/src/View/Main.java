package View;

import java.sql.PreparedStatement;
import java.util.Scanner;

import Controller.BookController;
import Model.BookDTO;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		BookDTO dto = null; // dto는 null값으로 둔 이유 : 그때그때 dto의 생성자가 다르기때문
		
		BookController con = new BookController(); // 컨트롤러는 불러오기만 하기때문에 항상 같음
		
		while(true) {
			
			
			System.out.print("[1]도서등록 [2]도서검색 [3]도서전체조회"
					+ " [4]도서삭제 [5]도서정보변경 [6]종료 중에서 입력 >> ");
			int select = sc.nextInt();
			
			if(select ==1) {
				// 도서등록 (insert)
				// 사용자로부터 책 제목 저자 가격 번호를 입력받아
				// 데이터베이스에 저장 !
				// 저장이 성공하면 "도서등록이 완료되었습니다!"
				// 저장이 실패하면 "도서등록에 실패했습니다. 다시 시도하세요"
				System.out.print("책 제목 >> ");
				String title = sc.next();
				System.out.print("책 저자 >> ");
				String name = sc.next();
				System.out.print("책 가격 >> ");
				int price = sc.nextInt();
				System.out.print("책 번호 >> ");
				String bookNum = sc.next();
				
				dto = new BookDTO(title, name, price, bookNum);
												
				con.insert(dto);
				
				
			}else if(select ==2) {
				// 도서검색 (selectOne)
				// 사용자가 책 제목을 검색했을 떄
				// 데이터가 있으면 "책 제목(저자) : 가격 - 책번호"
				// 데이터가 없으면 "찾으시는 책은 현재 제고가 없습니다."
				
				System.out.print("찾는 책 제목 입력 >> ");
				String title = sc.next();
				
				// title 하나만 넘길거라 dto에 안담고 Sting title을 그대로 넘겨도 됌
				//dto = new BookDTO(title); 
				//con.selectOne(dto);
				
				con.selectOne(title);
				
				
				
				
				
			}else if(select ==3) {
				// 도서전체조회 (selectAll)
				// 책 제목 가격 저자 번호  순으로 데이터가 쭉 출력
				
								
				con.selectAll();
			
			}else if(select ==4) {
				// 도서삭제 (delete)
				// 책 번호를 입력받아서 해당 책에 대한 정보를 삭제
				// 삭제성공시 "책에 대한 정보가 삭제되었습니다."
				// 삭제 실패시 "책 번호를 다시 한번 확인해주세요."
				System.out.print("삭제할 책 번호 : ");
				String bookNum = sc.next();
				
				con.delete(bookNum);
				
				
			}else if(select ==5) {
				// 도서정보변경 (update)
				// 책 제목을 입력받아 책의 번호와 책의 가격을 변경하자
				System.out.print("책 제목 >> ");
				String title = sc.next();
				System.out.print("책 번호 >> ");
				String bookNum = sc.next();
				System.out.print("책 가격 >> ");
				int price = sc.nextInt();
				
				// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// 귀찮으니까DTO 에 있는 insert의 bookDTO메소드를 사용 -> 주의) 필드 순서 주의!!
				dto = new BookDTO(title, null, price, bookNum);
				
				con.update(dto);
				
				
			}else if(select ==6) {
				// 종료
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시 선택해주세요!");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
