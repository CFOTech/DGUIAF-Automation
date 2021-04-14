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

//Agrega un concepto.

WebUI.callTestCase(findTestCase('BUI WEB/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectsBUIWEB/menuAdmin'))

WebUI.click(findTestObject('ObjectsBUIWEB/ddAtributosdeitem'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/span_- Seleccione una dependencia -'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/li_AGIP'))

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/input_Item_ItemID'), '02.')

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/li_02.12.55 Remocin de atad chico o urna en bveda'))

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/input_Item_ItemID'), '02.12.55 Remoción de ataúd chico o urna en bóveda')

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/button_Atributo'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/div_Vigencia'))

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/input_Vigencia_Vigencia'), '30')

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/input_Valor Fijo_TieneValorFijo'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/button_Agregar'))

WebUI.closeBrowser()
//Verifica que en la generación de boleta exista ese concepto.
WebUI.callTestCase(findTestCase('BUI WEB/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/span_select'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/li_AGIP'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/span_Concepto'))

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Codigo_txtCodigo'), '02.12.55')

WebUI.verifyElementPresent(findTestObject('ObjectsBUIWEB/dd02.12.55 Remocin de atad chico o urna en bveda'), 2)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('BUI WEB/Genericos/Login'), [:], FailureHandling.STOP_ON_FAILURE)
//borra el concepto

WebUI.click(findTestObject('ObjectsBUIWEB/menuAdmin'))

WebUI.click(findTestObject('ObjectsBUIWEB/ddAtributosdeitem'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/span_- Seleccione una dependencia -'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/li_AGIP'))

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/input_Item_ItemID'), '02.12.55')

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/dd02.12.55 Remocin de atad chico o urna en bveda'), 0)

WebUI.click(findTestObject('ObjectsBUIWEB/dd02.12.55 Remocin de atad chico o urna en bveda'))

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/input_Item_ItemID'), '02.12.55 Remoción de ataúd chico o urna en bóveda')

WebUI.click(findTestObject('ObjectsBUIWEB/btnQuitar'))

WebUI.acceptAlert()

WebUI.callTestCase(findTestCase('BUI WEB/Genericos/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

