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
					System.out.print("����� ID : ");
					user_ID = sc.next();
					if (al.size() != 0) {
						for (User_VO vo : al) {
							if (user_ID == vo.getID()) {
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
							if (user_ID == vo.getNAME()) {
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
			} // end of if (menu == 1)

		}

	}

}
