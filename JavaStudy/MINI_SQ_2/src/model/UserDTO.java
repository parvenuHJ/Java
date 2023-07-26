package model;

public class UserDTO {

	private String mb_id;
	private String name;
	private int backnum;
	
	public UserDTO(String mb_id, String name, int backnum) {
		super();
		this.mb_id = mb_id;
		this.name = name;
		this.backnum = backnum;
	}

	public String getMb_id() {
		return mb_id;
	}

	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBacknum() {
		return backnum;
	}

	public void setBacknum(int backnum) {
		this.backnum = backnum;
	}
	
	
	
	
	
	
}
