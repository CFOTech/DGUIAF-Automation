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

WebUI.callTestCase(findTestCase('Back Office Cheques Rechazados/Genericos/IngresarOpcionGestionChequeRechazados'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/button_Nueva Solicitud ()'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/button_Nueva Solicitud ()'))

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Solicitante Apellido_lastName'), 
    'Automation')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Solicitante Nombre_firstName'), 
    'Juan Carlos')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Nro. de Cheque_checkNumber'), 
    '101112')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Cdigo Banco Emisor_codBank'), 
    '334')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Importe Cheque_eeNumber'), 
    '3000,00')

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Fecha Emisin_dateEmi'), 
    5)

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Fecha Emisin_dateEmi'), 
    '01/03/2021')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Nombre Banco Emisor_nameBank'), 
    'Galicia')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Fh recepcin cheque_dateRep'), 
    '01/03/2021')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Lugar Emisin_placeEmi'), 
    'Adrogue')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Nro. CCOO_CCOONumber'), 
    '1122')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_LibradorEndosante_endosante'), 
    'Gimenez')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Nro. BUI_buiNumber'), 
    '2018-00042913')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Cuit LibradorEndosante_cuitEndosante'), 
    '20104445552')

WebUI.sendKeys(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/input_Cuenta Nro._accountNumber'), 
    '123456')

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/button_Guardar Preliminar'))

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/label_Se ha grabado el cheque rechazado exitosamente'), 
    5)

WebUI.verifyElementText(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/label_Se ha grabado el cheque rechazado exitosamente'), 
    'Se ha grabado el cheque rechazado exitosamente.')

WebUI.waitForElementPresent(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/button_Aceptar'), 
    5)

WebUI.click(findTestObject('ObjectsBackoOfficeChequesRechazados/ChequesRechazadosSolicitud/button_Aceptar'))

WebUI.navigateToUrl('http://10.73.100.59:1030/')

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

