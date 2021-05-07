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
import java.lang.String as String
import groovy.util.XmlSlurper as XmlSlurper
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import groovy.json.JsonSlurper as JsonSlurper
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import java.lang.Math
import groovy.json.* //libreria para usar jsonOutPut

def slurper = new JsonSlurper()
def jsonConceptosArray = new Object[CantidadConceptos]
def randomNumber
def id
def codigoConcepto

def jsonGenerarString = "{" +
  "\"Dependencia\": { " +
    "\"ID\": \" " + idDependencia + "\"," +
   " \"Nombre\": \" " + nombreDependencia + "\", " +
   "\"Codigo\":" + codigoDependencia + "," +
   "\"BajaFecha\": null," +
   "\"Items\": []" +
  "}," +
  "\"IDTramiteDependencia\": \"\"," +
  "\"DependenciaID\": \" " + idDependencia + " \"," +
  "\"VencimientoDependencia\": null," +
  "\"Contribuyente\": {" +
    "\"TipoPersona\": \"Fisica\"," +
    "\"TipoDocumento\": {" +
      "\"ID\": \"a3853f0e-6da5-4949-870f-d2248b0d80d7\"," +
      "\"Codigo\": \"DNI\"," +
      "\"Descripcion\": \"Documento Nacional de Identidad\"," +
      "\"Regex\": \"\"," +
      "\"Formato\": \"DNI\"" +
    "}," +
    "\"Nombre\": \"John Voltar\"," +
    "\"Documento\": \"36244389\"," +
    "\"Email\": \"qasirsirsir@gmail.com\"," +
    "\"Direccion\": \"roosevelt\","+
    "\"Piso\": \"\"," +
    "\"Departamento\": \"1\"," +
    "\"Localidad\": \"Capital federal\"," +
    "\"CodigoPostal\": \"1414\" " +
  "}," +
  "\"NroExpediente\": \"\","

def jsonComienzoConceptosString = "\"Conceptos\": ["
    
def jsonConceptosString = "{" +
      //"\"ID\": \"0c44c864-3bfc-4725-8253-f9b90ecaef4d\"," +
      "\"ItemID\": \"b7184412-d8a1-4304-973d-b53895790c43\"," +
      "\"Codigo\": \"07.02.28\"," +
      //"\"Descripcion\": \"Habilit/formación de cond. De vehic. Otorgamientos de licencias de conducir\"," +
      "\"Cantidad\": 1," +
      //"\"Importe\": 1500," +
      //"\"Vigencia\": 0," +
      //"\"Total\": 1500," +
      "\"Detalles\": []" +
    "}"
	
def jsonCierreString = "]" + "}"

//parseo jsonConceptos para poder acceder a sus campos
def jsonConceptos = slurper.parseText(jsonConceptosString)


// La variable "CantidadConceptos" es una variable local, la cual va a cambiarse manualmente segun la cantidad de conceptos que se quieran agregar a la boleta.
for(def i=0 ; i < CantidadConceptos ; i++)
{
	//Genero un numero random desde 0 hasta el maximo de filas que tenga el test data
	randomNumber = (int)(Math.random() * filasTestData)
	//Agrego una condicion de que, si random devuelve 0, cambiarlo por el valor 1, ya que la tabla de datos no tiene posicion 0
	if(randomNumber == 0)
		{
			randomNumber = 1
		}
	//print de prueba
	println randomNumber
	
	//Capturo el valor de la tabla de datos
	codigoConcepto = findTestData(testData).getValue(1, randomNumber)
	id = findTestData(testData).getValue(2, randomNumber)
	
	//Con el valor anteriormente capturado, seteo los campos originales del JSON
	jsonConceptos.Codigo = codigoConcepto
	jsonConceptos.ItemID = id
	
	//Convierto cada JSON de conceptos en string para poder luego concatenarlo
	jsonConceptosArray[i] = JsonOutput.toJson(jsonConceptos)
}

//le asigno un valor a "jsonConceptosUnidos" ya que, si lo concateno sin valor inicial, aparece como "Null" en el string final "JsonGenerarCompleto"
def jsonConceptosUnidos = jsonComienzoConceptosString
def jsonGenerarCompleto

//Bucle para concatenar los conceptos. Luego de tener los conceptos juntos, lo concatenamos al json principal
for(i=0 ; i < CantidadConceptos ; i++)
{
	jsonConceptosUnidos = jsonConceptosUnidos + jsonConceptosArray[i] + ","
}

//Concateno todas las partes y armo el Json a usar
jsonGenerarCompleto = jsonGenerarString + jsonConceptosUnidos + jsonCierreString

jsonGenerarLegible = JsonOutput.prettyPrint(jsonGenerarCompleto) //prettyPrint me devuelve el json en forma de arbol para poder utilizarlo en el body
//print de prueba
println jsonGenerarLegible

ResponseObject responseBuiConConceptos = WS.sendRequest(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGenerarVariosConceptos', [('request_body') : jsonGenerarLegible]))

idBUI = responseBuiConConceptos.getResponseText()

//print de prueba
println responseBuiConConceptos.getResponseText()