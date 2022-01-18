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

	   public String getUser_ID() {
	      return user_ID;
	   }

	   public String getPoketmon() {
	      return poketmon;
	   }

	   public int getPoketPower() {
	      return poketPower;
	   }

	   public void move(String poketmon) {
	      if (poketmon.equals("피카츄")) {
	         System.out.println("피카츄가 출전합니다.");
	         System.out.println("피카피카~");
	      } else if (poketmon.equals("파이리")) {
	         System.out.println("파이리가 출전합니다.");
	         System.out.println("파이리~");
	      } else if (poketmon.equals("이상해씨")) {
	         System.out.println("이상해씨가 출전합니다.");
	         System.out.println("오늘 날씨 이상해씨");
	      } else if (poketmon.equals("꼬부기")) {
	         System.out.println("꼬부기가 출전합니다.");
	         System.out.println("꼬북칩은 내 등딱지야!");
	      } else if (poketmon.equals("푸린")) {
	         System.out.println("푸린이 출전합니다.");
	         System.out.println("푸린 푸린 푸리린");
	      } else if (poketmon.equals("나옹")) {
	         System.out.println("나옹이 출전합니다.");
	         System.out.println("내가 누군지 물으신다면 대답해드리는 게 인지상정! 나는 나옹");
	      } else if (poketmon.equals("잠만보")) {
	         System.out.println("잠만보가 출전합니다.");
	         System.out.println("잠이 와");
	      } else if (poketmon.equals("고라파덕")) {
	         System.out.println("고라파덕이 출전합니다.");
	         System.out.println("고라고라고라파덕");
	      } else if (poketmon.equals("모다피")) {
	         System.out.println("모다피가 출전합니다.");
	         System.out.println("모다피 무시하다간 모, 다 피나~");
	      } else if (poketmon.equals("케이시")) {
	         System.out.println("케이시가 출전합니다.");
	         System.out.println("케이시가 부릅니다. 그때가 좋았어");
	      }
	   }

	}