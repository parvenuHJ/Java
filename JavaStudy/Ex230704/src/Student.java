
public class Student {

	// 1. 필드
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	
	// 2. 변수가 많으니까 생성자 메소드 만들기  소스 - generate 생성자 with field
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}


	public String getName() {
		return name;
	}


	public String getNumber() {
		return number;
	}


	public int getAge() {
		return age;
	}


	public int getScoreJava() {
		return scoreJava;
	}


	public int getScoreWeb() {
		return scoreWeb;
	}


	public int getScoreAndroid() {
		return scoreAndroid;
	}
	
	
	
	
	
	
}
