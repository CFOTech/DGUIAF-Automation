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

WebUI.callTestCase(findTestCase('ABM Portal de Tramites/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ABM Portal de Tramites/Genericos/CompletarCamposGenerales'), [('tituloTramite') : 'test_titulo'
        , ('descTramite') : 'test_desc', ('mensaje') : 'test_msj', ('usuario') : 'test_user', ('pass') : 'test_pass', ('estadoTramite') : 'Activo'
        , ('redirecciona') : 'Si', ('rubroTramite') : 'AGIP', ('pagAsociada') : 'Guía General AGIP', ('forzarEmisionBUI') : 'No'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ABM Portal de Tramites/Genericos/AgregarConceptosDelTramite'), [('conceptoDelTramite') : '1.2.4 Testigos no obligatorios'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectsABMTramites/Page_EditarTramite/btnGuardarTramite'))

