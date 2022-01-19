package model;

public class Champ_VO {

	   private int Num;
	   private String user_ID;
	   private String poketmon;
	   private int poketPower;

	   public Champ_VO (int Num, String user_ID, String poketmon, int poketPower) {
	      this.Num = Num;
	      this.user_ID=user_ID;
	      this.poketmon=poketmon;
	      this.poketPower=poketPower;
	   }
	   
	   public Champ_VO (String poketmon, int poketPower) {
	      this.poketmon=poketmon;
	      this.poketPower=poketPower;
	   }
	   
	   public Champ_VO() {}

	   public String getUser_ID() {
	      return user_ID;
	   }

	   public String getPoketmon() {
	      return poketmon;
	   }

	   public int getPoketPower() {
	      return poketPower;
	   }

	}