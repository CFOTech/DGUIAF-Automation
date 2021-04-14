import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable

ResponseObject response = WS.sendRequest(findTestObject('ObjectsWSApi/BUI API - Generar(Parametrizado)', [('DomainURL') : GlobalVariable.url_BUIAPI
			, ('dependenciaId') : 'E856123C-57C9-7847-89BF-02FD69A5B695', ('nombreDependencia') : 'Dirección General de Licencias'
			, ('codigoDependencia') : '19', ('tipoDeDocumento_ID') : 'A3853F0E-6DA5-4949-870F-D2248B0D80D7', ('tipoDeDocumento_Codigo') : 'DNI'
			, ('tipoDeDocumento_Descripcion') : 'Documento Nacional de Identidad', ('tipoDeDocumento_Formato') : 'DNI', ('nombre') : 'Juan Carlos'
			, ('documento') : '12345678', ('email') : '', ('direccion') : 'Cuba 2222', ('localidad') : 'capital federal'
			, ('codigoPostal') : '1428', ('piso') : '', ('departamento') : '', ('regex') : '']))

def responseString = response.getResponseText().toString()


print(responseString)
