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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.73.2.97:6748/WEB/Usuario/SignIn?ReturnUrl=%2fWEB')

WebUI.setText(findTestObject('Object Repository/Page_GCBA - Boleta Unica/input_Login_txtUserName'), 'trivera')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_GCBA - Boleta Unica/input_Login_txtPassword'), 'giUrpclIDT/1h8mWgZ2kbA==')

WebUI.click(findTestObject('Object Repository/Page_GCBA - Boleta Unica/button_Ingresar'))

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/span_ACA Libertador'))

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/li_Direccin General de Licencias'))

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_select_Contribuyente.Documento'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Apellido y nombreRazn social_Contribu_8e150d'), 
    'tatiana rivera')

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Correo electrnico_Contribuyente.Email'), 'tati@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Direccin_Contribuyente.Direccion'), 'roosevelt')

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Departamento_Contribuyente.Departamento'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Localidad_Contribuyente.Localidad'), 'capital federal')

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Cdigo postal_Contribuyente.CodigoPostal'), '1414')

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/span_Concepto'))

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/input_Codigo_txtCodigo'))

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Codigo_txtCodigo'), '07.02.28')

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/li_07.02.28 Habilitformacin de cond. De veh_0a30ab'))

WebUI.setText(findTestObject('Object Repository/Page_Boleta Unica/input_Codigo_txtCodigo'), '07.02.28 Habilit/formación de cond. De vehic. Otorgamientos de licencias de conducir')

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/button_Agregar'))

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/button_Generar'))

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/canvas_unsupported browser'))

WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/canvas_unsupported browser'))

WebUI.closeBrowser()

