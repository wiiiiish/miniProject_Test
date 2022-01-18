package model;

public class Champ_VO {

	private String user_ID;
	private String poketmon;
	private int poketPower;

	public Champ_VO (String user_ID, String poketmon, int poketPower) {
		
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
	
	//혹시나 노래 넣을꺼면 여기에 play메소드 추가하기

}
