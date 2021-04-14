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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_BackOffice)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_Acceder al Sistema/inputNombre'), GlobalVariable.user)

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_Acceder al Sistema/inputContraseña'), GlobalVariable.password)

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Acceder al Sistema/btnIngresar'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/menuReportes'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/optionConsultadeRecaudaciones'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/dropdownDependencia'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/li_30-Cementerio Chacarita'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/dropdownPosDesde'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/optionDesdeCementerioChacarita'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/dropdownPosHasta'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/optionHastaCementerioChacarita'))

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputFechaCbteDesde'), '1/12/2020')

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones Consolidadas/inputNroZCons'), '1936')

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/buttonBuscar'))

WebUI.scrollToElement(findTestObject('ObjectsBackOffice/00-Page_Consulta de Recaudaciones/td_footer'), 3)

WebUI.delay(3)

WebUI.closeBrowser()

