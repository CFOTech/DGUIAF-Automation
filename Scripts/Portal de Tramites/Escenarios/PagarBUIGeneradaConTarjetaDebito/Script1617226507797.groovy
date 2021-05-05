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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat

//Creacion de variables
def IdGenerado

def IdGeneradoParsed

//Se guarda response en variable ResponseIdGenerado. Este response contiene el ID de la boleta que necesitamos
ResponseObject responseIdGenerado = WS.sendRequest(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGenerar'))

//Convierto a cadena de texto el response
IdGenerado = responseIdGenerado.getResponseText().toString()

//Se quitan las comillas al response, ya que necesito el resultado sin esas comillas
IdGeneradoParsed = IdGenerado.replace('"', '')

//Se guarda segundo response en variable JsonBoleta. Este Json contiene el numero de la boleta que se genera por el ID anterior.
ResponseObject JsonBoleta = WS.sendRequest(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGetBoletaMasPago', [('idBoleta') : IdGeneradoParsed]))

//Se convierte a cadena de texto el response
def JsonBoletaString = JsonBoleta.getResponseText().toString()

//Se crea un objeto de la clase "JsonSlurper" para manipular el Json
JsonSlurper slurper = new JsonSlurper()

//Creo un objecto en donde voy a guardar el Json convertido a texto. Con el objeto Result voy a poder acceder a todos los campos del JSON
Object result = slurper.parseText(JsonBoletaString)

//Se hace un print para verificar en tiempo de ejecucion que se obtenga el numero de forma correcta
println(result.Numero)

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/LoginAGIP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/PagarBUIConTarjetaDebito'), [('nroBoleta') : result.Numero],
	FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

//Consulto boleta abonada

WebUI.openBrowser(GlobalVariable.url_Portal_Sin_Logueo)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ObjectsPortal/btnINICIO'))

WebUI.click(findTestObject('ObjectsPortal/btnConsultarBoletasYComprobantes'))

WebUI.selectOptionByLabel(findTestObject('ObjectsPortal/lstDependencia'), 'Dirección General de Licencias', false)

WebUI.selectOptionByLabel(findTestObject('ObjectsPortal/lstEstadoBoleta'), 'Pagada', false)

//Obtengo fecha del dia de hoy. Esto devuelve la fecha y hora del dia actual.
def date = new Date()

//En la variable "fechaHOY" separo la fecha de la hora, ya que en "date" tenemos fecha y hora juntos. Y a esto le doy el formato dd/mm/yyyy.
String fechaHOY = date.format('dd/MM/yyyy')

println(fechaHOY)

WebUI.setText(findTestObject('ObjectsPortal/inpFechaDesde'), fechaHOY)

WebUI.setText(findTestObject('ObjectsPortal/inpFechaHasta'), fechaHOY)

WebUI.click(findTestObject('ObjectsPortal/btnBuscarBoletaCreada'))

WebUI.scrollToElement(findTestObject('ObjectsPortal/00-ObjectsTerminosYCondiciones/divTerminosYCondiciones'), 0)

WebUI.verifyTextPresent(result.Numero, false)

WebUI.delay(10)

WebUI.closeBrowser()
