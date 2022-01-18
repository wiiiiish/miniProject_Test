package view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.Champ_DAO;
import model.Champ_VO;
import model.User_DAO;
import model.User_VO;

public class Main {

   public static void main(String[] args) {

      User_DAO userDAO = new User_DAO();
      Scanner sc = new Scanner(System.in);
      Champ_DAO champDAO = new Champ_DAO();

      Random rd = new Random();
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

           
            int poketNum = 0;
            System.out.println("����� ���ϸ� 3������ �������ּ���.");
            System.out.println("[1]��ī�� [2]���̸� [3]�̻��ؾ� [4]���α� [5]Ǫ�� [6]���� [7]�Ḹ�� [8]����Ĵ� [9]����� [10]���̽�");
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
            int gamemenu =sc.nextInt();
            int score = 0;
            int out = 0;
            ArrayList<String> list = champDAO.fiterChamp(user_ID);
            if(gamemenu == 1) {
               System.out.println("������ �����մϴ�");
               String poketName = null;
               ArrayList<String> userPoket = null;
               ArrayList<String> fiterPoket = null;

               while(true) {
               int fiterNum = rd.nextInt(al.size())+1;
               
               
               // �����ϸ� �����ϱ� 
               System.out.println("������ų ���ϸ��� ����ּ���.");
               System.out.println("==========���� ���ϸ� ���==========");
               for (int i=0; i<list.size(); i++) {
                  System.out.print(list.get(i) + " ");
               }
               System.out.print("���ϸ� ���� : ");
               poketName = sc.next();
               
               int userPower = champDAO.poketPower(user_ID, poketName);
               
               String poket = champDAO.poket(fiterNum);
               int fiterPower = champDAO.poketPower(fiterNum, poket);
               
               
               if( userPower >= fiterPower) {
                  if((userPower - fiterPower) <= 50) {
                     System.out.println("��Ÿ!");
                     score += 1;
                  }else {
                     System.out.println("Ȩ��!");
                     score += 2;
                  }
               }else if(userPower < fiterPower) {
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
            }else if(gamemenu == 2) {
               
            }else if(gamemenu == 3) {
               
            }else if(gamemenu == 4) {
               System.out.println("����");
               break;
            }
         } // end of else if (menu == 2)
         //����.
      } // end of while
      
   }

}