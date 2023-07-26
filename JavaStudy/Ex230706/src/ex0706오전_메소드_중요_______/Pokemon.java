package ex0706오전_메소드_중요_______;

public class Pokemon {

	// Pokemon 필드
	private String name; // 이름
	private String type; // 속성
	private String gender; // 성별
	private int hp; // hp
	private int atk; // 공격력
	private int dpd; // 방어력
	private String skill;
	
	
	// private 는 이 클래스에서만 사용가능하니까 getter setter 메소드( 이 메소드는 public으로 되어있으니까) 를 통해 다른 곳에 불러올 수 있음
	// getter 메소드
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public int getDpd() {
		return dpd;
	}
	
	public String getSkill() {
		return skill;
	}
	
	
	
	
	
	
	
	
	
	// 메소드 
	public Pokemon(String name, String type, String gender, int hp, int atk, int dpd, String skill) {
		this.name = name;
		this.type = type;
		this.gender = gender;
		this.hp = hp;
		this.atk = atk;
		this.dpd = dpd;
		this.skill = skill;
	}

	
	
	
}
