package library.DAO;

import java.sql.PreparedStatement;

import library.MODEL.Book;
import library.management.system.conn;

public class AddBookDAO {
	public static int addBook(Book book) {
		int i = 0;
		try {
			conn con = new conn();

			String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement st = con.c.prepareStatement(sql);
			// st.setInt(1, Integer.parseInt(textField.getText()));
			st.setInt(1, book.getBookId());
			st.setString(2, book.getBookName());
			st.setString(3, book.getBookIsbn());
			st.setString(4, book.getBookPublisher());
			st.setString(5, book.getBookEdition());
			st.setInt(6, book.getBookPrice());
			st.setInt(7, book.getBookPages());

			i = st.executeUpdate();

			st.close();

			con.c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
