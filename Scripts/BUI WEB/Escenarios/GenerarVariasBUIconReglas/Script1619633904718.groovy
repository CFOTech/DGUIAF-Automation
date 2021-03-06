import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('BUI WEB/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

def n = 1

for (def CantidaddeBUI = 6; CantidaddeBUI <= 10; CantidaddeBUI++) {
    WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioDatosEntidad'), [('Dependencia') : findTestData(
                'ConceptosDependenciaPrueba').getValue(2, 1)], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioDatosContribuyente'), [('dni') : '12345678'
            , ('apellidoYNombre') : 'juan carlos', ('correoElectronico') : 'jcarlos@test.com', ('direccion') : '123', ('piso') : '1'
            , ('departamento') : '2', ('localidad') : 'caba', ('codigoPostal') : '1234'], FailureHandling.STOP_ON_FAILURE)

    for (def row = 1; row <= CantidaddeBUI /* findTestData('Datos de BUI').getRowNumbers()*/ ; row++) {
        int rndConcepto = (((Math.random() * 5) + 1) as int)

        def rndMonto = (((Math.random() * 4000) + 1) as int)

        //       print(rndMonto)
        WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioConceptosconRegla'), [('valorRegla') : findTestData(
                    'ConceptosDependenciaPrueba').getValue(3,rndConcepto ) /*findTestData(
                    'ConceptosDependenciaPrueba').getValue(3, n)*/ , ('Concepto') : findTestData('ConceptosDependenciaPrueba').getValue(
                    1, rndConcepto)], FailureHandling.STOP_ON_FAILURE)

        n++
    }
    
    WebUI.callTestCase(findTestCase('BUI WEB/Genericos/GenerarBoleta'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('BUI WEB/Genericos/GuardarNroBoleta'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/btnPDFAceptar'))
}

