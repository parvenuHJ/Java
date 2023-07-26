package animal_추상메소드;

public class AnimalMain {

	public static void main(String[] args) {

		
		Animal am = new Animal();
		
		am.walk();
		am.hunt();
		am.sleep();
		
		// Bird bd =  new Bird();  -> 오류남   ->>Bird 가 추상클래스가 되어서 객채로 못만듬!!!
		// Bird 추상클래스는 body가 없음
//		
//		bd.walk();
//		bd.hunt();
//		bd.sleep();
	
		
		
		
		
	}

}
