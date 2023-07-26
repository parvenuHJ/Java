package ex0706오전_메소드_중요_______;

public class Tv {

		// 1. 필드
		int channel;
		String color;
		
		
		
		// 2. 생성자 메소드 (여기서는 없음)
		
	 	
//		public Tv() {
//		
//			
//		}
		// Tv tv = new Tv(); ()에 매개변수를 안적고 직접 출력할때 (tv.channel = 5; tv.color = "red";)는
		// 위 기본 생성자는 생략되어 있어서 굳이 안적어도 됨 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// Tv tv = new Tv(); 이 메소드에 (매개변수)를 넣고 싶을때 ->  우클릭 생성자 메소드 생성
		



		
		// 3. 메소드
		
		public void channelUp1() {
			
			channel++;
		}
		// 위 메소드는 channelUp()이라는 메소드가 channel++ 을 해주는 기능만 있는 메소드  --> 따로 return값이 없어서 
		// System.out.println("채널 : " + tv.channelUp1()); 불가능 tv.channelUp1() 입력하고 자동완성 ->타입 : void 로 뜸


		public int channelUp() {
			
			return channel++;
		}
		// 위 메소드는 channel++ 해주고 return값이 있으니까
		// System.out.println("채널 : " + tv.channelUp()); 가능 tv.channelUp() 입력하고 자동완성 ->타입 : int 로 뜸
		
		public int channelDown() {
			
			return channel--;
		}
		
		
		
		
	
	
	
	
}
