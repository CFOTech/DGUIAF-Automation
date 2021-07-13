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

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/AccederMenuABMTramites'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/EsperarCarga'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/EditarTramite'), [('descripcion') : findTestData('Tarifaria/TDTarifariaABMTramites').getValue(
            colDescripcion, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/EsperarCarga'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tarifaria/Genericos/CompararTramitesABM'), [('monto') : findTestData('Tarifaria/TDTarifariaABMTramites').getValue(
            colMonto, 1), ('codigo') : findTestData('Tarifaria/TDTarifariaABMTramites').getValue(colCodigo, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

