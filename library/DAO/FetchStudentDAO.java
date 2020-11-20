package library.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import library.MODEL.Book;
import library.MODEL.Student;
import library.management.system.conn;

public class FetchStudentDAO {
	public static Student getStudent(Student student) {

		try {
			conn con = new conn();
			String sql = "select * from student where student_id = ?";
			PreparedStatement st = con.c.prepareStatement(sql);
			st.setInt(1, student.getsID());
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				student.setsName(rs.getString("name"));
				student.setsFather(rs.getString("father"));
				student.setsCourse(rs.getString("course"));
				student.setsBranch(rs.getString("branch"));
				student.setsYear(rs.getString("year"));
				student.setsSemester(rs.getString("semester"));
			}
			st.close();
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;

	}
}
