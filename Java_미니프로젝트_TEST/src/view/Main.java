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
			System.out.println("==========야구게임==========");
			System.out.println("[1]회원가입 [2]로그인 [3]종료");
			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println(menu + "번 선택");
				System.out.println("==========회원가입==========");
				ArrayList<User_VO> al = userDAO.selectUser();
				boolean idpn = false;
				String user_ID = null;
				while (!idpn) {
					System.out.print("사용할 ID : ");
					user_ID = sc.next();
					if (al.size() != 0) {
						for (User_VO vo : al) {
							if (user_ID == vo.getID()) {
								System.out.println("이미 사용 중인 아이디입니다.");
								idpn = false;
								break; //for문 빠져나옴
							} else {
								idpn = true;
							}
						} // end of for
					} else {
						idpn = true;
						break;
					}
				} // end of while
				System.out.print("사용할 PW : ");
				String user_PW = sc.next();
				boolean namepn = false;
				String user_NAME = null;
				while (!namepn) {
					System.out.print("사용할 이름을 정해주세요 >> ");
					user_NAME = sc.next();
					if (al.size() != 0) {
						for (User_VO vo : al) {
							if (user_ID == vo.getNAME()) {
								System.out.println("이미 사용 중인 이름입니다.");
								namepn = false;
								break; //for문 빠져나옴
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
					System.out.println("회원가입이 완료되었습니다.");
				} // end of if
			} // end of if (menu == 1)

		}

	}

}
