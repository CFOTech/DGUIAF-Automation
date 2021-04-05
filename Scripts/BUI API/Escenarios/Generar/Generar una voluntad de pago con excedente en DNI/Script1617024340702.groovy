import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

ResponseObject response = WS.sendRequest(findTestObject('Smoke Test/BUI API - Generar(Parametrizado)', [('DomainURL') : GlobalVariable.url_BUIAPI, ('dependenciaId') : 'E856123C-57C9-7847-89BF-02FD69A5B695'
            , ('nombreDependencia') : 'Dirección General de Licencias', ('codigoDependencia') : '19', ('tipoDeDocumento_ID') : 'a3853f0e-6da5-4949-870f-d2248b0d80d7'
            , ('tipoDeDocumento_Codigo') : 'DNI', ('tipoDeDocumento_Descripcion') : 'Documento Nacional de Identidad', ('tipoDeDocumento_Formato') : 'DNI'
            , ('nombre') : 'Juan Carlos', ('documento') : '12345678910101010', ('email') : 'juanca@yopmail.com', ('direccion') : 'cuba 2222'
            , ('localidad') : 'capital federal', ('codigoPostal') : '1428', ('piso') : '', ('departamento') : '']))

def responseString = response.getResponseText().toString()
print responseString
WS.verifyResponseStatusCode(response, 400)
WS.verifyElementPropertyValue(response, 'Message', 'Error al guardar BUI. Errores: El documento ingresado no es válido.; ')

