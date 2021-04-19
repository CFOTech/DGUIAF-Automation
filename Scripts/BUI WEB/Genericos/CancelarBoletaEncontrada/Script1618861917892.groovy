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

//permite cancelar una boleta buscada por numero previamnete

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/00-ObjectsCancelarBoleta/a_Cancelar'), 5)

//presiona el boton Cancelar sobre el elemento del listado encontrado
WebUI.click(findTestObject('ObjectsBUIWEB/00-ObjectsCancelarBoleta/a_Cancelar'))

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/00-ObjectsCancelarBoleta/button_Si'), 5)

//presiona el boton Si, que confirma la operacion
WebUI.click(findTestObject('ObjectsBUIWEB/00-ObjectsCancelarBoleta/button_Si'))

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/00-ObjectsCancelarBoleta/span_La boleta se cancelo correctamente'), 
    5)

//valida que se muestra el mensaje 'La boleta se cancelo correctamente.' luego de realizar la operacion
WebUI.verifyElementText(findTestObject('ObjectsBUIWEB/00-ObjectsCancelarBoleta/span_La boleta se cancelo correctamente'), 
    'La boleta se cancelo correctamente.')

//espera hasta que se cierra el modal del mensaje
WebUI.waitForElementNotPresent(findTestObject('ObjectsBUIWEB/00-ObjectsCancelarBoleta/span_La boleta se cancelo correctamente'), 
    5)

