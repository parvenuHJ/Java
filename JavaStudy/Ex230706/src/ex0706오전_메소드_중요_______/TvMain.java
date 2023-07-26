package ex0706오전_메소드_중요_______;

public class TvMain {

	public static void main(String[] args) {

		Tv tv = new Tv(); // 기본생성자 (아무것도 안들어있는 깡통 객체)
		
		tv.channel = 5; // tv클래스에 있는 channel 매개변수를 5라고 초기화
		tv.color = "red";
		
		tv.channelUp(); // tv.클래스에 있는 channelUp(); 이라는 메소드 사용
		tv.channelUp();
		tv.channelDown();
		
		System.out.println("채널 : " + tv.channelUp());
		
		System.out.println("채널번호 : " + tv.channel);
		System.out.println("채널색깔 : " + tv.color);
	}

}
