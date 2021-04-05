import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable

ResponseObject response= WS.sendRequest(findTestObject('Smoke Test/BUI API - Generar(Parametrizado)', [('DomainURL') : GlobalVariable.url_BUIAPI, ('dependenciaId') : 'E856123C-57C9-7847-89BF-02FD69A5B695'
            , ('nombreDependencia') : 'Dirección General de Licencias', ('codigoDependencia') : '19', ('tipoDeDocumento_ID') : 'EC9D5AE2-1873-1445-A451-15D3DB26E64C'
            , ('tipoDeDocumento_Codigo') : 'PAS', ('tipoDeDocumento_Descripcion') : 'Pasaporte', ('tipoDeDocumento_Formato') : ''
            , ('nombre') : 'Juan Carlos', ('documento') : '12345678910101010', ('email') : 'juanca@yopmail.com', ('direccion') : 'cuba 2222'
            , ('localidad') : 'capital federal', ('codigoPostal') : '1428', ('piso') : '', ('departamento') : '', ('regex') : '^[a-zA-Z0-9]{6,20}$']))

def responseString = response.getResponseText().toString()
print responseString
WS.verifyResponseStatusCode(response, 200)



