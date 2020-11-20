package library.JunitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import library.DAO.AddBookDAO;
import library.MODEL.Book;

class AddBookTest {

	@Test
	void testAddBook() {
		int expected = 1;
		int actual;
		
		Book book = new Book();
		book.setBookId(2010);
		//book.setBookName("Example book");
		book.setBookEdition("3");
		book.setBookIsbn("boook1234");
		book.setBookPages(299);
		//book.setBookPrice(4000);
	    book.setBookPublisher("Mich");
		
		actual = AddBookDAO.addBook(book);
		
		assertEquals(expected, actual, "Book ID should be unique");
		
	}

}
