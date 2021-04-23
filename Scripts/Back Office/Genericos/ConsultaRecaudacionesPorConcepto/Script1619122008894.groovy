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

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/optionConsultaRecaudacionesporConcepto'))

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/inputFechaCbteDesde'), fechaCbteDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/inputFechaCbteHasta'), fechaCbteHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/inputFechaProcDesde'), fechaProcDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/inputFechaProcHasta'), fechaProcHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/inputFechaCreaZDesde'), fechaCreaZDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/inputFechaCreaZHasta'), fechaCreaZHasta)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/inputCodigo'), codigo)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/dropdownDependencia'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/liDependencia', [('dependencia') : dependencia]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/dropdownPos'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/liPos', [('pos') : pos]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/dropdownOrdenamiento'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/liOrdenamiento', [('ordenamiento') : ordenamiento]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/btnBuscar'))

WebUI.scrollToElement(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones por Concepto/divFooter'), 3)

