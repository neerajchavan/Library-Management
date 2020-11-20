package library.DAO;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import library.MODEL.User;
import library.management.system.conn;

public class SignUpDAO {
	public static int signUp(User user) {
		int i = 0;
		try {
			conn con = new conn();
			String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?, ?, ?, ?, ?)";
			PreparedStatement st = con.c.prepareStatement(sql);

			st.setString(1, user.getUserName());
			st.setString(2, user.getName());
			st.setString(3, user.getPassword());
			st.setString(4, user.getSec_q());
			st.setString(5, user.getSec_a());

			i = st.executeUpdate();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return i;

	}
	
}
