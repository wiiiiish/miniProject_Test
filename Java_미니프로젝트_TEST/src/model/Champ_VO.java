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

	   public void move(String poketmon) {
	      if (poketmon.equals("피카츄")) {
	         System.out.println("피카츄가 출전합니다.");
	         System.out.println("피카츄 : 피카피카~");
	      } else if (poketmon.equals("파이리")) {
	         System.out.println("파이리가 출전합니다.");
	         System.out.println("파이리 : 파이리~");
	      } else if (poketmon.equals("이상해씨")) {
	         System.out.println("이상해씨가 출전합니다.");
	         System.out.println("이상해씨 : 오늘 날씨 이상해씨");
	      } else if (poketmon.equals("꼬부기")) {
	         System.out.println("꼬부기가 출전합니다.");
	         System.out.println("꼬부기 : 꼬북칩은 내 등딱지야!");
	      } else if (poketmon.equals("푸린")) {
	         System.out.println("푸린이 출전합니다.");
	         System.out.println("푸린 : 푸린 푸린 푸리린");
	      } else if (poketmon.equals("나옹")) {
	         System.out.println("나옹이 출전합니다.");
	         System.out.println("나옹 : 내가 누군지 물으신다면 대답해드리는 게 인지상지다옹!");
	      } else if (poketmon.equals("마자용")) {
	         System.out.println("마자용 출전합니다.");
	         System.out.println("마자용 : 너 나에게 마자용~");
	      } else if (poketmon.equals("고라파덕")) {
	         System.out.println("고라파덕이 출전합니다.");
	         System.out.println("고라파덕 : 고라고라고라파덕");
	      } else if (poketmon.equals("토게피")) {
	         System.out.println("토게피가 알을 튀어나와 출전합니다.");
	      } else if (poketmon.equals("치코리타")) {
	         System.out.println("치코리타가 잎사귀를 흔들며 출전합니다.");
	      }
	   }

	}