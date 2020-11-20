package library.JunitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import library.DAO.SignUpDAO;
import library.MODEL.User;

class SignUpTest {

	@Test
	void signUpTest() {

	User signUp = new User();
	signUp.setUserName("asim123");
	signUp.setName("asim");
	signUp.setPassword("asim123");
	signUp.setSec_q("Your Lucky Number?");
	signUp.setSec_a("20");
	
	int expected = 1;
	int actual = SignUpDAO.signUp(signUp);
	
	assertEquals(expected,actual, "Username already taken!");
	
	}
}
