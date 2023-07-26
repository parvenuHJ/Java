
public class Contact {

	// 필드
	private String name; // 앞에 아무것도 안써있으면 public 이 생략되어있음
	private int age;
	private String tel;
	private String address;
	
	
	// 생성자 메소드 // 우클릭 - source - generate constructor using fields
	public Contact(String name, int age, String tel, String address) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.address = address;
	}


	// 우클릭 - source - generate getter and setter
	public String getName() { // getter 메소드
		return name;
	}


	public void setName(String name) { // setter 메소드
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
