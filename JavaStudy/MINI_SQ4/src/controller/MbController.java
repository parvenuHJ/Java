package controller;

import model.MbDAO;
import model.MbDTO;

public class MbController {
	
	boolean check = false;
	
	// 회원가입
		public void insert(MbDTO dto) {
			MbDAO dao = new MbDAO();
			int check = dao.idCheck(dto);
			if(check ==0) {
				int cnt = dao.insert(dto);
				if (cnt > 0) {
					System.out.println("회원가입이 완료되었습니다.");
				} else {
					System.out.println("회원가입에 실패했습니다. 다시 시도하세요.");
				}
			} else {
				System.out.println("중복된 아이디입니다.회원가입을 다시 해주세요.");
			}
		}

		
	// 로그인
		public boolean login(MbDTO dto) {
			MbDAO dao = new MbDAO();
			String data = dao.login(dto);

			if (data.equals("")) {
				System.out.println("로그인 실패! , 프로그램을 다시 실행하세요");
				check = false;
			} else {
				System.out.println(data + "님 환영합니다!");
				check = true;
			}
			return check;
		}

		
		

}
