package Controller;

import javazoom.jl.player.MP3Player;

public class Controller {

	static MP3Player mp3 = new MP3Player();

	public static void main(String[] args) {
	}
	public static void play(String poketName) {
		//�뷡���
		if (poketName.equals("��ī��")) {
			mp3.play("C://��ī��.mp3");
			System.out.println("��ī�� �����մϴ�.");
			System.out.println("��ī�� : ��ī��ī~");
		} else if (poketName.equals("���̸�")) {
			mp3.play("C://���̸�.mp3");
			System.out.println("���̸��� �����մϴ�.");
			System.out.println("���̸� : ���̸�~");
		} else if (poketName.equals("�̻��ؾ�")) {
			mp3.play("C://�̻��ؾ�.mp3");
			System.out.println("�̻��ؾ��� �����մϴ�.");
			System.out.println("�̻��ؾ� : ���� ���� �̻��ؾ�");
		} else if (poketName.equals("���α�")) {
			mp3.play("C://���α�.mp3");
			System.out.println("���αⰡ �����մϴ�.");
			System.out.println("���α� : ����Ĩ�� �� �������!");
		} else if (poketName.equals("Ǫ��")) {
			mp3.play("C://Ǫ��.mp3");
			System.out.println("Ǫ���� �����մϴ�.");
			System.out.println("Ǫ�� : Ǫ�� Ǫ�� Ǫ����");
		} else if (poketName.equals("����")) {
			mp3.play("C://����.mp3");
			System.out.println("������ �����մϴ�.");
			System.out.println("���� : ���� ������ �����Ŵٸ� ����ص帮�� �� ���������ٿ�!");
		} else if (poketName.equals("���ڿ�")) {
			mp3.play("C://���ڿ�.mp3");
			System.out.println("���ڿ� �����մϴ�.");
			System.out.println("���ڿ� : �� ������ ���ڿ�~");
		} else if (poketName.equals("����Ĵ�")) {
			mp3.play("C://����Ĵ�.mp3");
			System.out.println("����Ĵ��� �����մϴ�.");
			System.out.println("����Ĵ� : ��������Ĵ�");
		} else if (poketName.equals("�����")) {
			mp3.play("C://�����.mp3");
			System.out.println("����ǰ� ���� Ƣ��� �����մϴ�.");
		} else if (poketName.equals("ġ�ڸ�Ÿ")) {
			mp3.play("C://ġ�ڸ�Ÿ.mp3");
			System.out.println("ġ�ڸ�Ÿ�� �ٻ�͸� ���� �����մϴ�.");
		}
	}
	
	public static void play(int result) {
		
		if (result == 1) {
			System.out.println("�α��α�..."); 
            pause(1000);
            mp3.play("C://��Ÿ.mp3");
            System.out.println("��Ÿ!");
            System.out.println();
            pause(800);
		} else if (result == 2) {
			System.out.println("�α��α�..."); 
            pause(1000);
            mp3.play("C://Ȩ��.mp3");
            System.out.println("Ȩ��!");
            System.out.println();
            pause(800);
		} else if (result == 3) {
			System.out.println("�α��α�..."); 
            pause(1000);
            mp3.play("C://�ƿ�.mp3");
            System.out.println("�ƿ�!");
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
