package ex0706오전_메소드_중요_______;

public class Tv_메소드있게 {

	// 1. 필드
	int channel;
	String color;
	
	
	
	// 2. 생성자 메소드 
	// 1.필드를 작성하고 나서 우클릭 소스 - 생성자메소드 생성 하면 아래 코드가 생성되서
	// Tv_메소드있게 (매개변수들 입력)으로 매개변수들이 매우 많을때 간편하게 입력 가능
 	public Tv_메소드있게(int channel, String color) {
		super();
		this.channel = channel;
		this.color = color;
	}
//	public Tv() {
//		
//		
//	}



	
	// 3. 메소드
	



	public int channelUp() {
		
		return channel++;
	}
	
	
	
	public int channelDown() {
		
		return channel--;
	}
	
	
	
	
	
	
	
	
}
