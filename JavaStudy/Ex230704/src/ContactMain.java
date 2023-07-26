
public class ContactMain {

	public static void main(String[] args) {

		// 객체생성
	
		
		Contact con1 = new Contact("이주희",20, "010-5465-4646", "금호동");
		Contact con2 = new Contact("백지수",21, "010-1111-2222", "뉴욕");
		Contact con3 = new Contact("서윤",22, "010-3333-4444", "세부");
		Contact con4 = new Contact("장채린",23, "010-5555-6666", "천국");
		
		// 연락처를 담을 수 있는 배열 만들기
		// 배열 만들기 - > 데이터타입 변수이름 ... 데이터타입 = contact
		Contact [] conArray = new Contact[4];
		conArray[0] = con1;
		conArray[1] = con2;
		conArray[2] = con3;
		conArray[3] = con4;
		
		//     1.  이주희(20세) : 010-5465-4646 , 금호동
		for(int i  = 0 ; i < conArray.length ; i++) {
			String name = conArray[i].getName();
			int age = conArray[i].getAge();
			String tel = conArray[i].getTel();
			String address = conArray[i].getAddress();
			
			System.out.printf("%d. %s(%d세) : %s , %s%n", i+1, name, age, tel, address);
			// %s - string  %d - int  %f - double %n은 엔터해주는기능!!!!!!!!!!!!!!!!!!!!!!
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		// 이주희(20세) : 010-5465-4646 , 금호동
//		String name1 = con1.getName();
//		int age1 = con1.getAge();
//		String tel1= con1.getTel();
//		String address1 = con1.getAddress();
//		
//		System.out.printf("%s(%d세) : %s, %s%n", name1, age1, tel1, address1); 
//		// %s - string  %d - int  %f - double %n은 엔터해주는기능!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		
//		
//		
//		
//		String name2 = con2.getName();
//		int age2 = con2.getAge();
//		String tel2= con2.getTel();
//		String address2 = con2.getAddress();
//		
//		System.out.printf("%s(%d세) : %s, %s%n", name2, age2, tel2, address2);
//		
		
		
		

		//System.out.println(con.name); // name 이 private라 에러 ,  public이였으면 가능
		System.out.println();
		System.out.println(con1.getName()); // 그래서 getter메소드로 가져올 수 있음..!!!!!!!!!!!!
		con1.setName("리주희");	// setter 메소드로 바꿀 수 있음!!!!!!!!!!!!!
		System.out.println(con1.getName()); // setter로 인해 바뀐 것을 확인 할 수 있음
		// get. set. 으로 하는이유가 contact.java(field)를 보호하기 위해!!!!!!!!!!!!!!!!!!!!!!!
	
	}

	
	
	
	
}
