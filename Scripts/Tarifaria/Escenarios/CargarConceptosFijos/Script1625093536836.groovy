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

WebUI.callTestCase(findTestCase('Back Office/Genericos/CrearConcepto'), [('periodoTarifaria') : findTestData('Tarifaria/varTarifaria').getValue(
            'periodoTarifaria', varFila1), ('normativaAprobatoria') : findTestData('Tarifaria/varTarifaria').getValue('normativaAprobatoria', 
            varFila1), ('nro') : findTestData('Tarifaria/varTarifaria').getValue('nro', varFila1), ('sigla') : findTestData(
            'Tarifaria/varTarifaria').getValue('sigla', varFila1), ('anio') : findTestData('Tarifaria/varTarifaria').getValue(
            'anio', varFila1), ('fechaPublicacion') : findTestData('Tarifaria/varTarifaria').getValue('fechaPublicacion', 
            varFila1), ('cod1') : findTestData('Tarifaria/varTarifaria').getValue('cod1', varFila1), ('cod2') : findTestData(
            'Tarifaria/varTarifaria').getValue('cod2', varFila1), ('cod3') : findTestData('Tarifaria/varTarifaria').getValue(
            'cod3', varFila1), ('estado') : findTestData('Tarifaria/varTarifaria').getValue('estado', varFila1), ('descripcion') : findTestData(
            'Tarifaria/varTarifaria').getValue('descripcion', varFila1), ('renglon1') : findTestData('Tarifaria/varTarifaria').getValue(
            'renglon1', varFila1), ('renglon2') : findTestData('Tarifaria/varTarifaria').getValue('renglon2', varFila1), ('renglon3') : findTestData(
            'Tarifaria/varTarifaria').getValue('renglon3', varFila1), ('renglon4') : findTestData('Tarifaria/varTarifaria').getValue(
            'renglon4', varFila1), ('agenciaAsignada') : findTestData('Tarifaria/varTarifaria').getValue('agenciaAsignada', 
            varFila1), ('valor') : findTestData('Tarifaria/varTarifaria').getValue('valor', varFila1), ('esRedondeable') : findTestData(
            'Tarifaria/varTarifaria').getValue('esRedondeable', varFila1).toBoolean(), ('tienePrecioFijo') : findTestData(
            'Tarifaria/varTarifaria').getValue('tienePrecioFijo', varFila1).toBoolean(), ('cantVariable') : findTestData(
            'Tarifaria/varTarifaria').getValue('cantVariable', varFila1).toBoolean(), ('esDevolucion') : findTestData('Tarifaria/varTarifaria').getValue(
            'esDevolucion', varFila1).toBoolean(), ('permiteIngresoManual') : findTestData('Tarifaria/varTarifaria').getValue(
            'permiteIngresoManual', varFila1).toBoolean(), ('timbres') : findTestData('Tarifaria/varTarifaria').getValue(
            'timbres', varFila1), ('requiereTimbre') : findTestData('Tarifaria/varTarifaria').getValue('requiereTimbre', 
            varFila1).toBoolean(), ('diasDeAnulacion') : findTestData('Tarifaria/varTarifaria').getValue('diasDeAnulacion', 
            varFila1), ('esCompartido') : findTestData('Tarifaria/varTarifaria').getValue('esCompartido', varFila1).toBoolean()
        , ('esRecibido') : findTestData('Tarifaria/varTarifaria').getValue('esRecibido', varFila1).toBoolean(), ('esSerializado') : findTestData(
            'Tarifaria/varTarifaria').getValue('esSerializado', varFila1).toBoolean(), ('informaWS') : findTestData('Tarifaria/varTarifaria').getValue(
            'informaWS', varFila1), ('tipoDeStock') : findTestData('Tarifaria/varTarifaria').getValue('tipoDeStock', varFila1)
        , ('tipo') : findTestData('Tarifaria/varTarifaria').getValue('tipo', varFila1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/CrearConcepto'), [('periodoTarifaria') : findTestData('Tarifaria/varTarifaria').getValue(
            'periodoTarifaria', varFila2), ('normativaAprobatoria') : findTestData('Tarifaria/varTarifaria').getValue('normativaAprobatoria', 
            varFila2), ('nro') : findTestData('Tarifaria/varTarifaria').getValue('nro', varFila2), ('sigla') : findTestData(
            'Tarifaria/varTarifaria').getValue('sigla', varFila2), ('anio') : findTestData('Tarifaria/varTarifaria').getValue(
            'anio', varFila2), ('fechaPublicacion') : findTestData('Tarifaria/varTarifaria').getValue('fechaPublicacion', 
            varFila2), ('cod1') : findTestData('Tarifaria/varTarifaria').getValue('cod1', varFila2), ('cod2') : findTestData(
            'Tarifaria/varTarifaria').getValue('cod2', varFila2), ('cod3') : findTestData('Tarifaria/varTarifaria').getValue(
            'cod3', varFila2), ('estado') : findTestData('Tarifaria/varTarifaria').getValue('estado', varFila2), ('descripcion') : findTestData(
            'Tarifaria/varTarifaria').getValue('descripcion', varFila2), ('renglon1') : findTestData('Tarifaria/varTarifaria').getValue(
            'renglon1', varFila2), ('renglon2') : findTestData('Tarifaria/varTarifaria').getValue('renglon2', varFila2), ('renglon3') : findTestData(
            'Tarifaria/varTarifaria').getValue('renglon3', varFila2), ('renglon4') : findTestData('Tarifaria/varTarifaria').getValue(
            'renglon4', varFila2), ('agenciaAsignada') : findTestData('Tarifaria/varTarifaria').getValue('agenciaAsignada', 
            varFila2), ('valor') : findTestData('Tarifaria/varTarifaria').getValue('valor', varFila2), ('esRedondeable') : findTestData(
            'Tarifaria/varTarifaria').getValue('esRedondeable', varFila2).toBoolean(), ('tienePrecioFijo') : findTestData(
            'Tarifaria/varTarifaria').getValue('tienePrecioFijo', varFila2).toBoolean(), ('cantVariable') : findTestData(
            'Tarifaria/varTarifaria').getValue('cantVariable', varFila2).toBoolean(), ('esDevolucion') : findTestData('Tarifaria/varTarifaria').getValue(
            'esDevolucion', varFila2).toBoolean(), ('permiteIngresoManual') : findTestData('Tarifaria/varTarifaria').getValue(
            'permiteIngresoManual', varFila2).toBoolean(), ('timbres') : findTestData('Tarifaria/varTarifaria').getValue(
            'timbres', varFila2), ('requiereTimbre') : findTestData('Tarifaria/varTarifaria').getValue('requiereTimbre', 
            varFila2).toBoolean(), ('diasDeAnulacion') : findTestData('Tarifaria/varTarifaria').getValue('diasDeAnulacion', 
            varFila2), ('esCompartido') : findTestData('Tarifaria/varTarifaria').getValue('esCompartido', varFila2).toBoolean()
        , ('esRecibido') : findTestData('Tarifaria/varTarifaria').getValue('esRecibido', varFila2).toBoolean(), ('esSerializado') : findTestData(
            'Tarifaria/varTarifaria').getValue('esSerializado', varFila2).toBoolean(), ('informaWS') : findTestData('Tarifaria/varTarifaria').getValue(
            'informaWS', varFila2), ('tipoDeStock') : findTestData('Tarifaria/varTarifaria').getValue('tipoDeStock', varFila2)
        , ('tipo') : findTestData('Tarifaria/varTarifaria').getValue('tipo', varFila2)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/CrearConcepto'), [('periodoTarifaria') : findTestData('Tarifaria/varTarifaria').getValue(
            'periodoTarifaria', varFila3), ('normativaAprobatoria') : findTestData('Tarifaria/varTarifaria').getValue('normativaAprobatoria', 
            varFila3), ('nro') : findTestData('Tarifaria/varTarifaria').getValue('nro', varFila3), ('sigla') : findTestData(
            'Tarifaria/varTarifaria').getValue('sigla', varFila3), ('anio') : findTestData('Tarifaria/varTarifaria').getValue(
            'anio', varFila3), ('fechaPublicacion') : findTestData('Tarifaria/varTarifaria').getValue('fechaPublicacion', 
            varFila3), ('cod1') : findTestData('Tarifaria/varTarifaria').getValue('cod1', varFila3), ('cod2') : findTestData(
            'Tarifaria/varTarifaria').getValue('cod2', varFila3), ('cod3') : findTestData('Tarifaria/varTarifaria').getValue(
            'cod3', varFila3), ('estado') : findTestData('Tarifaria/varTarifaria').getValue('estado', varFila3), ('descripcion') : findTestData(
            'Tarifaria/varTarifaria').getValue('descripcion', varFila3), ('renglon1') : findTestData('Tarifaria/varTarifaria').getValue(
            'renglon1', varFila3), ('renglon2') : findTestData('Tarifaria/varTarifaria').getValue('renglon2', varFila3), ('renglon3') : findTestData(
            'Tarifaria/varTarifaria').getValue('renglon3', varFila3), ('renglon4') : findTestData('Tarifaria/varTarifaria').getValue(
            'renglon4', varFila3), ('agenciaAsignada') : findTestData('Tarifaria/varTarifaria').getValue('agenciaAsignada', 
            varFila3), ('valor') : findTestData('Tarifaria/varTarifaria').getValue('valor', varFila3), ('esRedondeable') : findTestData(
            'Tarifaria/varTarifaria').getValue('esRedondeable', varFila3).toBoolean(), ('tienePrecioFijo') : findTestData(
            'Tarifaria/varTarifaria').getValue('tienePrecioFijo', varFila3).toBoolean(), ('cantVariable') : findTestData(
            'Tarifaria/varTarifaria').getValue('cantVariable', varFila3).toBoolean(), ('esDevolucion') : findTestData('Tarifaria/varTarifaria').getValue(
            'esDevolucion', varFila3).toBoolean(), ('permiteIngresoManual') : findTestData('Tarifaria/varTarifaria').getValue(
            'permiteIngresoManual', varFila3).toBoolean(), ('timbres') : findTestData('Tarifaria/varTarifaria').getValue(
            'timbres', varFila3), ('requiereTimbre') : findTestData('Tarifaria/varTarifaria').getValue('requiereTimbre', 
            varFila3).toBoolean(), ('diasDeAnulacion') : findTestData('Tarifaria/varTarifaria').getValue('diasDeAnulacion', 
            varFila3), ('esCompartido') : findTestData('Tarifaria/varTarifaria').getValue('esCompartido', varFila3).toBoolean()
        , ('esRecibido') : findTestData('Tarifaria/varTarifaria').getValue('esRecibido', varFila3).toBoolean(), ('esSerializado') : findTestData(
            'Tarifaria/varTarifaria').getValue('esSerializado', varFila3).toBoolean(), ('informaWS') : findTestData('Tarifaria/varTarifaria').getValue(
            'informaWS', varFila3), ('tipoDeStock') : findTestData('Tarifaria/varTarifaria').getValue('tipoDeStock', varFila3)
        , ('tipo') : findTestData('Tarifaria/varTarifaria').getValue('tipo', varFila3)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

