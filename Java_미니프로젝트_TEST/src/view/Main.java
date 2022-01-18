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
								break; // for문 빠져나옴
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
							if (user_NAME.equals(vo.getNAME())) {
								System.out.println("이미 사용 중인 이름입니다.");
								namepn = false;
								break; // for문 빠져나옴
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

				String poketmon = null; // 채원.새로 추가한 부분
				System.out.println("사용할 포켓몬 3마리를 선택헤주세요");
				System.out.println("[1]피카츄 [2]파이리 [3]이상해씨 [4]꼬부기 [5]푸린 [6]나옹 [7]잠만보 [8]고라파덕 [9]모다피 [10]케이스");

				for (int i = 1; i <= 3; i++) {
					System.out.print("데려갈 포켓몬 : ");
					poketmon = sc.next();
				}

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
								cnt++;
								System.out.println("비밀번호가 올바르지 않습니다.");
								break;
							}
						} else {
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
			// 테스트중입니다.
			// 왜안되지.ㅇ\ㅇㅇ
	}

}
