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

WebUI.callTestCase(findTestCase('Back Office/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/menuReportes'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/optionConsultadeRecaudaciones'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/dropdownDependencia'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/liDependenciaParametrizada', [('dependencia') : dependencia]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/dropdownPosDesde'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/optionPosDesdeParametrizada', [('posDesde') : posDesde]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/dropdownPosHasta'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/optionPosHastaParametrizada', [('posHasta') : posHasta]))

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputFechaCbteDesde'), fechaCbteDesde)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputNroZCons'), nroZ)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/buttonBuscar'))

WebUI.scrollToElement(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/td_footer'), 3)

WebUI.closeBrowser()

