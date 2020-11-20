package library.DAO;

import java.sql.PreparedStatement;
import library.MODEL.Book;
import library.MODEL.Student;
import library.management.system.conn;

public class IssueBookDAO {
	public static int insertIssuedBook(Book book, Student student, String issueDate) {
		int i=0;
		
		try {
			conn con = new conn();
			String sql = "insert into issueBook(book_id, student_id, bname, sname, course, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = con.c.prepareStatement(sql);
			
			st.setInt(1, book.getBookId());
			st.setInt(2, student.getsID());
			st.setString(3, book.getBookName());
			st.setString(4, student.getsName());
			st.setString(5, student.getsCourse());
			st.setString(6, student.getsBranch());
			st.setString(7, issueDate);
			
			i = st.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
