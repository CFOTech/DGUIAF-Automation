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

WebUI.waitForElementClickable(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/button_Nuevo flujo'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/button_Nuevo flujo'))

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/span_Seleccione dependencias_dropdown-down'))

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/input_Seleccione dependencias_ng-valid ng-dirty ng-touched'), 
    'La Nueva Seguros')

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/div_Devoluciones'))

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/span_Seleccione usuarios_dropdown-down1'))

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/input_Seleccionar Todos_ng-untouched ng-valid ng-dirty1'), 
    'Colloca Patricia')

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/div_Fox Patricia'))

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/span_Seleccione usuarios_dropdown-down2'))

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/input_Seleccionar Todos_ng-untouched ng-valid ng-dirty2'), 
    'GIl Elizabeth')

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/div_Gil Elizabeth'))

WebUI.waitForElementClickable(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/button_Guardar'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/button_Guardar'))

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/label_Se ha grabado el flujo exitosamente'), 
    5)

WebUI.verifyElementText(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/label_Se ha grabado el flujo exitosamente'), 
    'Se ha grabado el flujo exitosamente.')

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/button_Aceptar'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/FlujoGestionChequesRechazados/button_Aceptar'))

WebUI.navigateToUrl('http://10.73.100.59:1030/')

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

