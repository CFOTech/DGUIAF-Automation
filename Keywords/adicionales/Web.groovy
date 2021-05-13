package adicionales
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class Web {

	/**
	 * Hace un 'check' o 'nocheck' sobre un TestObject en base a una variable bool
	 * @param objectoAChequear - test object de Katalon 
	 * @param variableBooleana - variable de tipo boolean
	 */
	@Keyword
	def checkOnoCheck(TestObject objectoAChequear, Boolean variableBooleana) {
		if(variableBooleana == true) {
			WebUI.check(objectoAChequear)
		}
		else {
			WebUI.uncheck(objectoAChequear)
		}
	}
	/**
	 * Selecciona un elemento dentro de un Test Object de tipo dropdown cuando el elemento 
	 * @param dropdown - test object de Katalon 
	 * @param opcion - objecto a seleccionar
	 */
	@Keyword
	def seleccionarOpcionDeDropdown(TestObject dropdown, Object opcion) {
		//Creacion de xpath del objeto opcion
		def opcionASeleccionar = opcion.toString()
		String xpathOpcion = "//li[(text() = '" + opcionASeleccionar + "' or . = '"+ opcionASeleccionar +"')]"
		//Se convierte el objeto en un Test Object y se agrega propiedad xpath al string armado anteriormente
		TestObject testObjectOpcion = new TestObject(xpathOpcion)
		testObjectOpcion.addProperty('xpath', ConditionType.EQUALS, xpathOpcion)
		//No clickea el dropdown si se cumplen ciertas condiciones (para optimizar tiempo de ejecucion)
		if( (!opcionASeleccionar.contains('Cualquiera') && !opcionASeleccionar.contains('Ninguno') && opcionASeleccionar != '')) {
			WebUI.click(dropdown)
			WebUI.click(testObjectOpcion)
		}
	}
}
