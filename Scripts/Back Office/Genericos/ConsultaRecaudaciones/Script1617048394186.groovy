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

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/optionConsultadeRecaudaciones'))

if( (!dependencia.toString().contains('Cualquiera') && dependencia != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/ddDependencia'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/liDependencia', [('dependencia') : dependencia]))
}

if( (!posDesde.toString().contains('Cualquiera') && posDesde != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/ddPosDesde'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/liPosDesde', [('posDesde') : posDesde]))
}

if( (!posHasta.toString().contains('Cualquiera') && posHasta != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/ddPosHasta'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/liPosHasta', [('posHasta') : posHasta]))
}

if( (!cajero.toString().contains('Ninguno') && cajero != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/ddCajero'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/liCajero', [('cajero') : cajero]))
}

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputFechaCbteDesde'), fechaCbteDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputFechaCbteHasta'), fechaCbteHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputFechaProcDesde'), fechaProcDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputFechaProcHasta'), fechaProcHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputFechaCreaZDesde'), fechaCreaZDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputFechaCreaZHasta'), fechaCreaZHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputNroZ'), nroZ)

if( (!medioPago.toString().contains('Ninguno') && medioPago != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/ddMedioPago'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/liMedioPago', [('medioPago') : medioPago]))
}

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputCodigo'), codigo)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/inputTramite'), tramite)

if( (!canalDeCobro.toString().contains('Ninguno') && canalDeCobro != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/ddCanaldeCobro'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/liCanalDeCobro', [('canalDeCobro') : canalDeCobro]))
}

if( (!ordenamiento.toString().contains('Ninguno') && ordenamiento != '')) {
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/ddOrdenamiento'))
	WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/liOrdenamiento', [('ordenamiento') : ordenamiento]))
}

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/buttonBuscar'))

WebUI.scrollToElement(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/td_footer'), 3)

