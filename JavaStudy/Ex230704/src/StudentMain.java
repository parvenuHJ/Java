
public class StudentMain {

	public static void main(String[] args) {

		// 객체 생성
		Student student1 = new Student("홍길동", "20220614", 20, 60, 80, 55);
		Student student2 = new Student("이주희", "19961025", 27, 55, 36, 85);
		
		// 배열만들기
		Student [] stuArray = new Student[2];
		stuArray[0] = student1;
		stuArray[1] = student2;
		
		// 배열
		for(int i = 0 ; i <stuArray.length ; i++) {
			String name = stuArray[i].getName();
			String number = stuArray[i].getNumber();
			int age = stuArray[i].getAge();
			int scoreJava = stuArray[i].getScoreJava();
			int scoreWeb = stuArray[i].getScoreWeb();
			int scoreAndroid = stuArray[i].getScoreAndroid();
			
			System.out.printf("%s님 안녕하세요.\n" + "[%s, %d살]"
							  + "\n%s님의 Java점수는 %d점 입니다."
							  + "\n%s님의 Web점수는 %d점 입니다."
							  + "\n%s님의 Android점수는 %d점 입니다.\n"
							  ,name,number,age,name,scoreJava,name,scoreWeb,name,scoreAndroid);
			System.out.println("==============================");
		}
		
		
	}

}
