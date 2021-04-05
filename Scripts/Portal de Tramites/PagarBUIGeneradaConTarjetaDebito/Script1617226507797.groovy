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
import java.lang.String as String
import groovy.util.XmlSlurper as XmlSlurper
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import groovy.json.JsonSlurper as JsonSlurper

//Creacion de variables
def IdGenerado

def IdGeneradoParsed

//Se guarda response en variable ResponseIdGenerado. Este response contiene el ID de la boleta que necesitamos
ResponseObject responseIdGenerado = WS.sendRequest(findTestObject('Smoke Test/BUI API - Generar'))

//Convierto a cadena de texto el response
IdGenerado = responseIdGenerado.getResponseText().toString()

//Se quitan las comillas al response, ya que necesito el resultado sin esas comillas
IdGeneradoParsed = IdGenerado.replace('"', '')

//Se guarda segundo response en variable JsonBoleta. Este Json contiene el numero de la boleta que se genera por el ID anterior.
ResponseObject JsonBoleta = WS.sendRequest(findTestObject('Smoke Test/BUI API - getBoletaMasPago', [('idBoleta') : IdGeneradoParsed]))

//Se convierte a cadena de texto el response
def JsonBoletaString = JsonBoleta.getResponseText().toString()

//Se crea un objeto de la clase "JsonSlurper" para manipular el Json
JsonSlurper slurper = new JsonSlurper()

//Creo un objecto en donde voy a guardar el Json convertido a texto. Con el objeto Result voy a poder acceder a todos los campos del JSON
Object result = slurper.parseText(JsonBoletaString)

//Se hace un print para verificar en tiempo de ejecucion que se obtenga el numero de forma correcta
println(result.Numero)

WebUI.openBrowser(GlobalVariable.url_Portal_Sin_Logueo)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ObjectsPortal/btnINICIO'))

WebUI.click(findTestObject('ObjectsPortal/btnPagarUnaBoleta(BUI)'))

WebUI.setText(findTestObject('ObjectsPortal/inpNroDeBoleta'), result.Numero)

WebUI.click(findTestObject('ObjectsPortal/btnBuscarBoleta'))

WebUI.click(findTestObject('ObjectsPortal/btnPagar'))

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/radioTarjetaVisaDebito'), 50)

WebUI.click(findTestObject('ObjectsPortal/radioTarjetaVisaDebito'))

WebUI.click(findTestObject('ObjectsPortal/btnRealizarPagoMakePayment'))

WebUI.setText(findTestObject('ObjectsPortal/inpPagoNumeroTarjeta'), GlobalVariable.portal_tarjeta_debito)

WebUI.setText(findTestObject('ObjectsPortal/inpPagoNombre'), GlobalVariable.portal_tarjeta_nombre)

WebUI.setText(findTestObject('ObjectsPortal/inpPagoFechaVencimiento'), GlobalVariable.portal_tarjeta_fecha_vencimiento)

WebUI.setText(findTestObject('ObjectsPortal/inpPagoCodigoSeguridad'), GlobalVariable.portal_tarjeta_codigo_seguridad)

WebUI.click(findTestObject('ObjectsPortal/btnPagoContinuarNext'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('ObjectsPortal/labelTransaccionRealizada'), 'La transacción ha sido APROBADA / Transaction APPROVED')

WebUI.closeBrowser()

