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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica (1)/span_Concepto'))

WebUI.verifyElementVisible(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica (1)/input_Codigo_txtCodigo'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica (1)/input_Codigo_txtCodigo'), CodigoConcepto)

WebUI.verifyElementVisible(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica (1)/ddConceptoSeleccionado'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica (1)/ddConceptoSeleccionado'))

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica (2)/input_Valor_txtValor'), MontoVariable)

//WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica/input_Codigo_txtCodigo'), '07.02.28 Habilit/formación de cond. De vehic. Otorgamientos de licencias de conducir')
WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_Boleta Unica (1)/button_Agregar'))

