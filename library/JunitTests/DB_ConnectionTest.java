package library.JunitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import library.management.system.conn;

class DB_ConnectionTest {

	@Test
	void testConn() {
		conn connection = new conn();
		assertNotNull(connection);
	}

}
