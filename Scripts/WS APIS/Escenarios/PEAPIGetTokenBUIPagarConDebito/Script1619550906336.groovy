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

ResponseObject response = WS.sendRequest(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGenerar', [('DomainURL') : GlobalVariable.url_BUIAPI //Print de control//print(response.getResponseText())
        ]))

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
String urlAutopago = 'http://10.73.100.48:2485/pago/mediodepago?token=' + tokenID

