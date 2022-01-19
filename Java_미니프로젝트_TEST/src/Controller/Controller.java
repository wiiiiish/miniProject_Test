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
		//�뷡���
		if (poketName.equals("��ī��")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\��ī��.mp3");
			System.out.println("��ī�� �����մϴ�.");
			System.out.println("��ī�� : ��ī��ī~");
		} else if (poketName.equals("���̸�")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\���̸�.mp3");
			System.out.println("���̸��� �����մϴ�.");
			System.out.println("���̸� : ���̸�~");
		} else if (poketName.equals("�̻��ؾ�")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\�̻��ؾ�.mp3");
			System.out.println("�̻��ؾ��� �����մϴ�.");
			System.out.println("�̻��ؾ� : ���� ���� �̻��ؾ�");
		} else if (poketName.equals("���α�")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\���α�.mp3");
			System.out.println("���αⰡ �����մϴ�.");
			System.out.println("���α� : ����Ĩ�� �� �������!");
		} else if (poketName.equals("Ǫ��")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\Ǫ��.mp3");
			System.out.println("Ǫ���� �����մϴ�.");
			System.out.println("Ǫ�� : Ǫ�� Ǫ�� Ǫ����");
		} else if (poketName.equals("����")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\����.mp3");
			System.out.println("������ �����մϴ�.");
			System.out.println("���� : ���� ������ �����Ŵٸ� ����ص帮�� �� ���������ٿ�!");
		} else if (poketName.equals("���ڿ�")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\���ڿ�.mp3");
			System.out.println("���ڿ� �����մϴ�.");
			System.out.println("���ڿ� : �� ������ ���ڿ�~");
		} else if (poketName.equals("����Ĵ�")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\����Ĵ�.mp3");
			System.out.println("����Ĵ��� �����մϴ�.");
			System.out.println("����Ĵ� : ��������Ĵ�");
		} else if (poketName.equals("�����")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\�����.mp3");
			System.out.println("����ǰ� ���� Ƣ��� �����մϴ�.");
		} else if (poketName.equals("ġ�ڸ�Ÿ")) {
			mp3.play("C:\\Users\\smhrd\\Desktop\\music\\ġ�ڸ�Ÿ.mp3");
			System.out.println("ġ�ڸ�Ÿ�� �ٻ�͸� ���� �����մϴ�.");
		}
	}
	
	public void play(int result) {
		
		if (result == 1) {
			System.out.println("�α��α�..."); 
            pause(1000);
            mp3.play("C:\\Users\\smhrd\\Desktop\\music\\��Ÿ.mp3");
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
			System.out.println("�α��α�..."); 
            pause(1000);
            mp3.play("C:\\Users\\smhrd\\Desktop\\music\\Ȩ��.mp3");
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
			System.out.println("�α��α�..."); 
            pause(1000);
            mp3.play("C:\\Users\\smhrd\\Desktop\\music\\�ƿ�.mp3");
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
		mp3.play("C:\\Users\\smhrd\\Desktop\\music\\������.mp3");
	}
	
	public void choose() {
		mp3.play("C:\\Users\\smhrd\\Desktop\\music\\���ϸ���.mp3");
	}
	
	public void end() {
		mp3.play("C:\\Users\\smhrd\\Desktop\\music\\����.mp3");
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
			System.out.print("������ ���ϸ� : ");
			poketNum = sc.nextInt();

			String vspoketName = null;
			String mypoket = champDAO.Champ(poketNum-1);
			
			for (int i=0; i<champDAO.fiterChamp(user_ID).size(); i++) {
				vspoketName = champDAO.fiterChamp(user_ID).get(i);
				if (mypoket.equals(vspoketName)) {
					System.out.println("�̹� ������ ���ϸ��Դϴ�. �ٽ� �������ּ���.");
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
					System.out.println(champDAO.Champ(poketNum-1) + "���ϸ� ���Ϻ��� ���� �Ϸ�");
				}
				vs = false;
			}
		} // end of while
	}

	public void first(String user_ID) {
		int poketNum = 0;
		System.out.print("������ ���ϸ� : ");
		poketNum = sc.nextInt();
		int Num = userDAO.getNum(user_ID);
		boolean checkchamp = champDAO.insertChamp(Num, user_ID, champDAO.Champ(poketNum-1));
		if(checkchamp) {
			System.out.println(champDAO.Champ(poketNum-1) + "���ϸ� ���Ϻ��� ���� �Ϸ�");
		}
	}
}
