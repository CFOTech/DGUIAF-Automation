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

for (def CantidaddeBUI = 1; CantidaddeBUI <= 10; CantidaddeBUI++) {
	WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioDatosEntidad'), [('Dependencia') : 'Dependencia Prueba'],
		FailureHandling.STOP_ON_FAILURE)

	WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioDatosContribuyente'), [('dni') : '12345678'
			, ('apellidoYNombre') : 'juan carlos', ('correoElectronico') : 'jcarlos@test.com', ('direccion') : '123', ('piso') : '1'
			, ('departamento') : '2', ('localidad') : 'caba', ('codigoPostal') : '1234'], FailureHandling.STOP_ON_FAILURE)

	for (def row = 1; row <= CantidaddeBUI /* findTestData('Datos de BUI').getRowNumbers()*/ ; row++) {
		int cantConceptos = findTestData('AgenciaTresDigitos').getRowNumbers()

		int rndConcepto = (((Math.random() * cantConceptos) + 1) as int)

		println(rndConcepto)

		//        def rndMonto = (((Math.random() * 4000) + 1) as int)
		//      print(rndMonto)
		WebUI.callTestCase(findTestCase('BUI WEB/Genericos/BoletaCompletarFormularioConceptos'), [('CodigoConcepto') : findTestData(
					'AgenciaTresDigitos').getValue(1, rndConcepto)], FailureHandling.STOP_ON_FAILURE)
	}
	
	WebUI.callTestCase(findTestCase('BUI WEB/Genericos/GenerarBoleta'), [:], FailureHandling.STOP_ON_FAILURE)

	WebUI.callTestCase(findTestCase('BUI WEB/Genericos/GuardarNroBoleta'), [:], FailureHandling.STOP_ON_FAILURE)

	WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/btnPDFAceptar'))
}

WebUI.closeBrowser()

