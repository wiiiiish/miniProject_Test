package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class User_DAO {

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

	public boolean insertUser(String user_ID, String user_PW, String user_NAME) {
		boolean check = false;

		try {
			connect();
			String sql = "insert into USER_INFO values (NUM_seq.nextval, ?, ?, ?)";
			pst = conn.prepareStatement(sql);

			pst.setString(1, user_ID);
			pst.setString(2, user_PW);
			pst.setString(3, user_NAME);

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
	
	public ArrayList<User_VO> selectUser() {
		ArrayList<User_VO> al = new ArrayList<>();
		try {
			connect();
			String sql = "select * from USER_INFO";
			
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while (rs.next()) {
				String user_ID = rs.getString("ID");
				String user_PW = rs.getString("PW");
				String user_NAME = rs.getString("NAME");
				
				al.add(new User_VO(user_ID, user_PW, user_NAME));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			System.out.println("4번째 테스트");
		}
		return al;
		
	} // end of select

}
