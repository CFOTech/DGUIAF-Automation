import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable

ResponseObject response = WS.sendRequest(findTestObject('Smoke Test/BUI API - Generar(Parametrizado)', [('DomainURL') : GlobalVariable.url_BUIAPI
            , ('dependenciaId') : 'E856123C-57C9-7847-89BF-02FD69A5B695', ('nombreDependencia') : 'Dirección General de Licencias'
            , ('codigoDependencia') : '19', ('tipoDeDocumento_ID') : 'A3853F0E-6DA5-4949-870F-D2248B0D80D7', ('tipoDeDocumento_Codigo') : 'DNI'
            , ('tipoDeDocumento_Descripcion') : 'Documento Nacional de Identidad', ('tipoDeDocumento_Formato') : 'DNI', ('nombre') : 'Juan Carlos'
            , ('documento') : '1', ('email') : 'juanca@yopmail.com', ('direccion') : 'cuba 222', ('localidad') : 'Capital Federal'
            , ('codigoPostal') : '1428', ('piso') : '1', ('departamento') : 'a', ('regex') : '']))


def responseString = response.getResponseText().toString()
print(responseString)
WS.verifyResponseStatusCode(response, 400)
WS.verifyElementPropertyValue(response, 'Message', "Error al guardar BUI. Errores: El documento ingresado no es válido.; ")
