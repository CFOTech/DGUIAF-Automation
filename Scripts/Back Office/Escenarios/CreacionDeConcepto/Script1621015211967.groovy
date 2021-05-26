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

WebUI.callTestCase(findTestCase('Back Office/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/CrearConcepto'), [('periodoTarifaria') : periodoTarifaria, ('normativaAprobatoria') : normativaAprobatoria
        , ('nro') : nro, ('sigla') : sigla, ('anio') : anio, ('fechaPublicacion') : fechaPublicacion, ('cod1') : cod1, ('cod2') : cod2
        , ('cod3') : cod3, ('estado') : estado, ('descripcion') : descripcion, ('renglon1') : renglon1, ('renglon2') : renglon2
        , ('renglon3') : renglon3, ('renglon4') : renglon4, ('agenciaAsignada') : agenciaAsignada, ('valor') : valor, ('esRedondeable') : esRedondeable
        , ('tienePrecioFijo') : tienePrecioFijo, ('cantVariable') : cantVariable, ('esDevolucion') : esDevolucion, ('permiteIngresoManual') : permiteIngresoManual
        , ('timbres') : timbres, ('requiereTimbre') : requiereTimbre, ('diasDeAnulacion') : diasDeAnulacion, ('esCompartido') : esCompartido
        , ('esRecibo') : esRecibo, ('esSerializado') : esSerializado, ('informaWS') : informaWS, ('tipoDeStock') : tipoDeStock
        , ('tipo') : tipo], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

