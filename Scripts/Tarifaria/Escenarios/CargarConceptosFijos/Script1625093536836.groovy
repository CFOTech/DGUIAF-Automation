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

WebUI.callTestCase(findTestCase('Back Office/Genericos/CrearConcepto'), [('periodoTarifaria') : varPeriodoTarifario, ('normativaAprobatoria') : ''
        , ('nro') : '0', ('sigla') : '', ('anio') : '2021', ('fechaPublicacion') : '', ('cod1') : '', ('cod2') : '', ('cod3') : ''
        , ('estado') : '', ('descripcion') : '', ('renglon1') : '', ('renglon2') : '', ('renglon3') : '', ('renglon4') : ''
        , ('agenciaAsignada') : '', ('valor') : '', ('esRedondeable') : false, ('tienePrecioFijo') : false, ('cantVariable') : false
        , ('esDevolucion') : false, ('permiteIngresoManual') : true, ('timbres') : '', ('requiereTimbre') : false, ('diasDeAnulacion') : ''
        , ('esCompartido') : false, ('esRecibo') : false, ('esSerializado') : false, ('informaWS') : '', ('tipoDeStock') : ''
        , ('tipo') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/CrearConcepto'), [('periodoTarifaria') : '', ('normativaAprobatoria') : ''
        , ('nro') : '0', ('sigla') : '', ('anio') : '2021', ('fechaPublicacion') : '', ('cod1') : '', ('cod2') : '', ('cod3') : ''
        , ('estado') : '', ('descripcion') : '', ('renglon1') : '', ('renglon2') : '', ('renglon3') : '', ('renglon4') : ''
        , ('agenciaAsignada') : '', ('valor') : '', ('esRedondeable') : false, ('tienePrecioFijo') : false, ('cantVariable') : false
        , ('esDevolucion') : false, ('permiteIngresoManual') : true, ('timbres') : '', ('requiereTimbre') : false, ('diasDeAnulacion') : ''
        , ('esCompartido') : false, ('esRecibo') : false, ('esSerializado') : false, ('informaWS') : '', ('tipoDeStock') : ''
        , ('tipo') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/CrearConcepto'), [('periodoTarifaria') : '', ('normativaAprobatoria') : ''
        , ('nro') : '0', ('sigla') : '', ('anio') : '2021', ('fechaPublicacion') : '', ('cod1') : '', ('cod2') : '', ('cod3') : ''
        , ('estado') : '', ('descripcion') : '', ('renglon1') : '', ('renglon2') : '', ('renglon3') : '', ('renglon4') : ''
        , ('agenciaAsignada') : '', ('valor') : '', ('esRedondeable') : false, ('tienePrecioFijo') : false, ('cantVariable') : false
        , ('esDevolucion') : false, ('permiteIngresoManual') : true, ('timbres') : '', ('requiereTimbre') : false, ('diasDeAnulacion') : ''
        , ('esCompartido') : false, ('esRecibo') : false, ('esSerializado') : false, ('informaWS') : '', ('tipoDeStock') : ''
        , ('tipo') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

