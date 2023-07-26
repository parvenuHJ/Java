import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Address> addressList = new ArrayList<Address>();
		// string name, int age, string phonenumber를 모두 받을 수 있는 내가 만든 Address 데이터 타입 <Address> !!!!!
		
		
		
		
		while(true) {
			
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5] 종료 >> ");
			int menu = sc.nextInt();
			
			if (menu ==1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String number = sc.next();
				
				Address ad = new Address(name, age, number);    // !!!!!!!!!!!!!!!!
				System.out.println("추가가 완료되었습니다.");
				addressList.add(ad);
				
			}else if (menu ==2 ) {
				if(addressList.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");
				}else {
					for (int i =0 ; i < addressList.size() ; i++) {
						String name = addressList.get(i).getName();
						int age = addressList.get(i).getAge();
						String phone = addressList.get(i).getPhoneNumber();
						
						System.out.printf("%d. %s(%d세) : %s\n"  , i+1 , name , age, phone );
				}
					
				}
				
				
			}else if(menu ==3) {
				if(addressList.size() == 0 ) {
					System.out.println("등록된 연락처가 없습니다.");
				}else {
					for (int i =0 ; i < addressList.size() ; i++) {
						String name = addressList.get(i).getName();
						int age = addressList.get(i).getAge();
						String phone = addressList.get(i).getPhoneNumber();
						
						System.out.printf("%d. %s(%d세) : %s\n"  , i+1 , name , age, phone );
					}
					System.out.print("삭제할 번호 입력 : ");
					int num = sc.nextInt();
					addressList.remove(num-1);
					System.out.println(num +"번의 연락처가 삭제되었습니다,");
				}
				
			}else if(menu ==4) {
				
				System.out.print("검색할 이름 입력 : ");
				String name_search = sc.next();
				
				boolean check = true; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				
				for(int i  = 0 ; i < addressList.size() ; i++) {
					if(name_search.equals(addressList.get(i).getName())) {
						String name = addressList.get(i).getName();
						int age = addressList.get(i).getAge();
						String phone = addressList.get(i).getPhoneNumber();
						
						System.out.printf("%d. %s(%d세) : %s\n"  , i+1 , name , age, phone );
						
						check = false;   // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
					}
				}
				if(check == true){		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
					
					System.out.println("검색한 정보의 이름이 없습니다.");
					
				}
			
				
				
			}
				
					
				
				
			else if(menu ==5) {
				
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	
		
		
		
		
		
		
	}

	

}
