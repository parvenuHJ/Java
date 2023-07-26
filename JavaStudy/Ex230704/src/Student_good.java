
public class Student_good {

	// 1. 필드
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;



	public Student_good(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
	super();
	this.name = name;
	this.number = number;
	this.age = age;
	this.scoreJava = scoreJava;
	this.scoreWeb = scoreWeb;
	this.scoreAndroid = scoreAndroid;
}



	// 학생들 정보를 출력하는 show() 메소드 만들기
	public void show() {
		System.out.printf("%s님 안녕하세요 . %n"
						  + "[%s, %d살]%n"
						  + "%s님의 java점수는 %d점입니다.%n"
						  + "%s님의 Web점수는 %d점입니다.%n"
						  + "%s님의 Android점수는 %d점입니다.%n"
						  ,name, number,age,scoreJava,scoreWeb,scoreAndroid
						  + "===============================");
	}
}