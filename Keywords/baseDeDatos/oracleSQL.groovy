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

import internal.GlobalVariable

import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.Connection



public class oracleSQL {
	private static Connection connection = null;

	@Keyword
	def conectarDB(String host, String nombreServicio, String puerto, String usuario, String pass) {

		String conn = "jdbc:oracle:thin:@//" + host + ":" + puerto + "/" + nombreServicio
		connection = DriverManager.getConnection(conn, usuario, pass)
		return connection
	}

	@Keyword
	def ejecutarQuery(String queryString) {

		Statement stm = connection.createStatement()
		ResultSet rs = stm.executeQuery(queryString)
		return rs
	}

	@Keyword
	def cerrarConexionDB() {

		if(connection != null && !connection.isClosed()){
			connection.close()
		}
		connection = null
	}
}
