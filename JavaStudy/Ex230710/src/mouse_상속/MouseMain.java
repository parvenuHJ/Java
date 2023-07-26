package mouse_상속;

public class MouseMain {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		
		mouse.leftClick();
		mouse.rightClick();
		mouse.drag();
		
		WheelMouse wheel = new WheelMouse();
		
		wheel.scroll();
		
		// WheelMouse 클래스에는 없는 메소드이지만, Mouse 클래스를 상속 받았기때문에 Mouse의 메소드도 사용가
		wheel.leftClick();
		wheel.rightClick();
		wheel.drag();
		
		
		HumanMouse hm = new HumanMouse();
		
		hm.leftClick();
		hm.drag();
		hm.looseStress();
		
		
		
	}

}
