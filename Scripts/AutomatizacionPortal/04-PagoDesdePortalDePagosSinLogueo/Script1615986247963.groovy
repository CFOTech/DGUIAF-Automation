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


WebUI.openBrowser(GlobalVariable.url_Portal_Sin_Logueo)

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ObjectsPortal/linkDireccionGeneralDefensa'))

WebUI.click(findTestObject('ObjectsPortal/linkEvaluacionSistema'))

WebUI.click(findTestObject('ObjectsPortal/btnContinuar'))

WebUI.click(findTestObject('ObjectsPortal/btnConfirmarContinuar'))

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/linkPagarElectronicamente'), 10)

WebUI.click(findTestObject('ObjectsPortal/linkPagarElectronicamente'))

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/radioTarjetaVisa'), 10)

WebUI.click(findTestObject('ObjectsPortal/radioTarjetaVisa'))

WebUI.click(findTestObject('ObjectsPortal/btnRealizarPago'))

WebUI.sendKeys(findTestObject('ObjectsPortal/inpPagoNumeroTarjeta'), '4507 9900 0000 4905')

WebUI.sendKeys(findTestObject('ObjectsPortal/inpPagoFechaVencimiento'), '02 / 24')

WebUI.sendKeys(findTestObject('ObjectsPortal/inpPagoNombre'), 'John Voltar')

WebUI.sendKeys(findTestObject('ObjectsPortal/inpPagoCodigoSeguridad'), '123')

WebUI.click(findTestObject('ObjectsPortal/btnPagoContinuar'))

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/labelTransaccionRealizada', 5))

WebUI.verifyElementText(findTestObject('ObjectsPortal/labelTransaccionRealizada'), 'La transacción ha sido APROBADA / Transaction APPROVED')

