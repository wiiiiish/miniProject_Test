package model;

public class 이상해씨 extends Champ_VO{

	public 이상해씨(String user_ID, String poketmon, int poketPower) {
		super(user_ID, poketmon, poketPower);
		
	}

	public void move() {
		System.out.println("이상해씨가 이상~이상~거리며 출전한다");

	}
}
