package imprimir

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

public class imprimidor {
	FileWriter write;
	PrintWriter linea;

	public FileWriter getWrite() {
		return write;
	}

	public void setWrite(FileWriter write) {
		this.write = write;
	}

	public PrintWriter getLinea() {
		return linea;
	}

	public void setLinea(PrintWriter linea) {
		this.linea = linea;
	}

	public void createFile(String path) throws IOException {
		this.write= new FileWriter(path, false); //boolean append_to_file, agrega al final de archivo: si o no
		this.linea= new PrintWriter(write);
	}

	public void imprimirLabels(String[] labels) {
		for (int f=0; f<= labels.length-1; f++){
			System.out.println("Columna: " + f + " Nombre Label: "+ labels[f].toString());
		}
	}

	public void imprimirLinea(String val) {
		this.getLinea().printf("%s"+"%n", val);
	}

	public void imprimirCampoCabeza(String val) {
		this.imprimirLinea(val);
	}

	public void imprimirCampoDependencia(String val) {
		this.imprimirLinea("10 "+ val);
	}

	public void imprimirCampoMedioPago(String val) {
		this.imprimirLinea("11 "+ val);
	}

	public void imprimirCampoBoleta(String val) {
		this.imprimirLinea("12 "+ val);
	}
}
