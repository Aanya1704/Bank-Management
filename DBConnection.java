package com.bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBconnector
 */
@WebServlet("/DBconnector")
public class DBConnection extends HttpServlet {
	static Connection con = null;
	static Connection get() {
	 try {
	 Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1112");
	return con;
	} catch (Exception e) {
	return null;
	}
	}
	}