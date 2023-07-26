package Model;

public class BookDTO {

	// 테이블 명 : book
	// 컬럼
	// 1. 도서이름 : String - title : varchar(50)
	// 2. 저자 : String - name : varchar(50)
	// 3. 가격 : int - price : number
	// 4. 도서 번호  : String - bookNum : varchar(50)
	// 콩쥐팥쥐 전래동화저자 5000 E-200
	
	
	
	private String title;
	private String name;
	private int price;
	private String bookNum;
	
	// insert 의 생성자 메소드
	public BookDTO(String title, String name, int price, String bookNum) {
		super();
		this.title = title;
		this.name = name;
		this.price = price;
		this.bookNum = bookNum;
	}

	// selectOne의 생성자 메소드
	public BookDTO(String title) {
		this.title = title;
	}
	
	// selectAll의 생성자 메소드
	public BookDTO() {
		
	}
	

	
	public void setTitle(String title) {
		this.title = title;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}


	public String getTitle() {
		return title;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public String getBookNum() {
		return bookNum;
	}
	
	
	
	
	
	
	
}
