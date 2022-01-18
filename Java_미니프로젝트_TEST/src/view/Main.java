package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Champ_DAO;
import model.User_DAO;
import model.User_VO;

public class Main {

	public static void main(String[] args) {

		User_DAO userDAO = new User_DAO();
		Scanner sc = new Scanner(System.in);
		Champ_DAO champDAO = new Champ_DAO();

		int menu = 0;

		while (true) {
			System.out.println("==========�߱�����==========");
			System.out.println("[1]ȸ������ [2]�α��� [3]����");
			System.out.print("�޴� ���� >> ");
			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println(menu + "�� ����");
				System.out.println("==========ȸ������==========");
				ArrayList<User_VO> al = userDAO.selectUser();
				boolean idpn = false;
				String user_ID = null;
				while (!idpn) {
					System.out.println("al�� ũ�� : " + al.size());
					System.out.print("����� ID : ");
					user_ID = sc.next();
					if (al.size() != 0) {
						for (User_VO vo : al) {
							if (user_ID.equals(vo.getID())) {
								System.out.println("�̹� ��� ���� ���̵��Դϴ�.");
								idpn = false;
								break; // for�� ��������
							} else {
								idpn = true;
							}
						} // end of for
					} else {
						idpn = true;
						break;
					}
				} // end of while
				System.out.print("����� PW : ");
				String user_PW = sc.next();
				boolean namepn = false;
				String user_NAME = null;
				while (!namepn) {
					System.out.print("����� �̸��� �����ּ��� >> ");
					user_NAME = sc.next();
					if (al.size() != 0) {
						for (User_VO vo : al) {
							if (user_NAME.equals(vo.getNAME())) {
								System.out.println("�̹� ��� ���� �̸��Դϴ�.");
								namepn = false;
								break; // for�� ��������
							} else {
								namepn = true;
							}
						} // end of for
					} else {
						namepn = true;
						break;
					}
				} // end of while
				boolean check = userDAO.insertUser(user_ID, user_PW, user_NAME);
				if (check) {
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				} // end of if

				int poketmonNum = 0;
				System.out.println("����� ���ϸ� 3������ �������ּ���.");
				System.out.println("[1]��ī�� [2]���̸� [3]�̻��ؾ� [4]���α� [5]Ǫ�� [6]���� [7]�Ḹ�� [8]����Ĵ� [9]����� [10]���̽�");
				for (int i=1; i<=3; i++) {
					System.out.print("������ ���ϸ� : ");
					poketmonNum = sc.nextInt();
					boolean checkchamp = champDAO.insertChamp(user_ID, poketmonNum);
					if(checkchamp) {
						System.out.println(champDAO.Champ(poketmonNum) + "���ϸ� ���Ϻ��� ���� �Ϸ�");
					}
				}
				System.out.println("���ϸ� ������ �ϼ��Ǿ����ϴ�.");

			} // end of if (menu == 1)
			else if (menu == 2) {
				System.out.println(menu + "�� ����");
				System.out.println("==========�α���â==========");
				ArrayList<User_VO> al = userDAO.selectUser();

				String user_ID = null;
				String user_PW = null;

				boolean pn = true;
				int cnt = 0;
				int log = 0;
				while (pn) {
					System.out.print("ID : ");
					user_ID = sc.next();
					System.out.print("PW : ");
					user_PW = sc.next();
					for (User_VO vo : al) {
						if (user_ID.equals(vo.getID())) {
							if (user_PW.equals(vo.getPW())) {
								System.out.println("�α��� ����");
								pn = false;
								break;
							} else {
								cnt++;
								System.out.println("��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
								break;
							}
						} else {
							cnt++;
						}
						if (cnt >= al.size()) {
							System.out.println("�������� �ʴ� ȸ���Դϴ�.");
							break;
						}
					} // end of for
					log++;
					if (log > 4) {
						System.out.println("ȸ�������� �������ּ���.");
						pn = false;
					}
				} // end of while

				// ���� ȭ�� �����ϱ� //
				System.out.println("[1]���ӽ��� [2]�� ���ϸ� Ȯ�� [3]��ŷȮ�� [4]����");
				int num1 =sc.nextInt();
				int score = 0;
				int out = 0;
				if(num1 == 1) {
					while(true) {
					System.out.println("������ �����մϴ�");
					// �����ϸ� �����ϱ� 
					if(�����ϸ� > �����ϸ�) {
						if((�����ϸ�-�����ϸ�)<=50) {
							System.out.println("��Ÿ!");
							score += 1;
						}else {
							System.out.println("Ȩ��!");
							score += 2;
						}
					}else if(�����ϸ� < �����ϸ�) {
						System.out.println("�ƿ�!");
						out += 1;
					}
					if(out == 3) {
						System.out.println("�й��Ͽ����ϴ�");
						break;
					}
					if(score >= 10) {
						System.out.println("�¸��Ͽ����ϴ�");
						break;
					}
					}
				}else if(num1 == 2) {
					ArrayList<champ_VO> al= ;
					//for each������ �ҷ��ö�
					for(StudentVO vo:al) {
						System.out.println("==================");
						System.out.println("ID : " );
						System.out.println("���ϸ��̸� : " );
						System.out.println("�ɷ� : " );
						System.out.println("���ϸ��ȣ : ");
						System.out.println();
					
				}else if(num1 == 3) {
					
				}else if(num1 == 4) {
					System.out.println("����");
					break;
				}
			} // end of else if (menu == 2)

		} // end of while
			//  �׽�Ʈ�մϴ�......
	}

}
