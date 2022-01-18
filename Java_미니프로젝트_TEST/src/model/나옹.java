package model;

public class 나옹 extends Champ_VO{

	public 나옹(String user_ID, String poketmon, int poketPower) {
		super(user_ID, poketmon, poketPower);
		
	}

	public void move() {
		System.out.println("나옹이가 로켓단과 함께 출전하다");

	}

}
