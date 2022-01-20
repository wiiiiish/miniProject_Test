package Controller;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.Champ_DAO;
import model.User_DAO;

public class Controller {

	MP3Player mp3 = new MP3Player();
	 Scanner sc = new Scanner(System.in);
	 Champ_DAO champDAO = new Champ_DAO();
	 User_DAO userDAO = new User_DAO();

	public void main(String[] args) {
	}
	public void play(String poketName) {
		//노래재생
		if (poketName.equals("피카츄")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\피카츄.mp3");
			System.out.println("피카츄가 출전합니다.");
			System.out.println("피카츄 : 피카피카~");
		} else if (poketName.equals("파이리")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\파이리.mp3");
			System.out.println("파이리가 출전합니다.");
			System.out.println("파이리 : 파이리~");
		} else if (poketName.equals("이상해씨")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\이상해씨.mp3");
			System.out.println("이상해씨가 출전합니다.");
			System.out.println("이상해씨 : 오늘 날씨 이상해씨");
		} else if (poketName.equals("꼬부기")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\꼬부기.mp3");
			System.out.println("꼬부기가 출전합니다.");
			System.out.println("꼬부기 : 꼬북칩은 내 등딱지야!");
		} else if (poketName.equals("푸린")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\푸린.mp3");
			System.out.println("푸린이 출전합니다.");
			System.out.println("푸린 : 푸린 푸린 푸리린");
		} else if (poketName.equals("나옹")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\나옹.mp3");
			System.out.println("나옹이 출전합니다.");
			System.out.println("나옹 : 내가 누군지 물으신다면 대답해드리는 게 인지상지다옹!");
		} else if (poketName.equals("마자용")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\마자용.mp3");
			System.out.println("마자용 출전합니다.");
			System.out.println("마자용 : 너 나에게 마자용~");
		} else if (poketName.equals("고라파덕")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\고라파덕.mp3");
			System.out.println("고라파덕이 출전합니다.");
			System.out.println("고라파덕 : 고라고라고라파덕");
		} else if (poketName.equals("토게피")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\토게피.mp3");
			System.out.println("토게피가 알을 튀어나와 출전합니다.");
		} else if (poketName.equals("치코리타")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\치코리타.mp3");
			System.out.println("치코리타가 잎사귀를 흔들며 출전합니다.");
		}
	}
	
	public void play(int result) {
		
		if (result == 1) {
			System.out.println("두구두구..."); 
            pause(1000);
            mp3.play("C:\\Users\\smhrd\\Desktop\\music\\안타.mp3");
            System.out.println("\r\n"
            		+ "                                                               \r\n"
            		+ "8 8888        8            8 8888           8888888 8888888888 \r\n"
            		+ "8 8888        8            8 8888                 8 8888       \r\n"
            		+ "8 8888        8            8 8888                 8 8888       \r\n"
            		+ "8 8888        8            8 8888                 8 8888       \r\n"
            		+ "8 8888        8            8 8888                 8 8888       \r\n"
            		+ "8 8888        8            8 8888                 8 8888       \r\n"
            		+ "8 8888888888888            8 8888                 8 8888       \r\n"
            		+ "8 8888        8            8 8888                 8 8888       \r\n"
            		+ "8 8888        8            8 8888                 8 8888       \r\n"
            		+ "8 8888        8            8 8888                 8 8888       \r\n"
            		+ "");
            System.out.println();
            pause(3000);
		} else if (result == 2) {
			System.out.println("두구두구..."); 
            pause(1000);
            mp3.play("C:\\Users\\smhrd\\Desktop\\music\\홈런.mp3");
            System.out.println("\r\n"
            		+ "                                             .         .                                                                          \r\n"
            		+ "8 8888        8     ,o888888o.              ,8.       ,8.          8 8888888888   8 888888888o.   8 8888      88 b.             8 \r\n"
            		+ "8 8888        8  . 8888     `88.           ,888.     ,888.         8 8888         8 8888    `88.  8 8888      88 888o.          8 \r\n"
            		+ "8 8888        8 ,8 8888       `8b         .`8888.   .`8888.        8 8888         8 8888     `88  8 8888      88 Y88888o.       8 \r\n"
            		+ "8 8888        8 88 8888        `8b       ,8.`8888. ,8.`8888.       8 8888         8 8888     ,88  8 8888      88 .`Y888888o.    8 \r\n"
            		+ "8 8888        8 88 8888         88      ,8'8.`8888,8^8.`8888.      8 888888888888 8 8888.   ,88'  8 8888      88 8o. `Y888888o. 8 \r\n"
            		+ "8 8888        8 88 8888         88     ,8' `8.`8888' `8.`8888.     8 8888         8 888888888P'   8 8888      88 8`Y8o. `Y88888o8 \r\n"
            		+ "8 8888888888888 88 8888        ,8P    ,8'   `8.`88'   `8.`8888.    8 8888         8 8888`8b       8 8888      88 8   `Y8o. `Y8888 \r\n"
            		+ "8 8888        8 `8 8888       ,8P    ,8'     `8.`'     `8.`8888.   8 8888         8 8888 `8b.     ` 8888     ,8P 8      `Y8o. `Y8 \r\n"
            		+ "8 8888        8  ` 8888     ,88'    ,8'       `8        `8.`8888.  8 8888         8 8888   `8b.     8888   ,d8P  8         `Y8o.` \r\n"
            		+ "8 8888        8     `8888888P'     ,8'         `         `8.`8888. 8 888888888888 8 8888     `88.    `Y88888P'   8            `Yo \r\n"
            		+ "");
            System.out.println();
            pause(3000);
		} else if (result == 3) {
			System.out.println("두구두구..."); 
            pause(1000);
            mp3.play("C:\\Users\\smhrd\\Desktop\\music\\아웃.mp3");
            System.out.println("\r\n"
            		+ "                                                                         \r\n"
            		+ "    ,o888888o.               8 8888      88           8888888 8888888888 \r\n"
            		+ " . 8888     `88.             8 8888      88                 8 8888       \r\n"
            		+ ",8 8888       `8b            8 8888      88                 8 8888       \r\n"
            		+ "88 8888        `8b           8 8888      88                 8 8888       \r\n"
            		+ "88 8888         88           8 8888      88                 8 8888       \r\n"
            		+ "88 8888         88           8 8888      88                 8 8888       \r\n"
            		+ "88 8888        ,8P           8 8888      88                 8 8888       \r\n"
            		+ "`8 8888       ,8P            ` 8888     ,8P                 8 8888       \r\n"
            		+ " ` 8888     ,88'               8888   ,d8P                  8 8888       \r\n"
            		+ "    `8888888P'                  `Y88888P'                   8 8888       \r\n"
            		+ "");
            System.out.println();
            pause(3000);
		}
	}
	
	public void pause(int time) {
         try {
            Thread.sleep(time);
         } catch (InterruptedException e) {
         }
      }
	
	public void open() {
		mp3.play("C:\\Users\\smhrd\\Desktop\\music\\오프닝.mp3");
		
	}
	
	public void choose() {
		mp3.play("C:\\Users\\smhrd\\Desktop\\music\\포켓몬선택.mp3");
	}
	
	public void end() {
		mp3.play("C:\\Users\\smhrd\\Desktop\\music\\종료.mp3");
	}
	
	public void stop() {
		if (mp3.isPlaying() == true) {
		mp3.stop();
		}
	}
	
	public void team(String user_ID) {
		boolean vs = true;
		boolean yesvs = false;
		int poketNum = 0;
		while (vs){
			System.out.print("데려갈 포켓몬 : ");
			poketNum = sc.nextInt();

			String vspoketName = null;
			String mypoket = champDAO.Champ(poketNum-1);
			
			for (int i=0; i<champDAO.fiterChamp(user_ID).size(); i++) {
				vspoketName = champDAO.fiterChamp(user_ID).get(i);
				if (mypoket.equals(vspoketName)) {
					System.out.println("이미 소유한 포켓몬입니다. 다시 선택해주세요.");
					yesvs = false;
					break;
				} else {
					yesvs = true;
				}
			} // end of for
			
			if (yesvs) {
				champDAO.fiterChamp(user_ID);
				int Num = userDAO.getNum(user_ID);
				boolean checkchamp = champDAO.insertChamp(Num, user_ID, mypoket);
				if(checkchamp) {
					System.out.println(champDAO.Champ(poketNum-1) + "포켓몬 포켓볼에 저장 완료");
				}
				vs = false;
			}
		} // end of while
	}

	public void first(String user_ID) {
		int poketNum = 0;
		System.out.print("데려갈 포켓몬 : ");
		poketNum = sc.nextInt();
		int Num = userDAO.getNum(user_ID);
		boolean checkchamp = champDAO.insertChamp(Num, user_ID, champDAO.Champ(poketNum-1));
		if(checkchamp) {
			System.out.println(champDAO.Champ(poketNum-1) + "포켓몬 포켓볼에 저장 완료");
		}
	}
	public void win() {
		System.out.println("\r\n"
				+ "                                                                          \r\n"
				+ "`8.`888b                 ,8'            8 8888           b.             8 \r\n"
				+ " `8.`888b               ,8'             8 8888           888o.          8 \r\n"
				+ "  `8.`888b             ,8'              8 8888           Y88888o.       8 \r\n"
				+ "   `8.`888b     .b    ,8'               8 8888           .`Y888888o.    8 \r\n"
				+ "    `8.`888b    88b  ,8'                8 8888           8o. `Y888888o. 8 \r\n"
				+ "     `8.`888b .`888b,8'                 8 8888           8`Y8o. `Y88888o8 \r\n"
				+ "      `8.`888b8.`8888'                  8 8888           8   `Y8o. `Y8888 \r\n"
				+ "       `8.`888`8.`88'                   8 8888           8      `Y8o. `Y8 \r\n"
				+ "        `8.`8' `8,`'                    8 8888           8         `Y8o.` \r\n"
				+ "         `8.`   `8'                     8 8888           8            `Yo \r\n"
				+ "");
	}
	
	public void lose() {
		System.out.println("\r\n"
				+ "                                                                                              \r\n"
				+ "8 8888                       ,o888888o.                  d888888o.             8 8888888888   \r\n"
				+ "8 8888                    . 8888     `88.              .`8888:' `88.           8 8888         \r\n"
				+ "8 8888                   ,8 8888       `8b             8.`8888.   Y8           8 8888         \r\n"
				+ "8 8888                   88 8888        `8b            `8.`8888.               8 8888         \r\n"
				+ "8 8888                   88 8888         88             `8.`8888.              8 888888888888 \r\n"
				+ "8 8888                   88 8888         88              `8.`8888.             8 8888         \r\n"
				+ "8 8888                   88 8888        ,8P               `8.`8888.            8 8888         \r\n"
				+ "8 8888                   `8 8888       ,8P            8b   `8.`8888.           8 8888         \r\n"
				+ "8 8888                    ` 8888     ,88'             `8b.  ;8.`8888           8 8888         \r\n"
				+ "8 888888888888               `8888888P'                `Y8888P ,88P'           8 888888888888 \r\n"
				+ "");
	}
	public void bye() {

		System.out.println("\r\n"
				+ "                                                                                                            \r\n"
				+ "8 888888888o   `8.`8888.      ,8' 8 8888888888             8 888888888o   `8.`8888.      ,8' 8 8888888888   \r\n"
				+ "8 8888    `88.  `8.`8888.    ,8'  8 8888                   8 8888    `88.  `8.`8888.    ,8'  8 8888         \r\n"
				+ "8 8888     `88   `8.`8888.  ,8'   8 8888                   8 8888     `88   `8.`8888.  ,8'   8 8888         \r\n"
				+ "8 8888     ,88    `8.`8888.,8'    8 8888                   8 8888     ,88    `8.`8888.,8'    8 8888         \r\n"
				+ "8 8888.   ,88'     `8.`88888'     8 888888888888           8 8888.   ,88'     `8.`88888'     8 888888888888 \r\n"
				+ "8 8888888888        `8. 8888      8 8888                   8 8888888888        `8. 8888      8 8888         \r\n"
				+ "8 8888    `88.       `8 8888      8 8888                   8 8888    `88.       `8 8888      8 8888         \r\n"
				+ "8 8888      88        8 8888      8 8888                   8 8888      88        8 8888      8 8888         \r\n"
				+ "8 8888    ,88'        8 8888      8 8888                   8 8888    ,88'        8 8888      8 8888         \r\n"
				+ "8 888888888P          8 8888      8 888888888888           8 888888888P          8 8888      8 888888888888 \r\n"
				+ "");
	}
	public void logo() {
		System.out.println("    ....::.                   :.:                                                                                           ..:.                      \r\n"
				+ "    BBBBBBBBQr                BBBZ                        BBBv                                                              BBQB                      \r\n"
				+ "    BBBR  :BBBS               BBB1                        BBBL                                                              BBBZ                      \r\n"
				+ "    QBBb    BBB    7QBBBgr    BBBL  gBBQ     sBBQBE:   :QBBBBBBBr sBBBXBBB7.QBBBS     LBBBBg:    BBBuPBBBR.                 BBBd   :QBBB7 :BBBBr      \r\n"
				+ "    QBBK   7BBB   BBBD1BBBB   BBB: BBBE    .BBBvrPBBZ   PJBBBDjq. uBBBBjBBBBEuBQBK  .QBBbuBBBQ   BBBBBUQBBB                 BBBP   BBBBBBXBBBBBB.     \r\n"
				+ "    QBBBqgBBBB.  BQB1   DBBZ  BBBQBBB.     BQB:   QBBv    BBBi    vBBB  QBBP  QBBg  BBBr   BQBs  BBB7  .QBB                 BBBE   BBBQBBBBBBBBB      \r\n"
				+ "    BBBBBBBbr    BBBi   sBBB  BBBBBBZ     .QBQBQBQBQBB    BBBr    LBBB  BBBX  BBBb  BBB    PBBB  BBB:  .BBB                 BBBZ    KBBBBQBBBBd       \r\n"
				+ "    QBQd         BBBu   EBBE  QBQB2BBB     BBBi    .::    BBBL    vBQB  BBQP  BBBd  BBBr   BQBs  BBBi  :BBQ           7DK7  BBBb       iBBB7          \r\n"
				+ "    BBBQ          BBBd7QBBB   BBBv 7BBB.   :BBBi:uBBB     QQBBBQ. JBBB  BBBD  BBBg  :BBBK7BBBB   QBB7  :BBB           iBBBJYBBB          r            \r\n"
				+ "    BBQB           1BBBBBY    BBBU  7BBBi    XBBQBBv       rqBBBi JBBB  BBQD  BBBR    5BBBBBr    BQB7  iBBB            .ZBBBBq             ");
	}
	
}
