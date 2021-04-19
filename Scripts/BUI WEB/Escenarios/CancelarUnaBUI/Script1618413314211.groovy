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

//se loguea mediante el generico Login
WebUI.callTestCase(findTestCase('BUI WEB/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

//ingresa los datos para crear una boleta con el generico Boleta-Completar formulario-Datos de la entidad
WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioDatosEntidad'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioDatosContribuyente'), [('dni') : '12345678'
        , ('apellidoYNombre') : 'juan carlos', ('correoElectronico') : 'jcarlos@test.com', ('direccion') : '123', ('piso') : '1'
        , ('departamento') : '2', ('localidad') : 'caba', ('codigoPostal') : '1234'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioConceptos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BUI WEB/Genericos/GenerarBoleta'), [:], FailureHandling.STOP_ON_FAILURE)

//toma el string que contiene el legajo generado 
def text_legajo_electronico = WebUI.getText(findTestObject('ObjectsBUIWEB/textElementLegajo'))

println(text_legajo_electronico)

//toma el numero de legajo contenido en el string
def legajo_electronico = text_legajo_electronico.substring(12, 25)

println(legajo_electronico)

//cierra el pdf desplegado
WebUI.callTestCase(findTestCase('BUI WEB/Genericos/PDFAceptarCerrar'), [:], FailureHandling.STOP_ON_FAILURE)

//ingresa a la opcion Otras Gestiones del menu Ingresar Boleta
WebUI.callTestCase(findTestCase('BUI WEB/Genericos/MenuIngresarBoletaOtrasGestiones'), [:], FailureHandling.STOP_ON_FAILURE)

//realiza la busqueda por numero de legajo 
WebUI.setText(findTestObject('ObjectsBUIWEB/00-ObjectsBuscarFiltrosOtrasGestiones/input_Nmero_Numero'), legajo_electronico)

WebUI.click(findTestObject('ObjectsBUIWEB/00-ObjectsBuscarFiltrosOtrasGestiones/button_Buscar'))

//cancela la boleta encontrada
WebUI.callTestCase(findTestCase('BUI WEB/Genericos/CancelarBoletaEncontrada'), [:], FailureHandling.STOP_ON_FAILURE)

//se desloguea de la sesion
WebUI.callTestCase(findTestCase('BUI WEB/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

