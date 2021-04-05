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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat

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

WebUI.scrollToElement(findTestObject('ObjectsPortal/divTerminosYCondiciones'), 0)

WebUI.verifyTextPresent('Pagada', false)

WebUI.delay(15)

WebUI.closeBrowser()

