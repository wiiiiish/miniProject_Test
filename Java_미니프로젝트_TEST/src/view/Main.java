package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Champ_DAO;
import model.Champ_VO;
import model.Record_DAO;
import model.Record_VO;
import model.User_DAO;
import model.User_VO;
// ���� �� �� : ���� ��Ʈ ���
// ��ŷ�ý��� �߰�
public class Main {

   public static void main(String[] args) {

      User_DAO userDAO = new User_DAO();
      Scanner sc = new Scanner(System.in);
      Champ_VO champVO = new Champ_VO();
      Champ_DAO champDAO = new Champ_DAO();
      Record_VO recordVO = new Record_VO();
      Record_DAO recordDAO = new Record_DAO();

      
      Random rd = new Random();
      int menu = 0;
      boolean start = true;

      while (true) {
         System.out.println("====================�߱�����====================");
         System.out.println("[1]ȸ������ [2]�α��� [3]����");
         System.out.print("�޴� ���� >> ");
         menu = sc.nextInt();

         if (menu == 1) {
            System.out.println(menu + "�� ����");
            System.out.println("====================ȸ������====================");
            ArrayList<User_VO> al = userDAO.selectUser();
            boolean idpn = false;
            String user_ID = null;
            while (!idpn) {
               System.out.println("���� �÷��̾� �� : " + al.size());
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
            boolean inWinLose = recordDAO.insertWinLose(user_ID);

            int poketNum = 0;
            System.out.println("����� ���ϸ� 3������ �������ּ���.");
            System.out.println("[1]��ī�� [2]���̸� [3]�̻��ؾ� [4]���α� [5]Ǫ�� [6]���� [7]���ڿ� [8]����Ĵ� [9]����� [10]ġ�ڸ�Ÿ");
            for (int i=1; i<=3; i++) {
               System.out.print("������ ���ϸ� : ");
               poketNum = sc.nextInt();
               int Num = userDAO.getNum(user_ID);
               boolean checkchamp = champDAO.insertChamp(Num, user_ID, poketNum-1);
               if(checkchamp) {
                  System.out.println(champDAO.Champ(poketNum-1) + "���ϸ� ���Ϻ��� ���� �Ϸ�");
               }
            }
            System.out.println("���ϸ� ������ �ϼ��Ǿ����ϴ�.");

         } // end of if (menu == 1)
         else if (menu == 2) {
            System.out.println(menu + "�� ����");
            System.out.println("====================�α���â====================");
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
                        start = true;
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
                     cnt=0;
                     break;
                  }
               } // end of for
               log++;
               if (log > 4) {
                  System.out.println("ȸ�������� �������ּ���.");
                  menu=1;
                  pn = false;
                  start = false;
               }
            } // end of while

            // ���� ȭ�� �����ϱ� //
            while (start) {
            System.out.print("[1]���ӽ��� [2]�� ���ϸ� Ȯ�� [3]��ŷȮ�� [4]�α׾ƿ� >> ");
            int gamemenu =sc.nextInt(); //���� ���۸޴�
            int addmenu = 0;  // �¸��� ���ϸ� �߰��Ҷ� �޴�
            int rankmenu = 0; // ��ũȮ�� �޴�
            int wincnt = 0; 
            int losecnt = 0; 
            int score = 0;
            int out = 0;
            int win = 0;
            ArrayList<String> list = champDAO.fiterChamp(user_ID);
            if(gamemenu == 1) {
               System.out.println("������ �����մϴ�");
               String poketName = null;
               ArrayList<String> userPoket = null;
               ArrayList<String> fiterPoket = null;

               boolean game = true;
               while(game) {
                  int fiterNum = rd.nextInt(al.size())+1; // al ������ ��
                  // �����ϸ� �����ϱ� 
                  System.out.println("������ų ���ϸ��� ����ּ���.");
                  System.out.println("====================���� ���ϸ� ���====================");
                  for (int i=0; i<list.size(); i++) {
                     System.out.print(list.get(i) + " ");
                  }
                  System.out.print("\n���ϸ� ���� : ");
                  poketName = sc.next();
                  
                  System.out.println();
                  champVO.move(poketName);
                  System.out.println();
                  pause(800);

                  int userPower = champDAO.poketPower(user_ID, poketName);

                  String poket = champDAO.getPoket(fiterNum);
                  int fiterPower = champDAO.poketPower(fiterNum, poket);
                  
                  System.out.println("����� ��ģ ��������¿�..!");
                  System.out.println();
                  pause(800);
                  champVO.move(poket);
                  
                  pause(800);
                  
                  System.out.println();
                  
                  System.out.println("��� �����մϴ�!");


                  if( userPower >= fiterPower) {
                     if((userPower - fiterPower) <= 50) {
                        System.out.println("�α��α�..."); 
                        pause(1000);
                        System.out.println("��Ÿ!");
                        System.out.println();
                        score += 1;
                        pause(800);
                     }else {
                        System.out.println("�α��α�..."); 
                        pause(1000);
                        System.out.println("Ȩ��!");
                        System.out.println();
                        score += 2;
                        pause(800);
                     }
                  }else if(userPower < fiterPower) {
                     System.out.println("�α��α�..."); 
                     pause(1000);
                     System.out.println("�ƿ�!");
                     System.out.println();
                     out += 1;
                     pause(800);
                  }
                  if(out == 3) {
                     System.out.println("�й��Ͽ����ϴ�");
                     recordDAO.updateLose(user_ID);
                     score = 0;
                     out = 0;
                     System.out.print("��� �Ͻðڽ��ϱ�? (Y/N) >> ");
                     String yn = sc.next();
                     if (yn.equals("N") || yn.equals("n")) {
                        game = false;
                     }
                  }
                  if(score >= 10) {
                     System.out.println("�¸��Ͽ����ϴ�");
                     recordDAO.updatetWin(user_ID);
                     score = 0;
                     out = 0;
                     win ++;
                     if (win >= 2) {
                        System.out.println("�¸�Ƚ���� 2ȸ �̻� �����Ǿ� ���ϸ��� �߰��� �� �ֽ��ϴ�.");
                        System.out.print("���ϸ��� �߰��Ͻðڽ��ϱ�? [1]�� [2]�ƴϿ� >> ");
                        addmenu = sc.nextInt();
                        if (addmenu == 1) {
                           int poketNum = 0;
                           System.out.println("����� ���ϸ��� �������ּ���.");
                           System.out.println("[1]��ī�� [2]���̸� [3]�̻��ؾ� [4]���α� [5]Ǫ�� [6]���� [7]���ڿ� [8]����Ĵ� [9]����� [10]ġ�ڸ�Ÿ");
                           System.out.print("������ ���ϸ� : ");
                           poketNum = sc.nextInt();
                           int Num = userDAO.getNum(user_ID);
                           boolean checkchamp = champDAO.insertChamp(Num, user_ID, poketNum-1);
                           if(checkchamp) {
                              System.out.println(champDAO.Champ(poketNum-1) + "���ϸ� ���Ϻ��� ���� �Ϸ�");
                           }System.out.println("���ϸ� ������ �ϼ��Ǿ����ϴ�.");
                           win = 0;
                           list = champDAO.fiterChamp(user_ID);
                        } else if (addmenu == 2) {
                           win = 0;
                        }
                     }
                     System.out.print("��� �Ͻðڽ��ϱ�? (Y/N) >> ");
                     String yn = sc.next();
                     if (yn.equals("N") || yn.equals("n")) {
                        game = false;
                     }
                  } // end of if (score <= 10)
               } // end of while (game)
               
            }else if(gamemenu == 2) {
               System.out.println("====================���� ���ϸ� ���====================");
               ArrayList<Champ_VO> poketList = champDAO.selectChamp(user_ID);
               for(Champ_VO vo : poketList) {
                  System.out.println("���ϸ� �̸� :" + vo.getPoketmon() + "\t" + "�ɷ�ġ : " + vo.getPoketPower());
               }

            }else if(gamemenu == 3) {
               System.out.print("[1]������ŷȮ�� [2]������ŷȮ�� [3]�ڷΰ��� >> ");
               rankmenu = sc.nextInt();
               ArrayList<Record_VO> rank = null;
               ArrayList<Record_VO> winlose = null;
               
               if (rankmenu == 1) {
                  rank = recordDAO.rankCheck();
                  for (int i=0; i<rank.size(); i++) {
                     System.out.println((i+1)+"��"+"\t"+rank.get(i).getUser_ID()+"\t"+rank.get(i).getScore());
                  }
               } else if (rankmenu == 2){
                  winlose = recordDAO.winloseCheck();
                  System.out.println("���" + "\t" + "�г���" + "\t" + "WIN" + "\t" + "LOSE");
                  for (int i=0; i<winlose.size(); i++) {
                     System.out.println((i+1)+"��"+"\t"+winlose.get(i).getUser_ID()+"\t"+winlose.get(i).getWinCnt()+"\t"+winlose.get(i).getLoseCnt());
                  }
               }
            }else if(gamemenu == 4) {
               System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
               start = false;
            }
            } // end of while (start)
         } // end of else if (menu == 2)
         else {
            System.out.println("������ �� ������~");
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