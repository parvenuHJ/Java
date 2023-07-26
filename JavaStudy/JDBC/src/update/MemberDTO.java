package update;

public class MemberDTO {
//데이터 트랜스퍼 => 데이터가 움직일때 필요한 코드들
	
	
	// 필드
	private String id;
	private String pw;
	private String name;
	
	// 생성자 메소드
	public MemberDTO(String id, String pw, String name) {

		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	
	// getter, setter 메소드
	// 여기서 우리는 실제로 setter를 사용하지않고 getter만 사용하기 때문에 이것은 DTO가 아니라 VO를 사용하는 것임
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
