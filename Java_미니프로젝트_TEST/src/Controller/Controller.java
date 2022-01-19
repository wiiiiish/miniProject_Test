package Controller;

import javazoom.jl.player.MP3Player;

public class Controller {

	static MP3Player mp3 = new MP3Player();

	public static void main(String[] args) {
	}
	public static void play(String poketName) {
		//노래재생
		if (poketName.equals("피카츄")) {
			mp3.play("C://피카츄.mp3");
			System.out.println("피카츄가 출전합니다.");
			System.out.println("피카츄 : 피카피카~");
		} else if (poketName.equals("파이리")) {
			mp3.play("C://파이리.mp3");
			System.out.println("파이리가 출전합니다.");
			System.out.println("파이리 : 파이리~");
		} else if (poketName.equals("이상해씨")) {
			mp3.play("C://이상해씨.mp3");
			System.out.println("이상해씨가 출전합니다.");
			System.out.println("이상해씨 : 오늘 날씨 이상해씨");
		} else if (poketName.equals("꼬부기")) {
			mp3.play("C://꼬부기.mp3");
			System.out.println("꼬부기가 출전합니다.");
			System.out.println("꼬부기 : 꼬북칩은 내 등딱지야!");
		} else if (poketName.equals("푸린")) {
			mp3.play("C://푸린.mp3");
			System.out.println("푸린이 출전합니다.");
			System.out.println("푸린 : 푸린 푸린 푸리린");
		} else if (poketName.equals("나옹")) {
			mp3.play("C://나옹.mp3");
			System.out.println("나옹이 출전합니다.");
			System.out.println("나옹 : 내가 누군지 물으신다면 대답해드리는 게 인지상지다옹!");
		} else if (poketName.equals("마자용")) {
			mp3.play("C://마자용.mp3");
			System.out.println("마자용 출전합니다.");
			System.out.println("마자용 : 너 나에게 마자용~");
		} else if (poketName.equals("고라파덕")) {
			mp3.play("C://고라파덕.mp3");
			System.out.println("고라파덕이 출전합니다.");
			System.out.println("고라파덕 : 고라고라고라파덕");
		} else if (poketName.equals("토게피")) {
			mp3.play("C://토게피.mp3");
			System.out.println("토게피가 알을 튀어나와 출전합니다.");
		} else if (poketName.equals("치코리타")) {
			mp3.play("C://치코리타.mp3");
			System.out.println("치코리타가 잎사귀를 흔들며 출전합니다.");
		}
	}
	
	public static void play(int result) {
		
		if (result == 1) {
			System.out.println("두구두구..."); 
            pause(1000);
            mp3.play("C://안타.mp3");
            System.out.println("안타!");
            System.out.println();
            pause(800);
		} else if (result == 2) {
			System.out.println("두구두구..."); 
            pause(1000);
            mp3.play("C://홈런.mp3");
            System.out.println("홈런!");
            System.out.println();
            pause(800);
		} else if (result == 3) {
			System.out.println("두구두구..."); 
            pause(1000);
            mp3.play("C://아웃.mp3");
            System.out.println("아웃!");
            System.out.println();
            pause(800);
		}
	}
	 public static void pause(int time) {
         try {
            Thread.sleep(time);
         } catch (InterruptedException e) {
         }
      }

}
