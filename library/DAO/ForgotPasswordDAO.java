package library.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import library.MODEL.User;
import library.management.system.conn;

public class ForgotPasswordDAO {
	public static User getSecurityQuestion(String userName) {
		User user = new User();
		try {
			conn con = new conn();
            String sql = "select * from account where username=?";
            PreparedStatement st = con.c.prepareStatement(sql);

    		st.setString(1, userName);
    		ResultSet rs = st.executeQuery();

    		while (rs.next()) {
    					user.setUserName(rs.getString("username"));
                        user.setName(rs.getString("name"));
                        user.setSec_q(rs.getString("sec_q"));
    		}
		

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}
	
	//Retrieve Password
	public static String getForgottenPassword(User user) {
		String pass = null;
		System.out.println("SEC-A "+ user.getSec_a());
		System.out.println("UNAME "+ user.getUserName());
		try {
			conn con = new conn();
			String sql = "select * from account where sec_ans=? AND username=?";
			PreparedStatement st = con.c.prepareStatement(sql);

			st.setString(1, user.getSec_a());
			st.setString(2, user.getUserName());
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				pass = rs.getString("password");
			}
		

		} catch (Exception e) {
			e.printStackTrace();
		}
		return pass;

	}

}
