package insert;

public class MemberDTO {

	// DTO : Data Transfer Object
	// 데이터를 하나의 자료형으로 묶어서 전달하기 위해 사용되는 객체 자료형
	
	
	// MemberTable에 있는 컬럼의 종류
	// id, pw, name, age
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 생성자
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	// getter/setter
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
}
