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

WebUI.openBrowser(GlobalVariable.url_Portal)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ObjectsPortal/menuPreguntasFrecuentes'))

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta01'))

WebUI.verifyTextPresent('A partir de ahora en la Ciudad podés utilizar esta nueva Billetera Virtual.', false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta02'))

WebUI.verifyTextPresent('Necesitas tener un usuario de MiBA, es importante que cuentes con él ya que es tu cuenta única para interactuar digitalmente con diferentes servicios del Gobierno de la Ciudad.', 
    false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta03'))

WebUI.verifyTextPresent('Podés registrarte con tu usuario de Facebook o Google para acceder de forma simple o bien podés registrarte con tu correo electrónico y contraseña.', 
    false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta04'))

WebUI.verifyTextPresent('Dentro de tu cuenta miBALogin existe la posibilidad de restablecer la contraseña en caso de que el usuario se la olvide. Recordá chequear siempre la carpeta de “Spam”.', 
    false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta05'))

WebUI.verifyTextPresent('Lo puede usar cualquier vecino de la ciudad, si trabajás, transitas o incluso para turistas, extranjeros que deseen abonar de manera rápida y ágil sus trámites de la Ciudad.', 
    false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta06'))

WebUI.verifyTextPresent('A través de este instructivo te mostramos el paso a paso para que puedas hacer tu trámite Instructivo', 
    false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta07'))

WebUI.verifyTextPresent('El servicio está habilitado las 24, todos los días.', false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta08'))

WebUI.verifyTextPresent('Si los perdiste o no los obtuviste llamá al 147 y pasale los datos que te soliciten para que puedan brindártelos.', 
    false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta09'))

WebUI.verifyTextPresent('Recordá que para dudas y reclamos comunicarse con el 147', false)

WebUI.click(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta10'))

WebUI.verifyTextPresent('Podés abonar cualquier BUI (Boleta Única Inteligente) de cualquier trámite de la Ciudad de Buenos Aires.', 
    false)

WebUI.sendKeys(findTestObject('ObjectsPortal/Preguntas Frecuentes/inputBuscarPregunta'), 'pago')

WebUI.verifyElementClickable(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta01'))

WebUI.verifyElementClickable(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta05'))

WebUI.verifyElementClickable(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta06'))

WebUI.verifyElementClickable(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta07'))

WebUI.verifyElementClickable(findTestObject('ObjectsPortal/Preguntas Frecuentes/optionPregunta09'))


