package com.bc.regiDemo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class JDBCTest {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		
		try(Connection con = 
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE",
						"ksy",
						"ksy")) {
			System.out.println(con);
			System.out.println("Succeed");
		} catch (Exception e) {
			//fail(e.getMessage());
			System.out.println("failed");
		}
	}
}