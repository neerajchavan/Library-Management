package library.JunitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import library.DAO.ForgotPasswordDAO;
import library.DAO.LoginDAO;
import library.MODEL.User;

class ForgotPasswordTest {

	@Test
	void securityQuestionTest() {
		User user = new User();
		
		//Security Question Check
		user.setUserName("neeraj");
		user = ForgotPasswordDAO.getSecurityQuestion(user.getUserName());
		String expectedQuestion = "Your Lucky Number?";
		String actualQuestion   = user.getSec_q();
		
		assertEquals(expectedQuestion,actualQuestion,"Security question does not match.");
		
		
		
		
		//Password Check
		user.setSec_a("20");
		
		String expectedPassword = "neeraj";
		String actualPassword   = ForgotPasswordDAO.getForgottenPassword(user);
		
		assertEquals(expectedPassword, actualPassword, "Method should return user correct password");
		
	}

}
