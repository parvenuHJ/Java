package ex0706오전_메소드_중요_______;

public class TvMain_메소드있게 {

	public static void main(String[] args) {

		Tv_메소드있게 tv = new Tv_메소드있게(5, "red");
		
//		tv.channel = 5;
//		tv.color = "red";
		
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		
		System.out.println("채널번호 : " + tv.channel);
		System.out.println("채널색깔 : " + tv.color);
	}

	
	
	
}
