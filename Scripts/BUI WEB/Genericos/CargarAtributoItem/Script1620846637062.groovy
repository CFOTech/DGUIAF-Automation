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

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/span_select'))

String dependenciaNombre = getBinding().getVariables().getAt('dependenciaVar')

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/li_dependencia', [('dependenciaNombre') : dependenciaNombre]))

String itemCodigo = getBinding().getVariables().getAt('itemCodVar')

String itemDescripcion = getBinding().getVariables().getAt('itemVar')

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/input_Item_ItemID'), itemCodigo)

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/td_item', [('itemNombre') : itemDescripcion]))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/button_Atributo'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/input_check_Cantidad Fija_TieneCantidadFija'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/input_check_Valor Fijo_TieneValorFijo'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/button_Agregar'))

WebUI.verifyElementText(findTestObject('ObjectsBUIWEB/00-Page_ABMAtributosItem/td_item'), itemDescripcion)

