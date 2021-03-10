import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import java.lang.String as String
import groovy.util.XmlSlurper as XmlSlurper
import groovy.util.XmlParser as XmlParser

ResponseObject response = WS.sendRequest(findTestObject('Smoke Test/BUI API - Generar'))

print(response.getResponseText())

def responsePreParsed = response.getResponseText().toString()

String ResponseParsed = responsePreParsed.replace('"', '')

print(ResponseParsed)

ResponseObject response2 = WS.sendRequest(findTestObject('Smoke Test/BUI API - GetToken', [('buiId') : ResponseParsed]))

println(response2.getResponseBodyContent())

def tokenParser = new XmlSlurper().parseText(response2.getResponseBodyContent())
//print tokenParser
String tokenID = (tokenParser.toString()).replace('200OK','')
//print(tokenID)

String urlAutopago = 'http://10.73.2.97:2485/pago/mediodepago?token=' + tokenID
//print urlAutopago
WebUI.callTestCase(findTestCase('BUIAPI- VerificaciondeAutoPago'), [('Url_AutoPago') : urlAutopago], FailureHandling.STOP_ON_FAILURE)

