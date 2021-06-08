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
import groovy.json.JsonSlurper as JsonSlurper
import groovy.json.JsonParser as JsonParser

//------------CREA UNA BUI-------------------

// se genera bui por BUIAPI 
ResponseObject response = WS.sendRequest(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGenerar', [('DomainURL') : GlobalVariable.url_BUIAPI //Print de control//print(response.getResponseText())
        ]))
//Parsea el response, el mismo contiene el id para eenviar en el proximo Request body
def responsePreParsed = response.getResponseText().toString()
//elimina las comillas del string extraído del response de GENERAR
String idBui = responsePreParsed.replace('"', '')
//EXTRAE EL CODIGO DE BARRAS DE 'GetById'
def CodBarras = CustomKeywords.'adicionales.ManejoXML.devuelveVariableporJson'(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGetById', 
        [('DomainURL') : GlobalVariable.url_BUIAPI, ('idBoleta') : idBui]), 'CodBarras')
print(CodBarras)
//----------------------COMIENZA EL PAGO POR SIRAPI---------------------------

//SOLICITA UN TOKEN PARA OPERAR
def token = CustomKeywords.'adicionales.ManejoXML.devuelveVariableporTag'(findTestObject('ObjectsWSApi/SIRAPI/SIRAPIRequestToken', 
        [('DomainURL') : GlobalVariable.url_SIRAPI]), 'Message')

//LEE EL CODIGO DE BARRAS DE LA BUI 
ResponseObject rsp = WS.sendRequest(findTestObject('ObjectsWSApi/SIRAPI/SIRAPIParseBarcode', [('DomainURL') : GlobalVariable.url_SIRAPI
            , ('barCode') : CodBarras, ('token') : token]))

//TOMA TODOS LOS DATOS DE CONCEPTOS DE LA BUI
String s = rsp.getResponseText()
def requiredString = s.substring(s.indexOf('<a:Conceptos'), s.indexOf('<a:Detalles'))
//MONTO TOTAL DE LA BUI
def importetotal = s.substring(s.indexOf('<a:ImporteTotal>') + 16, s.indexOf('</a:ImporteTotal>'))
//ARMA EL NUEVO REQUEST PARA HACER EL COMMITPAYMENT
String requestCommit = requiredString.replace('a:', 'sir:')

//----------------REALIZA EL PAGO POR COMMITPAYMENT----------------------
ResponseObject rsp2 =WS.sendRequest(findTestObject('ObjectsWSApi/SIRAPI/SIRAPICommitPayment - Copy', [('DomainURL') : GlobalVariable.url_SIRAPI
            , ('Conceptos') : requestCommit, ('token') : token, ('Monto') : importetotal]))

print(rsp2.getResponseText())

