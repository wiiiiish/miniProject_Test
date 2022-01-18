package model;

public class 케이시 extends Champ_VO{

	public 케이시(String user_ID, String poketmon, int poketPower) {
		super(user_ID, poketmon, poketPower);
		
	}

	public void move() {
		System.out.println("케이시가 초능력을 뽐내며 출전한다");

	}

}
