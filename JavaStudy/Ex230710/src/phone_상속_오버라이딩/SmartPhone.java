package phone_상속_오버라이딩;

public class SmartPhone extends Phone {
	
	@Override   //오버라이딩 한 것의 위에 @Override 적어주면--> 에러가 안난다는 말은 오바라이딩이 잘 되어있다는 뜻!!!!!!!!!!!!!!!!!!!!!!
	
	public void call() {	//메소드 오버라이딩 --> phone(부모 클래스) 에 있는 메소드를 다시정의하여 사용(메소드 오버라이딩)
							// 왼쪽에 초록색 삼각형 누르면 어떤 메소드를 오버라이딩 했는지 나온다.
							// 메소드 이름 , 데이터 타입, 매개변수 똑같아야함.
		System.out.println("영상통화!");
	}
	
	
	
	public void play_music () {
		System.out.println("음악재생~");
	}
	
	public void internet() {
		System.out.println("구글링~");
	}
	

}
