package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Record_DAO {
   
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
   
   public ArrayList<Record_VO> rankCheck () {
      ArrayList<Record_VO> rank = new ArrayList<>();
      try {
         connect();
         String sql = "select * from RANKING";
         
         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery();
         while(rs.next()) {
            String user_ID = rs.getString("ID");
            int score = rs.getInt("RANK");
            rank.add(new Record_VO(user_ID, score));
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
      return rank;
   } // end of rankCheck
   
   public ArrayList<Record_VO> winloseCheck () {
      
      ArrayList<Record_VO> winlose = new ArrayList<>();

      try {
         connect();
         String sql = "select * from WIN_LOSE";
         
         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery();
         while(rs.next()) {
            String user_ID = rs.getString("ID");
            int winCnt = rs.getInt("WIN");
            int loseCnt = rs.getInt("LOSE");
            winlose.add(new Record_VO(user_ID, winCnt, loseCnt));
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
      return winlose;
   } // end of winloseCheck

   public boolean insertWinLose (String user_ID) {
      boolean check = false;
      try {
         connect();
         String sql = "insert into USER_RECORD values (?, ?, ?)";
         
         pst = conn.prepareStatement(sql);
         pst.setString(1, user_ID);
         pst.setInt(2, 0);
         pst.setInt(3, 0);
         
         int cnt = pst.executeUpdate();
         if (cnt > 0) {
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
   }
   public void updatetWin (String user_ID) {
      try {
         connect();
         String sql = "update USER_RECORD set WIN = WIN+1 where ID = ?";
         
         pst = conn.prepareStatement(sql);
         pst.setString(1, user_ID);
         pst.executeUpdate();
      
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   } // end of updatewin
   
   public void updateLose (String user_ID) {
      try {
         connect();
         String sql = "update USER_RECORD set LOSE = LOSE+1 where ID = ?";
         
         pst = conn.prepareStatement(sql);
         pst.setString(1, user_ID);
         pst.executeUpdate();
      
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}