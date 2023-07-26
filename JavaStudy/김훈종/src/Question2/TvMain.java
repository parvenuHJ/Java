package Question2;

public class TvMain {

	public static void main(String[] args) {

		Tv tv = new Tv();
		
		tv.channel = 7;
		tv.color= "red";
		tv.print(); //현재 Tv의 상태 출력
		tv.channelUp(); 
		tv.channelUp();
		tv.print();
		tv.color= "black";
		tv.channelDown();
		tv.print();
		
		
		
		
		
	}

}
