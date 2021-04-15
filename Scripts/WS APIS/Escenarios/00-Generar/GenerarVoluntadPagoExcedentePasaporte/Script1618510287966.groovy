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

ResponseObject response = WS.sendRequest(findTestObject('ObjectsWSApi/BUIAPI/BUIAPIGenerar(Parametrizado)', [('DomainURL') : GlobalVariable.url_BUIAPI, ('dependenciaId') : 'E856123C-57C9-7847-89BF-02FD69A5B695'
            , ('nombreDependencia') : 'Dirección General de Licencias', ('codigoDependencia') : '19', ('tipoDeDocumento_ID') : 'EC9D5AE2-1873-1445-A451-15D3DB26E64C'
            , ('tipoDeDocumento_Codigo') : 'PAS', ('tipoDeDocumento_Descripcion') : 'Pasaporte', ('tipoDeDocumento_Formato') : 'PAS'
            , ('nombre') : 'Juan Carlos', ('documento') : '86969989235957573534742354593887', ('email') : 'juanca@yopmail.com', ('direccion') : 'cuba 2222'
            , ('localidad') : 'capital federal', ('codigoPostal') : '1428', ('piso') : '1', ('departamento') : 'a']))

def responseString = response.getResponseText().toString()
print responseString
WS.verifyResponseStatusCode(response, 400)
WS.verifyElementPropertyValue(response, 'Message', "Error al guardar BUI. Errores: El documento ingresado no es válido.; ")

