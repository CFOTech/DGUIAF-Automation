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

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/span_Concepto'))

WebUI.verifyElementVisible(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Codigo_txtCodigo'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Codigo_txtCodigo'), Concepto)

WebUI.verifyElementVisible(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/ddConceptoSeleccionado'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/ddConceptoSeleccionado'))

//WebUI.click(findTestObject('Object Repository/Page_Boleta Unica/td_Metros_gridDetails_active_cell'))
//WebUI.click(findTestObject('Object Repository/00-Page_Boleta Unica/button_Agregar'))
if (valorRegla != '0') {
    WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/td_valor_regla'))

    WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Metros_Valor'), valorRegla)

    WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Metros_Valor'), Keys.chord(Keys.ENTER))
}

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABM de Atributos del Item/button_Agregar'))

