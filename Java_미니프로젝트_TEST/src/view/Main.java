package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Controller.Controller;
//import javazoom.jl.player.MP3Player;
import model.Champ_DAO;
import model.Champ_VO;
import model.Record_DAO;
import model.Record_VO;
import model.User_DAO;
import model.User_VO;

// 내일 할 일 : 출전 멘트 출력
// 랭킹시스템 추가
public class Main {

	public static void main(String[] args) {

		User_DAO userDAO = new User_DAO();
		Scanner sc = new Scanner(System.in);
		Champ_DAO champDAO = new Champ_DAO();
		Record_DAO recordDAO = new Record_DAO();
		Controller con = new Controller();

		Random rd = new Random();
		int menu = 0;
		boolean start = true;
		con.logo();
		while (true) {
			con.stop();
			con.open();
//			System.out.println("====================야구게임====================");
			System.out.println();
			System.out.println("[1]회원가입 [2]로그인 [3]종료");
			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt();

			if (menu == 1) {
				System.out.println(menu + "번 선택");
				System.out.println("====================회원가입====================");
				ArrayList<User_VO> al = userDAO.selectUser();
				boolean idpn = false;
				String user_ID = null;
				while (!idpn) {
					System.out.println("현재 플레이어 수 : " + al.size());
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
				recordDAO.insertWinLoseCount(user_ID);

				System.out.println("사용할 포켓몬 3마리를 선택해주세요.");
				System.out.println("[1]피카츄 [2]파이리 [3]이상해씨 [4]꼬부기 [5]푸린 [6]나옹 [7]마자용 [8]고라파덕 [9]토게피 [10]치코리타");
				con.first(user_ID);
				int cnt = 1;
				while (cnt < 3) {
					con.team(user_ID);
					cnt++;
				}

				System.out.println("포켓몬 구단이 완성되었습니다.");

			} // end of if (menu == 1)
			else if (menu == 2) {
				System.out.println(menu + "번 선택");
				System.out.println("====================로그인창====================");
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
								start = true;
								break;
							} else {
								System.out.println("비밀번호가 올바르지 않습니다.");
								cnt = 0;
								break;
							}
						} else {
							cnt++;
						}
						if (cnt >= al.size()) {
							System.out.println("존재하지 않는 회원입니다.");
							cnt = 0;
							break;
						}
					} // end of for
					log++;
					if (log > 4) {
						System.out.println("회원가입을 진행해주세요.");
						menu = 1;
						pn = false;
						start = false;
					}
				} // end of while

				// 게임 화면 구축하기 //
				while (start) {
					ArrayList<String> checkP = champDAO.fiterChamp(user_ID);
					if (checkP.size() < 3) {
						System.out.println("선수가 부족합니다. 구단을 완성해주세요.");
						System.out.println("사용할 포켓몬을 선택해주세요.");
						System.out.println("[1]피카츄 [2]파이리 [3]이상해씨 [4]꼬부기 [5]푸린 [6]나옹 [7]마자용 [8]고라파덕 [9]토게피 [10]치코리타");
						if (checkP.size() == 0) {
							con.first(user_ID);
						}
						while (champDAO.fiterChamp(user_ID).size() < 3) {
							con.team(user_ID);
						}
						System.out.println("포켓몬 구단이 완성되었습니다.");
					}
					System.out.print("[1]게임시작 [2]내 포켓몬 확인 [3]랭킹확인 [4]로그아웃 >> ");
					int gamemenu = sc.nextInt(); // 게임 시작메뉴
					int addmenu = 0; // 승리시 포켓몬 추가할때 메뉴
					int rankmenu = 0; // 랭크확인 메뉴
					int score = 0;
					int out = 0;
					int win = 0;
					ArrayList<String> list = champDAO.fiterChamp(user_ID);
					if (gamemenu == 1) {
						con.stop();
						System.out.println("게임을 시작합니다");
						String poketName = null;

						boolean game = true;
						while (game) {
							int fiterNum = rd.nextInt(al.size()) + 1; // al 유저의 수
							// 내포켓몬 선택하기
							con.choose();
							System.out.println("출전시킬 포켓몬을 골라주세요.");
							System.out.println("====================보유 포켓몬 목록====================");
							for (int i = 0; i < list.size(); i++) {
								System.out.print(list.get(i) + " ");
							}
							System.out.print("\n포켓몬 선택 : ");
							poketName = sc.next();
							System.out.println();
							con.play(poketName);
							System.out.println();
							pause(4000);

							int userPower = champDAO.poketPower(user_ID, poketName);

							String poket = champDAO.getPoket(fiterNum);
							int fiterPower = champDAO.poketPower(fiterNum, poket);

							System.out.println("대결을 펼친 상대투수는요..!");
							System.out.println();
							pause(800);

							con.play(poket);
							System.out.println();
							pause(4000);

							System.out.println("경기 시작합니다!");

							if (userPower >= fiterPower) {
								if ((userPower - fiterPower) <= 50) {
									con.play(1);
									score += 2;
									System.out.println("현재 점수 : " + score);
									System.out.println("아웃 : " + out);
									System.out.println();

								} else {
									con.play(2);
									score += 3;
									System.out.println("현재 점수 : " + score);
									System.out.println("아웃 : " + out);
									System.out.println();
								}
							} else if (userPower < fiterPower) {
								con.play(3);
								out += 1;
								System.out.println("현재 점수 : " + score);
								System.out.println("아웃 : " + out);
								System.out.println();
							}
							if (out == 3) {
								con.lose();
								recordDAO.updateLose(user_ID);
								score = 0;
								out = 0;
								System.out.println();
								System.out.print("계속 하시겠습니까? (Y/N) >> ");
								String yn = sc.next();
								if (yn.equals("N") || yn.equals("n")) {
									game = false;
								}
							}
							if (score >= 5) {
								con.win();
								recordDAO.updatetWin(user_ID);
								score = 0;
								out = 0;
								recordDAO.updateCount(user_ID);
								System.out.println();
								if (recordDAO.getCount(user_ID) >= 2) {
									System.out.println("승리횟수가 2회 이상 누적되어 포켓몬을 추가할 수 있습니다.");
									System.out.print("포켓몬을 추가하시겠습니까? [1]네 [2]아니오 >> ");
									addmenu = sc.nextInt();
									if (addmenu == 1) {
										System.out.println("추가할 포켓몬을 선택해주세요.");
										System.out.println(
												"[1]피카츄 [2]파이리 [3]이상해씨 [4]꼬부기 [5]푸린 [6]나옹 [7]마자용 [8]고라파덕 [9]토게피 [10]치코리타");
										con.team(user_ID);
										System.out.println("포켓몬 구단이 완성되었습니다.");
										recordDAO.zerosetCount(user_ID);
										list = champDAO.fiterChamp(user_ID);
									}
								}
								System.out.print("계속 하시겠습니까? (Y/N) >> ");
								String yn = sc.next();
								if (yn.equals("N") || yn.equals("n")) {
									game = false;
								}
							} // end of if (score <= 10)
						} // end of while (game)

					} else if (gamemenu == 2) {
						con.stop();
						System.out.println("====================보유 포켓몬 목록====================");
						ArrayList<Champ_VO> poketList = champDAO.selectChamp(user_ID);
						for (Champ_VO vo : poketList) {
							System.out.println("포켓몬 이름 :" + vo.getPoketmon() + "\t" + "능력치 : " + vo.getPoketPower());
						}

					} else if (gamemenu == 3) {
						con.stop();
						System.out.print("[1]점수랭킹확인 [2]전적랭킹확인 [3]뒤로가기 >> ");
						rankmenu = sc.nextInt();
						ArrayList<Record_VO> rank = null;
						ArrayList<Record_VO> winlose = null;

						if (rankmenu == 1) {
							rank = recordDAO.rankCheck();
							for (int i = 0; i < rank.size(); i++) {
								System.out.println((i + 1) + "등" + "\t" + rank.get(i).getUser_ID() + "\t"
										+ rank.get(i).getScore());
							}
						} else if (rankmenu == 2) {
							winlose = recordDAO.winloseCheck();
							System.out.println("등수" + "\t" + "닉네임" + "\t" + "WIN" + "\t" + "LOSE");
							for (int i = 0; i < winlose.size(); i++) {
								System.out.println((i + 1) + "등" + "\t" + winlose.get(i).getUser_ID() + "\t"
										+ winlose.get(i).getWinCnt() + "\t" + winlose.get(i).getLoseCnt());
							}
						}
					} else if (gamemenu == 4) {
						con.stop();
						System.out.println("로그아웃 되었습니다.");
						start = false;
					}
				} // end of while (start)
			} // end of else if (menu == 2)
			else {
				con.stop();
				pause(500);
				con.end();
				con.bye();
				break;
			}
		} // end of while

	}

	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}
}