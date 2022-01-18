package model;

public class Chap_VO {

	private String user_ID;
	private String poketmon;
	private int poketPower;

	public void poketmon (String user_ID, String poketmon, int poketPower) {
		
		this.user_ID=user_ID;
		this.poketmon=poketmon;
		this.poketPower=poketPower;
	}

	public String getUser_ID() {
		return user_ID;
	}

	public String getPoketmon() {
		return poketmon;
	}

	public int getPoketPower() {
		return poketPower;
	}

	public void move() {
		System.out.println("출전하다");
	}

}
