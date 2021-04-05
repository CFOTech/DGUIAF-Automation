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

//ingresa al portal portal con la direccion de un usuario ya logueado
//url que se muestra luego de pasar por el logueo por mail de google
WebUI.openBrowser(GlobalVariable.url_Portal_Sin_Logueo)

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

//selecciona el tramite para generar la boleta 'Direccion General de Defensa'
WebUI.click(findTestObject('ObjectsPortal/linkDireccionGeneralDefensa'))

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/linkEvaluacionSistema'), 5)

//selecciona la subopccion 'Evaluacion de sistema'
WebUI.click(findTestObject('ObjectsPortal/linkEvaluacionSistema'))

//presiona el boton continuar en la pantalla de conceptos a incluir
WebUI.click(findTestObject('ObjectsPortal/btnContinuar'))

//presiona el boton confirmar los datos y continuar
WebUI.click(findTestObject('ObjectsPortal/btnConfirmarContinuar'))

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/linkPagarElectronicamente'), 120)

//ingresa al link para pagar la boleta de forma online
WebUI.click(findTestObject('ObjectsPortal/linkPagarElectronicamente'))

//selecciona como va a pagar, con tarjeta de credito visa
WebUI.waitForElementPresent(findTestObject('ObjectsPortal/radioTarjetaVisa'), 120)

WebUI.click(findTestObject('ObjectsPortal/radioTarjetaVisa'))

//Presiona el boton Realizar pago
WebUI.click(findTestObject('ObjectsPortal/btnRealizarPago'))

//Carga los datos de la tarjeta
WebUI.waitForElementPresent(findTestObject('ObjectsPortal/inputPagoNumeroTarjeta'), 120)

//carga el numero de la tarjeta
WebUI.sendKeys(findTestObject('ObjectsPortal/inputPagoNumeroTarjeta'), GlobalVariable.portal_tarjeta_numero)

//carga la fecha de vencimiento
WebUI.sendKeys(findTestObject('ObjectsPortal/inputPagoNombre'), GlobalVariable.portal_tarjeta_nombre)

//carga el nombre del usuario
WebUI.sendKeys(findTestObject('ObjectsPortal/inputPagoFechaVencimiento'), GlobalVariable.portal_tarjeta_fecha_vencimiento)

//carga el codigo de seguridad
WebUI.sendKeys(findTestObject('ObjectsPortal/inputPagoCodigoSeguridad'), GlobalVariable.portal_tarjeta_codigo_seguridad)

//presiona el boton Continuar para realizar el pago
WebUI.click(findTestObject('ObjectsPortal/btnPagoContinuar'))

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/labelTransaccionRealizada'), 120)

//Valida que el contenido mostrado/obtenido es 'La transacción ha sido APROBADA / Transaction APPROVED'
WebUI.verifyElementText(findTestObject('ObjectsPortal/labelTransaccionRealizada'), 'La transacción ha sido APROBADA / Transaction APPROVED')

WebUI.closeBrowser()

