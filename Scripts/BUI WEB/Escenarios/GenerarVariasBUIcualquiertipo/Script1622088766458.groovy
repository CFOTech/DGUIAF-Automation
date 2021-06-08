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

WebUI.callTestCase(findTestCase('BUI WEB/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

n = 1

//Aqui se ingresa la cantidad de BUI necesarias.
for (def CantidaddeBUI = 1; CantidaddeBUI <= 10; CantidaddeBUI++) {
    WebUI.waitForPageLoad(5)

    WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioDatosEntidad'), [('Dependencia') : findTestData(
                'GenerarVariabasBUIsinEspecificaciones').getValue(2, n)], FailureHandling.STOP_ON_FAILURE)

    //se completan datos personales.
    WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioDatosContribuyente'), [('dni') : '12345678'
            , ('apellidoYNombre') : 'juan carlos', ('correoElectronico') : 'jcarlos@test.com', ('direccion') : '123', ('piso') : '1'
            , ('departamento') : '2', ('localidad') : 'caba', ('codigoPostal') : '1234'], FailureHandling.STOP_ON_FAILURE)

    //se inicia un for para agregar 1 a n conceptos. (hasta 10) 
    for (def row = 1; row <= 1/* CantidaddeBUI  findTestData('GenerarVariabasBUIsinEspecificaciones').getRowNumbers()*/; row++) {
        int cantConceptos = findTestData('GenerarVariabasBUIsinEspecificaciones').getRowNumbers()
        int rndConcepto = (((Math.random() * cantConceptos) + 1) as int)

        def rndMonto = (((Math.random() * 4000) + 1) as int)

        def valorRegla = findTestData('GenerarVariabasBUIsinEspecificaciones').getValue(3, n)

        def montoVariable = findTestData('GenerarVariabasBUIsinEspecificaciones').getValue(4, n)

        WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/span_Concepto'))

        WebUI.verifyElementVisible(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Codigo_txtCodigo'), FailureHandling.STOP_ON_FAILURE)

        WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Codigo_txtCodigo'), findTestData('GenerarVariabasBUIsinEspecificaciones').getValue(1, n))

        WebUI.verifyElementVisible(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/ddConceptoSeleccionado'), FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/ddConceptoSeleccionado'))

        if (valorRegla != '0') {
            WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/td_valor_regla'))

            WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Metros_Valor'), valorRegla)

            WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Metros_Valor'), Keys.chord(Keys.ENTER))
        }
        
        if (montoVariable != '0') {
            WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica (2)/input_Valor_txtValor'), montoVariable)
        }
        
        WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/button_Agregar'))

        n++
    }
    
    WebUI.callTestCase(findTestCase('BUI WEB/Genericos/GenerarBoleta'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('BUI WEB/Genericos/GuardarNroBoleta'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/Page_Boleta Unica/btnPDFAceptar'))
}

WebUI.closeBrowser()

