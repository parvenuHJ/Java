package Quesion6_1;

import java.util.ArrayList;

public class MusicController {

	
	ArrayList<MusicVO> list = new ArrayList<MusicVO>();
	
	int index = 0;
	
	// 1. 등록 메소드
	public void insert(MusicVO vo) {
		
		list.add(vo);
		
	}
	
	// 2. 목록 메소드
	public void mok() {
		
		for(int i = 0; i <list.size() ; i++) {
			System.out.println((i+1) + "." + list.get(i));
			
		}
	}
	
	// 3. 실행 메소드
	public void sil() {
		
		System.out.println(list.get(index).toString());
		
	}
	
	// 4. 이전곡 메소드
	public void before() {
		
		index--;
		
		if(index < 0) {
			index = list.size()-1;
			
		}
		System.out.println(list.get(index).toString());
		
	}
	
	
	
	// 5. 다음곡 메소드
	
	public void next() {
		
		index++;
		
		if(index > list.size()-1) {
			index = 0;
		}
		System.out.println(list.get(index).toString());
		
	}
	
	
	
	
	
	
	
	
	
}
