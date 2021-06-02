package baseDeDatos

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import internal.GlobalVariable

public class oracleJDBCConnection {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet resultset = null;

	public void connect(String urlConnection, String user, String password) {
		/*Ej: urlConnection "jdbc:oracle:thin:@localhost:1521:crunchify", "username", "password"*/
		System.out.println("-------- Oracle JDBC Connectivity  ------");

		try {
			// Returns the Class object associated with the class
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException exception) {
			System.out.println("Oracle Driver Class Not found Exception: " + exception.toString());
			return;
		}

		// Set connection timeout. Make sure you set this correctly as per your need
		DriverManager.setLoginTimeout(5);
		System.out.println("Oracle JDBC Driver Successfully Registered! Let's make connection now");

		try {
			// Attempts to establish a connection
			// here DB name: localhost, sid: crunchify
			conn= DriverManager.getConnection(urlConnection, user, password);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
	}

	public ResultSet execute (String query) throws SQLException {
		//Ej: "SELECT * from CrunchifyEmployee where username = 'crunchify'"
		// Creates a Statement object for sending SQL statements to the database
		stmt = this.getConn().createStatement();

		// Executes the given SQL statement, which returns a single ResultSet object
		resultset = this.getStmt().executeQuery(query);

		if (resultset!= null) {
			System.out.println("Oracle JDBC connect and query test completed.");
			//System.out.println("Row data: " + resultset.getString(1));
			return resultset;
		}
		else {
			throw new SQLException("Can NOT retrieve row data details from table'");
		}
	}

	public void close() throws SQLException {
		this.getConn().close();
		//System.out.println("Oracle JDBC connect and query test completed.");
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public ResultSet getResultset() {
		return resultset;
	}

	public void setResultset(ResultSet resultset) {
		this.resultset = resultset;
	}
}
