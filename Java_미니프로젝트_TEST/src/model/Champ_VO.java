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
	      if (poketmon.equals("��ī��")) {
	         System.out.println("��ī�� �����մϴ�.");
	         System.out.println("��ī�� : ��ī��ī~");
	      } else if (poketmon.equals("���̸�")) {
	         System.out.println("���̸��� �����մϴ�.");
	         System.out.println("���̸� : ���̸�~");
	      } else if (poketmon.equals("�̻��ؾ�")) {
	         System.out.println("�̻��ؾ��� �����մϴ�.");
	         System.out.println("�̻��ؾ� : ���� ���� �̻��ؾ�");
	      } else if (poketmon.equals("���α�")) {
	         System.out.println("���αⰡ �����մϴ�.");
	         System.out.println("���α� : ����Ĩ�� �� �������!");
	      } else if (poketmon.equals("Ǫ��")) {
	         System.out.println("Ǫ���� �����մϴ�.");
	         System.out.println("Ǫ�� : Ǫ�� Ǫ�� Ǫ����");
	      } else if (poketmon.equals("����")) {
	         System.out.println("������ �����մϴ�.");
	         System.out.println("���� : ���� ������ �����Ŵٸ� ����ص帮�� �� ���������ٿ�!");
	      } else if (poketmon.equals("���ڿ�")) {
	         System.out.println("���ڿ� �����մϴ�.");
	         System.out.println("���ڿ� : �� ������ ���ڿ�~");
	      } else if (poketmon.equals("����Ĵ�")) {
	         System.out.println("����Ĵ��� �����մϴ�.");
	         System.out.println("����Ĵ� : ��������Ĵ�");
	      } else if (poketmon.equals("�����")) {
	         System.out.println("����ǰ� ���� Ƣ��� �����մϴ�.");
	      } else if (poketmon.equals("ġ�ڸ�Ÿ")) {
	         System.out.println("ġ�ڸ�Ÿ�� �ٻ�͸� ���� �����մϴ�.");
	      }
	   }

	}