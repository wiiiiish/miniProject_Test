package model;

public class Record_VO {
	   
	   private String user_ID;
	   private int winCnt;
	   private int loseCnt;
	   private int score;
	   
	   public Record_VO (String user_ID, int score) {
	      this.user_ID = user_ID;
	      this.score = score;
	   }

	   public Record_VO (String user_ID, int winCnt, int loseCnt) {
	      this.user_ID = user_ID;
	      this.winCnt = winCnt;
	      this.loseCnt = loseCnt;
	   }
	   
	   public Record_VO () {
	      winCnt = 0;
	      loseCnt = 0;
	   }
	   
	   public int getScore() {
	      return score;
	   }

	   public String getUser_ID() {
	      return user_ID;
	   }

	   public int getWinCnt() {
	      return winCnt;
	   }


	   public int getLoseCnt() {
	      return loseCnt;
	   }

	}