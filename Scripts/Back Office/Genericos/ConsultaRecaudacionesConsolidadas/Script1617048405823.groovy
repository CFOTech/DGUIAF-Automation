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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/menuReportes'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/optionConsultadeRecaudacionesConsolidadas'))

if( (!dependencia.toString().contains('Cualquiera') && dependencia != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/ddDependencia'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/liDependencia', [('dependencia') : dependencia]))
}

if( (!pos.toString().contains('Cualquiera') && pos != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/ddPos'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/liPos', [('pos') : pos]))
}

if( (!cajero.toString().contains('Ninguno') && cajero != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/ddCajero'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/liCajero', [('cajero') : cajero]))
}

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputFechaCbteDesde'), fechaCbteDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputFechaCbteHasta'), fechaCbteHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputFechaProcDesde'), fechaProcDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputFechaProcHasta'), fechaProcHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputFechaCreaZDesde'), fechaCreaZDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputFechaCreaZHasta'), fechaCreaZHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputNroZ'), nroZ)

if( (!medioPago.toString().contains('Ninguno') && medioPago != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/ddMedioPago'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/liMedioPago', [('medioPago') : medioPago]))
}

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputCodigo'), codigo)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputTramite'), tramite)

if( (!ordenamiento.toString().contains('Ninguno') && ordenamiento != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/ddOrdenamiento'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/liOrdenamiento', [('ordenamiento') : ordenamiento]))
}

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/btnBuscarConsolidadas'))

WebUI.scrollToElement(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/td_footerConsolidadas'), 3)


