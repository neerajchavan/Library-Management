package library.JunitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

import library.DAO.LoginDAO;
import library.DAO.SignUpDAO;
import library.MODEL.User;
import library.management.system.Login_user;
import library.management.system.conn;

class UserLoginTest {

	@Test
	void loginTest() {
	String userName = "neeraj";
	String password = "neer";
	
	int expected = 1;
	int actual = LoginDAO.userLogin(userName, password);
	
	assertEquals(expected,actual,"Invalid Username/Password");
	
	}
}
