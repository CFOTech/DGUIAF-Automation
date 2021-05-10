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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import java.lang.Integer as Integer

WebUI.click(findTestObject('ObjectsBackOffice/00-MenuReportes/menuReportes'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/optionConsultaDeRecaudacionesPorConceptoConsolidado'))

//Obtengo fecha del dia de hoy. Esto devuelve la fecha y hora del dia actual.
def date = new Date()

//En la variable "fechaHOY" separo la fecha de la hora, ya que en "date" tenemos fecha y hora juntos. Y a esto le doy el formato dd/mm/yyyy.
String fechaHOY = date.format('dd/MM/yyyy')

//Separo
String[] arrayFecha = fechaHOY.split('\\/')

def mes = arrayFecha[1]

def mesDESDE = Integer.parseInt(mes)

String fechaDESDE = ((((arrayFecha[0]) + '/') + (mesDESDE - 1)) + '/') + (arrayFecha[2])

println(fechaDESDE)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/inpFechaDesde'), 
    fechaDESDE)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/inpFechaHasta'), 
    fechaHOY)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/inpFechaProcDesde'), 
    fechaDESDE)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/inpFechaProcHasta'), 
    fechaHOY)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/inpFechaCreaZDesde'), 
    fechaDESDE)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/inpFechaCreaZHasta'), 
    fechaHOY)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/inpCodigo'), 
    codigo)


if( (!Dependencia.toString().contains('Cualquiera') && Dependencia != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/ddDependencia'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/optionDependencia', [('Dependencia') : Dependencia]))

}

if( (!Pos.toString().contains('Cualquiera') && Pos != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/ddPos'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/optionPos', [('Pos') : Pos]))

}

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/ddOrdenamiento'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/optionOrdenamiento', 
        [('Ordenamiento') : Ordenamiento]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/btnBuscar'))

WebUI.waitForElementClickable(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/divFooter'), 
    3)

WebUI.scrollToElement(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto Consolidado/divFooter'), 
    4)

