package model;

public class 모다피 extends Champ_VO{

	public 모다피(String user_ID, String poketmon, int poketPower) {
		super(user_ID, poketmon, poketPower);
		
	}

	public void move() {
		System.out.println("모다피가 잎사귀를 흔들며 출전하다");

	}

}
