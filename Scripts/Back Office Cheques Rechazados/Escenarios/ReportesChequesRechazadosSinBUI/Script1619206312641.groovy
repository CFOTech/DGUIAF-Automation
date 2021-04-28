import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Back Office/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office Cheques Rechazados/Genericos/IngresarOpcionChequeRechazadosMenuCobranza'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/a_Reportes'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/a_Reportes'))

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/a_Reporte Cheques Rechazados sin BUI'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/a_Reporte Cheques Rechazados sin BUI'))

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/button_Generar Reporte'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/button_Generar Reporte'))

WebUI.verifyElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/label_ID Rendicin Detalle'), 
    5)

WebUI.verifyElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosReportes/div_Registros por pgina'), 
    5)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.73.100.59:1030/')

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

