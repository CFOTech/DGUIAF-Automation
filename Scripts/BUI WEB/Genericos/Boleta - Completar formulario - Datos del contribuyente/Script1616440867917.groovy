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

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_select_Contribuyente.Documento'), dni)

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Apellido y nombreRazn social_Contribu_8e150d'), 
    apellidoYNombre)

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Correo electrnico_Contribuyente.Email'), correoElectronico)

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Direccin_Contribuyente.Direccion'), direccion)

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Departamento_Contribuyente.Departamento'), departamento)

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Localidad_Contribuyente.Localidad'), localidad)

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Cdigo postal_Contribuyente.CodigoPostal'), codigoPostal)

