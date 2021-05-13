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

dependenciaNombre = getBinding().getVariables().getAt('dependenciaVar')

println('Dependencia: ' + dependenciaNombre.toString())

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/span_select'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/li_dependencia', [('dependenciaParam') : dependenciaNombre]))

String itemCodigo = getBinding().getVariables().getAt('itemCodVar')

WebUI.setText(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/input_Item_ItemID'), itemCodigo)

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/li_itemConcepto'))

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/button_Detalle'), 3)

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/button_Detalle'))

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/input_Nombre_Nombre'), 3)

WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/input_Nombre_Nombre'), 'PruebaNombreDetalle')

WebUI.sendKeys(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/input_Descripcion_Descripcion'), 'PruebaDescripcionDetalle')

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/span_- Sin asociacin -'))

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/li_listaAsociada'))

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/button_Agregar'), 3)

WebUI.click(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/button_Agregar'))

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/td_NombreDetalle'), 3)

WebUI.verifyElementText(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/td_NombreDetalle'), 'PruebaNombreDetalle')

WebUI.verifyElementText(findTestObject('ObjectsBUIWEB/00-Page_ABMDetallesItem/td_DescripcionDetalle'), 'PruebaDescripcionDetalle')

