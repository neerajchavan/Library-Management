package library.JunitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import library.DAO.AddBookDAO;
import library.DAO.AddStudentDAO;
import library.MODEL.Book;
import library.MODEL.Student;

class AddStudentTest {

	@Test
	void testAddBook() {
		int expected = 1;
		int actual;
		
		Student student = new Student();
		
        student.setsID(2004);
        student.setsName("Abhay Pande");
        student.setsFather("");
        student.setsCourse("BE");
        student.setsBranch("IT");
        student.setsYear("Second");
        student.setsSemester("3rd");
		
        actual = AddStudentDAO.addStudent(student);

		
		assertEquals(expected, actual, "Same Student ID / Null values not allowed.");
		
	}

}
