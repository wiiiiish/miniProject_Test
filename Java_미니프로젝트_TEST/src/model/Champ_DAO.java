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

	public boolean insertChamp (String user_ID, int poketmonNum) {
		boolean check = false;
		Random rd = new Random();

		try {
			connect();
			String sql = "insert into USER_CHAMP values (?, ?, ?)";

			pst = conn.prepareStatement(sql);
			pst.setString(1,user_ID);
			pst.setString(2, Champ(poketmonNum));
			pst.setInt(3, rd.nextInt(100)+1);

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
				String user_ID = rs.getString("ID");
				String poketmon = rs.getString("CHAMP");
				int poketPower = rs.getInt("POWER");

				champ.add(new Champ_VO(user_ID, poketmon, poketPower));
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
		String[] poketList = {"피카츄", "파이리", "이상해씨", "꼬부기", "푸린", "나옹", "잠만보", "고라파덕", "모다피", "케이시"};
		return poketList[poketmonNum];
	}

} // end of class