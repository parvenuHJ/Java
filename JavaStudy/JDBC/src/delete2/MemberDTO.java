package delete2;

public class MemberDTO {

	// 필드
	private String id;
	private String pw;
	
	// 생성자 메소드
	public MemberDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	// getter 메소드
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}
	
	
	
	
}
