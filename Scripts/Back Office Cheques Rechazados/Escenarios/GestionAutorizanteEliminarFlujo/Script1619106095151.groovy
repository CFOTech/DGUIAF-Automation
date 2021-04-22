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

WebUI.callTestCase(findTestCase('Back Office Cheques Rechazados/Genericos/IngresarOpcionGestionAutorizantes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesEliminar/input_Usuario_form-control custom-width-21 ng-valid ng-dirty ng-touched'), 
    'pcolloca')

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesEliminar/button_Buscar'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesEliminar/button_Buscar'))

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesEliminar/input_Usuario_form-control custom-width-21 ng-valid ng-dirty ng-touched'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesEliminar/a_Ver Usuarios_btn btn-danger btn-xs'))

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesEliminar/button_Si'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesEliminar/button_Si'))

WebUI.verifyElementNotPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazadosListar/td_pfox'), 
    5)

WebUI.navigateToUrl('http://10.73.100.59:1030/')

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

