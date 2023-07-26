
public class Mp3 {

	private String singer;
	private String name;
	private int play_time;
	private String path;
	
	
	
	public Mp3(String singer, String name, int play_time, String path) {
//		super();
		this.singer = singer;
		this.name = name;
		this.play_time = play_time;
		this.path = path;
	}



	public String getSinger() {
		return singer;
	}



	public String getName() {
		return name;
	}



	public int getPlay_time() {
		return play_time;
	}



	public String getPath() {
		return path;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
