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

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/menuReportes'))

WebUI.mouseOver(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/optionBancoCiudad'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/optionConsultadeRendicionesBC'))

WebUI.waitForElementClickable(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputNroLote'), 
    5)

WebUI.sendKeys(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputNroLote'), nroLote)

WebUI.sendKeys(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputCodBarras'), codBarras)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/dropdownMedioPago'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/liMedioPago', [('medioPago') : medioPago]))

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputNroCbte'), nroCbte)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputMarcaRechazo'), marcaRechazo)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputFechaProcDesde'), 
    fechaProcDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputFechaProcHasta'), 
    fechaProcHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputFechaAcreDesde'), 
    fechaAcreDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/inputFechaAcreHasta'), 
    fechaAcreHasta)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/btnBuscar'))

WebUI.scrollToElement(findTestObject('ObjectsBackOffice/00-Page_Consulta de Rendiciones del Banco Ciudad/divFooterConsulta'), 
    3)

