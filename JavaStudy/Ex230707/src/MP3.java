
public class MP3 {

	// 음악이란 구조를 컴퓨터한테 알려주는 공간
	// 음악 정보를 담고있는 공간
	
	// 가수 -> String
	// 제목 -> String
	// 재생시간 -> int
	// 음악파일 경로 -> String
	
	private String singer; // 접근제한자 : private --> getter 메소드로 다른 클래스에서 불러올 수 있음
	private String title;
	private int playTime;
	private String path;
	
	// 생성자 메소드 (위 필드 들을 한번에 초기화시켜줄 수 있는 생성자메소드)
	public MP3(String singer, String title, int playTime, String path) {
		// super(); -> 있어도 되고 없어도 됨
		this.singer = singer;
		this.title = title;
		this.playTime = playTime;
		this.path = path;
	}
	
	
	
	
	// getter 메소드
	public String getSinger() {
		return singer;
	}
	public String getTitle() {
		return title;
	}
	public int getPlayTime() {
		return playTime;
	}
	public String getPath() {
		return path;
	}
	
	
	
	
	
}
