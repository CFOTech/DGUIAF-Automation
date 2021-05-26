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

WebUI.callTestCase(findTestCase('Back Office/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/menuAdministracion'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/optionDependencia'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/btnNuevo'))

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/inpCodigo'), Codigo)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/inpNombre'), Nombre)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/inpDireccion'), Direccion)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/inpEmail'), Email)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/inpContacto'), Contacto)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/inpTelefono'), Telefono)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/inpIP'), Ip)

WebUI.waitForElementClickable(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/btnCrear'), 5)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nueva Dependencia/btnCrear'))

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

