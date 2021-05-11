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

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/a_Administracin'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/a_Agencias'))

WebUI.click(findTestObject('Object Repository/Page_Agencias/a_Nuevo'))

WebUI.setText(findTestObject('Page_Nueva Agencia/input_Enter value_Codigo'), NroAgencia)

WebUI.setText(findTestObject('Object Repository/Page_Nueva Agencia/input_Nombre_Nombre'), NombreAgencia)

WebUI.setText(findTestObject('Object Repository/Page_Nueva Agencia/input_Abrev_Abrev'), NombreAgencia)

WebUI.click(findTestObject('Object Repository/Page_Nueva Agencia/input_Usa WF de Tarifaria_UsaWFTarifaria'))

WebUI.click(findTestObject('Object Repository/Page_Nueva Agencia/a_Crear'))

WebUI.click(findTestObject('Object Repository/Page_Nueva Agencia/p_Grabado Exitoso'))

WebUI.click(findTestObject('Object Repository/Page_Nueva Agencia/span_SIR - BackOffice_ui-button-icon-primar_11d6ba'))

