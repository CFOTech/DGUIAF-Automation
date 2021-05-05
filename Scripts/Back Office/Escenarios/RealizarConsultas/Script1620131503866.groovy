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

WebUI.callTestCase(findTestCase('Back Office/Genericos/ConsultaRecaudaciones'), [('dependencia') : '30-Cementerio Chacarita'
        , ('posDesde') : '011 - Cementerio Chacarita', ('posHasta') : '- Cualquiera -', ('fechaCbteDesde') : '1/12/2020'
        , ('fechaCbteHasta') : '', ('nroZ') : '1936'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/ReporteTomarCaptura'), [('nombre_consulta') : 'ConsultaRecaudaciones'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/ConsultaRecaudacionesConsolidadas'), [('dependencia') : '30-Cementerio Chacarita'
        , ('posDesde') : '011 - Cementerio Chacarita', ('fechaCbteDesde') : '1/12/2020', ('nroZ') : '1936'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/ReporteTomarCaptura'), [('nombre_consulta') : 'ConsultaRecaudacionesConsolidadas'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/ConsultaRecaudacionesPorConcepto'), [('fechaCbteDesde') : '1/2/2021'
        , ('fechaCbteHasta') : '22/4/2021', ('fechaProcDesde') : '', ('fechaProcHasta') : '', ('fechaCreaZDesde') : '', ('fechaCreaZHasta') : ''
        , ('codigo') : '', ('dependencia') : '- Cualquiera ', ('pos') : '- Cualquiera -', ('ordenamiento') : 'Código de concepto'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/ReporteTomarCaptura'), [('nombre_consulta') : 'ConsultaRecaudacionesPorConcepto'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/ConsultaRendicionesBC'), [('nroLote') : '', ('codBarras') : '', ('medioPago') : 'Efectivo'
        , ('nroCbte') : '', ('marcaRechazo') : '', ('fechaProcDesde') : '21/3/2021', ('fechaProcHasta') : '21/4/2021', ('fechaAcreDesde') : '21/3/2021'
        , ('fechaAcreHasta') : '21/4/2021'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/ReporteTomarCaptura'), [('nombre_consulta') : 'ConsultaRendicionesBC'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/InformeZ'), [('fecha') : '9/3/2021', ('pos') : '099 - Banco Ciudad'
        , ('cajero') : 'Ciudad, Banco (00000888)', ('nroz') : '2665'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/ReporteTomarCaptura'), [('nombre_consulta') : 'InformeZ'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Back Office/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

