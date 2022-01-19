package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class Champ_DAO {

   Connection conn = null;
   PreparedStatement pst = null;
   ResultSet rs = null ;

   public void connect() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
         String user = "campus_d_4_0115";
         String password = "smhrd4";

         conn = DriverManager.getConnection(url, user, password);
      } catch (Exception e) {
         e.printStackTrace();
      }
   } // end of connect

   public void close() {
      try {
         if(rs!=null) {
            rs.close();
         }
         if(pst!=null) {
            pst.close();
         }
         if(conn!=null) {
            conn.close();
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
   } // end of close

   public boolean insertChamp (int Num, String user_ID, String poketmon) {
      boolean check = false;
      Random rd = new Random();

      try {
         connect();
         String sql = "insert into USER_CHAMP values (?, ?, ?, ?)";

         pst = conn.prepareStatement(sql);
         pst.setInt(1, Num);
         pst.setString(2,user_ID);
         pst.setString(3, poketmon);
         pst.setInt(4, rd.nextInt(100)+1);

         int cnt = pst.executeUpdate();

         if(cnt>0) {
            check = true;
         }

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      return check;
   } // end of insert

   public ArrayList<Champ_VO> selectChamp () {
      ArrayList<Champ_VO> champ = new ArrayList<>();

      try {
         connect();
         String sql = "select * from USER_CHAMP";

         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery();

         while (rs.next()) {
            int Num = rs.getInt("NUM");
            String user_ID = rs.getString("ID");
            String poketmon = rs.getString("CHAMP");
            int poketPower = rs.getInt("POWER");

            champ.add(new Champ_VO(Num, user_ID, poketmon, poketPower));
         }

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return champ;
   }
   
   public ArrayList<Champ_VO> selectChamp (String user_ID) {
         ArrayList<Champ_VO> champ = new ArrayList<>();

         try {
            connect();
            String sql = "select * from USER_CHAMP where ID = ?";

            pst = conn.prepareStatement(sql);
            pst.setString(1,user_ID);
            rs = pst.executeQuery();

            while (rs.next()) {
               String poketmon = rs.getString("CHAMP");
               int poketPower = rs.getInt("POWER");
               champ.add(new Champ_VO(poketmon, poketPower));
            }
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            try {
               close();
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
         return champ;
      }

   public String Champ (int poketmonNum) {
      String[] poketList = {"ÇÇÄ«Ãò", "ÆÄÀÌ¸®", "ÀÌ»óÇØ¾¾", "²¿ºÎ±â", "Çª¸°", "³ª¿Ë", "¸¶ÀÚ¿ë", "°í¶óÆÄ´ö", "Åä°ÔÇÇ", "Ä¡ÄÚ¸®Å¸"};
      return poketList[poketmonNum];
   }

   public ArrayList<String> fiterChamp (String user_ID) {

      ArrayList<String> fiterList = new ArrayList<>();
      try {
         connect();
         String sql = "select CHAMP from USER_CHAMP where ID = ?";

         pst = conn.prepareStatement(sql);
         pst.setString(1, user_ID);

         rs = pst.executeQuery();

         while (rs.next()) {
            String poketmon = rs.getString("CHAMP");
            fiterList.add(poketmon);
         }

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return fiterList;
   }

   public int poketPower (String user_ID, String poketmon) {
      int power = 0;
      try {
         connect();
         String sql = "select POWER from USER_CHAMP where ID = ? and CHAMP = ?";

         pst = conn.prepareStatement(sql);
         pst.setString(1, user_ID);
         pst.setString(2, poketmon);

         rs = pst.executeQuery();
         if(rs.next()) {
         power = rs.getInt("POWER");
         }
      } catch(Exception e) {
         e.printStackTrace();
      } finally {
         try {
            close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return power;
   }

   public int poketPower (int user_Num, String poketmon) {
      int power = 0;
      try {
         connect();
         String sql = "select POWER from USER_CHAMP where NUM = ? and CHAMP = ?";

         pst = conn.prepareStatement(sql);
         pst.setInt(1, user_Num);
         pst.setString(2, poketmon);

         rs = pst.executeQuery();
         if (rs.next()) {
            power = rs.getInt("POWER");
         }
      } catch(Exception e) {
         e.printStackTrace();
      } finally {
         try {
            close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return power;
   }

   public String getPoket (int user_Num) {

      ArrayList<String> List = new ArrayList<>();
      Random rd = new Random();
      try {
         connect();
         String sql = "select CHAMP from USER_CHAMP where NUM = ? ";

         pst = conn.prepareStatement(sql);
         pst.setInt(1, user_Num);

         rs = pst.executeQuery();
         while (rs.next()) {
            String poketmon = rs.getString("CHAMP");
            List.add(poketmon);
         }

      } catch(Exception e) {
         e.printStackTrace();
      } finally {
         try {
            close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return List.get(rd.nextInt(List.size()));

   }
   public String getPoket (String user_ID) {

         ArrayList<String> List = new ArrayList<>();
         Random rd = new Random();
         try {
            connect();
            String sql = "select CHAMP from USER_CHAMP where ID = ? ";

            pst = conn.prepareStatement(sql);
            pst.setString(1, user_ID);

            rs = pst.executeQuery();
            while (rs.next()) {
               String poketmon = rs.getString("CHAMP");
               List.add(poketmon);
            }

         } catch(Exception e) {
            e.printStackTrace();
         } finally {
            try {
               close();
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
         return List.get(rd.nextInt(List.size()));

      }

} // end of class