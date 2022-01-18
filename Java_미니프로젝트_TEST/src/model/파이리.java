package model;

public class 파이리 extends Champ_VO{

	public 파이리(String user_ID, String poketmon, int poketPower) {
		super(user_ID, poketmon, poketPower);
		
	}

	public void move() {
		System.out.println("파이리가 꼬리에서 불꽃을 뿜으며 출전한다");

	}

}
