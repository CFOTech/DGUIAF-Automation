import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Back Office/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office Cheques Rechazados/Genericos/IngresarOpcionChequeRechazadosMenuCobranza'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/a_Reportes'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/a_Reportes'))

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/a_Reporte Cheques Rechazados'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/a_Reporte Cheques Rechazados'))

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/input_Fecha Hasta_fhasta'), 
    5)

WebUI.setText(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/input_Fecha Desde_fdesde'), 
    '01042021')

WebUI.setText(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/input_Fecha Hasta_fhasta'), 
    '30042021')

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/button_Generar Reporte'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/button_Generar Reporte'))

WebUI.delay(5)

WebUI.navigateToUrl('http://10.73.100.59:1030/')

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

