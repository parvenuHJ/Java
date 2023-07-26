package Quesion6_1;

public class MusicVO {

	// 필드
	
	String title; // 노래 제목을 저장할 필드
	String singer; // 가수 이름을 저장할 필드
	int playTime; // 노래길이를 초단위로 저장할 필드
	
	
	
	// 메소드
	
	public MusicVO(String title, String singer, int playTime) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}


	public String toString() {
		
		return "제목 :"+ title + "\t가수 :" + singer + "\t시간 :" + playTime +"초";
	}
	
}
