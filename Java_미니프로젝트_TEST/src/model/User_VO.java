package model;

public class User_VO {
	
	private String user_ID;
	private String user_PW;
	private String user_NAME;
	
	public User_VO(String user_ID, String user_PW, String user_NAME) {
		this.user_ID = user_ID;
		this.user_PW = user_PW;
		this.user_NAME = user_NAME;
	}
	
	public String getID () {
		return user_ID;
	}
	
	public String getPW () {
		return user_PW;
	}
	
	public String getNAME () {
		return user_NAME;
	}

	public void setNAME(String user_NAME) {
		this.user_NAME = user_NAME;
	}

} // end of class
