package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.User_DAO;
import model.User_VO;

public class Main {

	public static void main(String[] args) {

		User_DAO userDAO = new User_DAO();
		Scanner sc = new Scanner(System.in);

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
								break; //for�� ��������
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
							if (user_ID.equals(vo.getNAME())) {
								System.out.println("�̹� ��� ���� �̸��Դϴ�.");
								namepn = false;
								break; //for�� ��������
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
				
				// ĳ���� �߰� �ϱ� //
				
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
								cnt ++;
								System.out.println("��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
								break;
							}
						}else {
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

			} // end of else if (menu == 2)

		} // end of while

	}

}
