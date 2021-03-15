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

WebUI.navigateToUrl('http://10.73.2.97:7000/Home/Acceder?ReturnUrl=%2fHome%2fAcceder%2f')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Acceder al Sistema/inputNombre'), 'jcarlos')

WebUI.setEncryptedText(findTestObject('Page_Acceder al Sistema/inputContraseña'), 'x8YlipdcAoX+EPciFFGm8A==')

WebUI.click(findTestObject('Page_Acceder al Sistema/btnIngresar'))

WebUI.click(findTestObject('Page_Home Page/menuReportes'))

WebUI.click(findTestObject('Page_Home Page/optionConsultadeRecaudacionesConsolidadas'))

WebUI.click(findTestObject('Page_Consulta de Recaudaciones/dropdownDependencia'))

WebUI.click(findTestObject('Page_Consulta de Recaudaciones/option30CementerioChacarita'))

WebUI.click(findTestObject('Page_Consulta de Recaudaciones Consolidadas/dropdownPos'))

WebUI.click(findTestObject('Page_Consulta de Recaudaciones Consolidadas/li_011 - Cementerio Chacarita consolidada'))

WebUI.setText(findTestObject('Page_Consulta de Recaudaciones Consolidadas/inputFechaCbteDesde'), '1/12/2020')

WebUI.setText(findTestObject('Page_Consulta de Recaudaciones/inputNroZ'), '1936')

WebUI.click(findTestObject('Page_Consulta de Recaudaciones/buttonBuscar'))

WebUI.scrollToElement(findTestObject('Page_Consulta de Recaudaciones Consolidadas/td_footerCons'), 3)

WebUI.delay(3)

WebUI.closeBrowser()

