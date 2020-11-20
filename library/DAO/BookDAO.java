package library.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;

import library.MODEL.Book;
import library.management.system.conn;
import net.proteanit.sql.DbUtils;

public class BookDAO {
	public static Book getBook(Book book) {
		
	try{
        conn con = new conn();
        String sql = "select * from book where book_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setInt(1, book.getBookId());
		ResultSet rs = st.executeQuery();
		
           
                    if(rs.next()) {
                	book.setBookName(rs.getString("name"));
            		book.setBookIsbn(rs.getString("isbn"));
            		book.setBookPublisher(rs.getString("publisher"));
            		book.setBookEdition(rs.getString("edition"));
            		book.setBookPrice(Integer.parseInt(rs.getString("price")));
            		book.setBookPages(Integer.parseInt(rs.getString("pages")));
		}
		st.close();
		rs.close();
		
        }
	catch(Exception e) {
		e.printStackTrace();
	}
	return book;

}
}
