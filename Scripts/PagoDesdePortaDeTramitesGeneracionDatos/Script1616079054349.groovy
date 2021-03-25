import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import java.lang.String as String
import groovy.util.XmlSlurper as XmlSlurper
//import groovy.util.XmlParser as XmlParser
import java.lang.String as String
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import groovy.json.JsonSlurper

//Creacion de variables
def IdGenerado
def IdGeneradoParsed

//Se guarda response en variable ResponseIdGenerado. Este response contiene el ID de la boleta que necesitamos
ResponseObject responseIdGenerado = WS.sendRequest(findTestObject('Smoke Test/BUI API - Generar'))

//Convierto a cadena de texto el response
IdGenerado = responseIdGenerado.getResponseText().toString()

//Se quitan las comillas al response, ya que necesito el resultado sin esas comillas
IdGeneradoParsed = IdGenerado.replace('"', '')

//Se guarda segundo response en variable JsonBoleta. Este Json contiene el numero de la boleta que se genera por el ID anterior.
ResponseObject JsonBoleta = WS.sendRequest(findTestObject('Smoke Test/BUI API - getBoletaMasPago' , [('idBoleta') : IdGeneradoParsed]))

//Se convierte a cadena de texto el response
def JsonBoletaString = JsonBoleta.getResponseText().toString()

//Se crea un objeto de la clase "JsonSlurper" para manipular el Json
JsonSlurper slurper = new JsonSlurper()

//Creo un objecto en donde voy a guardar el Json convertido a texto. Con el objeto Result voy a poder acceder a todos los campos del JSON
Object result = slurper.parseText(JsonBoletaString)

println result.Numero













