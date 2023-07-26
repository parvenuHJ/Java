package controller;



import model.MbDAO;
import model.MbDTO;
import model.UserDAO;
import model.UserDTO;

public class UserController {

   UserDAO dao = new UserDAO();
   // 참가자 등록
   
   public void user(MbDTO dto) {
      MbDAO dao = new MbDAO();
      int cnt = dao.insert(dto);
      if (cnt > 0) {
         System.out.println("참가자 등록이 완료되었습니다.");
      } else {
         System.out.println("참가자 등록에 실패했습니다. 다시 시도하세요.");
         
      }
      
   }
   
   public  void userSel (String id) {
      UserDTO dto = dao.selectOne(id);
      
      String mb_id = dto.getMb_id();
      String name = dto.getName();
      int backnum = dto.getBacknum();
      
      if(mb_id.equals(id)) {
         System.out.printf( "%S(%S)님  등번호 %d 님 환영합니다 ", name, mb_id, backnum );
      }
   
   
      
   }
   
   public  UserDTO selectOne(String id) {
      UserDTO dto = dao.selectOne(id);
      return dto;
   }

   
}