package library.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import library.management.system.conn;

public class LoginDAO {
	public static int userLogin(String textField, String passwordField) {
		int i = 0;
		try {
			conn con = new conn();
			String sql = "select * from account where username=? and password=?";
			PreparedStatement st = con.c.prepareStatement(sql);

			st.setString(1, textField);
			st.setString(2, passwordField);

			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				i++;
			} 
				

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
