import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import java.lang.String as String
import groovy.util.XmlSlurper as XmlSlurper
import groovy.util.XmlParser as XmlParser
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable


/*---------------------------------------------------------------------------------------------
PRIMER PASO: Se genera la boleta y se obtiene el id de la misma
Envía un RQ al WS GenerarBUI, y guarda el response en la variable response.*/
ResponseObject response = WS.sendRequest(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGenerar', [('DomainURL') : GlobalVariable.url_BUIAPI])) //Print de control//print(response.getResponseText())
//Parsea el response, el mismo contiene el id para eenviar en el proximo Request body 
def responsePreParsed = response.getResponseText().toString()
//elimina las comillas del string extraído del response de GENERAR
String ResponseParsed = responsePreParsed.replace('"', '')
//Print de control // print(ResponseParsed) 

/*---------------------------------------------------------------------------------------------*/
//Segundo Paso: Get Token
// Almacena en la variable 'response2' el response de de GetToken. Y el request lo envia con la variable generada arriba 'responseParsed'
ResponseObject response2 = WS.sendRequest(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGetToken', [('buiId') : ResponseParsed]))
//Print de control//println(response2.getResponseBodyContent())

//parsea el response de GET TOKEN a string.
def tokenParser = new XmlSlurper().parseText(response2.getResponseBodyContent())
//elimina el 200ok del response para que solo quede el valor de token
String tokenID = tokenParser.toString().replace('200OK', '')
//concatena la URL de autopago con el token
String urlAutopago = 'http://10.73.2.97:2485/pago/mediodepago?token=' + tokenID
//print urlAutopago //Print de control

//LLama al TC de auto pago donde verificará la existencia de la opción 'Autopago'
WebUI.callTestCase(findTestCase('WS APIS/Escenarios/BUIAPIVerificaciondeAutoPago'), [('Url_AutoPago') : urlAutopago], FailureHandling.STOP_ON_FAILURE)

