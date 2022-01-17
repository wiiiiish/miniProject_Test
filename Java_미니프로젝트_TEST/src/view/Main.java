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
					System.out.println("al의 크기 : " + al.size());
					System.out.print("사용할 ID : ");
					user_ID = sc.next();
					if (al.size() != 0) {
						for (User_VO vo : al) {
							if (user_ID.equals(vo.getID())) {
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
							if (user_ID.equals(vo.getNAME())) {
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
				
				// 캐릭터 추가 하기 //
				
			} // end of if (menu == 1)
			else if (menu == 2) {
				System.out.println(menu + "번 선택");
				System.out.println("==========로그인창==========");
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
								System.out.println("로그인 성공");
								pn = false;
								break;
							} else {
								cnt ++;
								System.out.println("비밀번호가 올바르지 않습니다.");
								break;
							}
						}else {
								cnt++;
						}
						if (cnt >= al.size()) {
							System.out.println("존재하지 않는 회원입니다.");
							break;
						}
					} // end of for
					log++;
					if (log > 4) {
						System.out.println("회원가입을 진행해주세요.");
						pn = false;
					}
				} // end of while

				// 게임 화면 구축하기 //

			} // end of else if (menu == 2)

		} // end of while

	}

}
