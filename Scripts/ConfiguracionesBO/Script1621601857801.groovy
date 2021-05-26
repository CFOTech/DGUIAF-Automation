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



WebUI.callTestCase(findTestCase('Back Office/Escenarios/CreacionDeAgencia'), [('NroAgencia') : '752', ('NombreAgencia') : 'Agencia752'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Escenarios/CreacionDeConcepto'), [('periodoTarifaria') : '', ('normativaAprobatoria') : ''
        , ('nro') : '0', ('sigla') : '', ('anio') : '2021', ('fechaPublicacion') : '', ('cod1') : '752', ('cod2') : '1', ('cod3') : '1'
        , ('estado') : '', ('descripcion') : 'Concepto Prueba', ('renglon1') : 'Test', ('renglon2') : '', ('renglon3') : '', ('renglon4') : ''
        , ('agenciaAsignada') : '', ('valor') : '400', ('esRedondeable') : false, ('tienePrecioFijo') : true, ('cantVariable') : false
        , ('esDevolucion') : false, ('permiteIngresoManual') : true, ('timbres') : '', ('requiereTimbre') : false, ('diasDeAnulacion') : ''
        , ('esCompartido') : false, ('esRecibo') : false, ('esSerializado') : false, ('informaWS') : '', ('tipoDeStock') : ''
        , ('tipo') : ''], FailureHandling.STOP_ON_FAILURE)


WebUI.callTestCase(findTestCase('Back Office/Genericos/CrearNuevaDependencia'), [('Codigo') : '876', ('Nombre') : 'DependenciaTest876'
        , ('Email') : 'testDependenciaTest@hotmail.com', ('Contacto') : 'default', ('Telefono') : '44445555', ('Ip') : '171.25.236.60'
        , ('Direccion') : 'Av. Chiclana 2200'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Escenarios/DependenciaAgregarAgencia'), [('nombreDependencia') : 'DependenciaTest876'
        , ('nombreAgencia') : 'Agencia752'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Escenarios/DependenciaAgregarConcepto'), [('nombreConcepto') : 'Concepto Prueba', ('nombreDependencia') : 'DependenciaTest876'], 
    FailureHandling.STOP_ON_FAILURE)

