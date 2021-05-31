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

WebUI.callTestCase(findTestCase('Back Office/Genericos/IngresarOpcionDependencias'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/DependenciaBuscarPorNombre'), [('dependenciaVar') : nombreDependencia], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('ObjectsBackOffice/00-Page_Dependencias/a_Asignar Agencias'), 2)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Dependencias/a_Asignar Agencias'))

WebUI.callTestCase(findTestCase('Back Office/Genericos/DependenciaBuscarAgencia'), [('agenciaVar') : nombreAgencia], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('null'), 2)

WebUI.click(findTestObject('null'))

WebUI.callTestCase(findTestCase('Back Office/Genericos/ScrollFinalDePagina'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ObjectsBackOffice/00-Page_AsignacionDependenciaAgencia/td_descripcionNombre'), nombreAgencia)

WebUI.waitForElementPresent(findTestObject('ObjectsBackOffice/00-Page_AsignacionDependenciaAgencia/a_Guardar'), 2)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_AsignacionDependenciaAgencia/a_Guardar'))

WebUI.verifyElementText(findTestObject('ObjectsBackOffice/00-Page_AsignacionDependenciaAgencia/p_Grabado Exitoso'), 'Grabado Exitoso.')

WebUI.waitForElementPresent(findTestObject('ObjectsBackOffice/00-Page_AsignacionDependenciaConcepto/span_cerrarModal'), 
    2)

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_AsignacionDependenciaConcepto/span_cerrarModal'))

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

