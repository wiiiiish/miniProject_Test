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
	      if (poketmon.equals("��ī��")) {
	         System.out.println("��ī�� �����մϴ�.");
	         System.out.println("��ī��ī~");
	      } else if (poketmon.equals("���̸�")) {
	         System.out.println("���̸��� �����մϴ�.");
	         System.out.println("���̸�~");
	      } else if (poketmon.equals("�̻��ؾ�")) {
	         System.out.println("�̻��ؾ��� �����մϴ�.");
	         System.out.println("���� ���� �̻��ؾ�");
	      } else if (poketmon.equals("���α�")) {
	         System.out.println("���αⰡ �����մϴ�.");
	         System.out.println("����Ĩ�� �� �������!");
	      } else if (poketmon.equals("Ǫ��")) {
	         System.out.println("Ǫ���� �����մϴ�.");
	         System.out.println("Ǫ�� Ǫ�� Ǫ����");
	      } else if (poketmon.equals("����")) {
	         System.out.println("������ �����մϴ�.");
	         System.out.println("���� ������ �����Ŵٸ� ����ص帮�� �� ��������! ���� ����");
	      } else if (poketmon.equals("�Ḹ��")) {
	         System.out.println("�Ḹ���� �����մϴ�.");
	         System.out.println("���� ��");
	      } else if (poketmon.equals("����Ĵ�")) {
	         System.out.println("����Ĵ��� �����մϴ�.");
	         System.out.println("��������Ĵ�");
	      } else if (poketmon.equals("�����")) {
	         System.out.println("����ǰ� �����մϴ�.");
	         System.out.println("����� �����ϴٰ� ��, �� �ǳ�~");
	      } else if (poketmon.equals("���̽�")) {
	         System.out.println("���̽ð� �����մϴ�.");
	         System.out.println("���̽ð� �θ��ϴ�. �׶��� ���Ҿ�");
	      }
	   }

	}