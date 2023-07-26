package phone_상속_오버라이딩;

public class PhoneMain {

	public static void main(String[] args) {

		Phone phone = new Phone();
		
		phone.answer();
		phone.call();
		
		SmartPhone sp = new SmartPhone();
		
		sp.play_music();
		sp.internet();
		sp.answer();
		sp.call(); // --> 메소드 오버라이딩 된 버전을 출력해줌
		
		
		
		
		
		
		
	}

}
