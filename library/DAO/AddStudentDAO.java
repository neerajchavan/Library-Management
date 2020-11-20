package library.DAO;

import java.sql.PreparedStatement;

import library.MODEL.Student;
import library.management.system.conn;

public class AddStudentDAO {
	public static int addStudent(Student student) {
		int i = 0;
		try {
			conn con = new conn();

            String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = con.c.prepareStatement(sql);
			
			st.setInt(1, student.getsID());
			st.setString(2, student.getsName());
			st.setString(3, student.getsFather());
			st.setString(4, student.getsCourse());
			st.setString(5, student.getsBranch());
			st.setString(6, student.getsYear());
			st.setString(7, student.getsSemester());

			i = st.executeUpdate();

			st.close();
			con.c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
