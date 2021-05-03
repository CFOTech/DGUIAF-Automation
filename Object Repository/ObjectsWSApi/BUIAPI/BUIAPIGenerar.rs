<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>BUIAPIGenerar</name>
   <tag></tag>
   <elementGuidId>4c8060f8-6476-4aaa-929e-af5540fdcf93</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;Dependencia\&quot;: {\n    \&quot;ID\&quot;: \&quot;E856123C-57C9-7847-89BF-02FD69A5B695\&quot;,\n    \&quot;Nombre\&quot;: \&quot;Dirección General de Licencias\&quot;,\n    \&quot;Codigo\&quot;: 19,\n    \&quot;BajaFecha\&quot;: null,\n    \&quot;Items\&quot;: []\n  },\n  \&quot;IDTramiteDependencia\&quot;: \&quot;\&quot;,\n  \&quot;DependenciaID\&quot;: \&quot;E856123C-57C9-7847-89BF-02FD69A5B695\&quot;,\n  \&quot;VencimientoDependencia\&quot;: null,\n  \&quot;Contribuyente\&quot;: {\n    \&quot;TipoPersona\&quot;: \&quot;Fisica\&quot;,\n    \&quot;TipoDocumento\&quot;: {\n      \&quot;ID\&quot;: \&quot;a3853f0e-6da5-4949-870f-d2248b0d80d7\&quot;,\n      \&quot;Codigo\&quot;: \&quot;DNI\&quot;,\n      \&quot;Descripcion\&quot;: \&quot;Documento Nacional de Identidad\&quot;,\n      \&quot;Regex\&quot;: \&quot;^\\\\d{6,8}$\&quot;,\n      \&quot;Formato\&quot;: \&quot;DNI\&quot;\n    },\n    \&quot;Nombre\&quot;: \&quot;John Voltar\&quot;,\n    \&quot;Documento\&quot;: \&quot;36244389\&quot;,\n    \&quot;Email\&quot;: \&quot;qasirsirsir@gmail.com\&quot;,\n    \&quot;Direccion\&quot;: \&quot;roosevelt\&quot;,\n    \&quot;Piso\&quot;: \&quot;\&quot;,\n    \&quot;Departamento\&quot;: \&quot;1\&quot;,\n    \&quot;Localidad\&quot;: \&quot;Capital federal\&quot;,\n    \&quot;CodigoPostal\&quot;: \&quot;1414\&quot;\n  },\n  \&quot;NroExpediente\&quot;: \&quot;\&quot;,\n  \&quot;Conceptos\&quot;: [\n    {\n      \&quot;ID\&quot;: \&quot;0c44c864-3bfc-4725-8253-f9b90ecaef4d\&quot;,\n      \&quot;ItemID\&quot;: \&quot;b7184412-d8a1-4304-973d-b53895790c43\&quot;,\n      \&quot;Codigo\&quot;: \&quot;07.02.28\&quot;,\n      \&quot;Descripcion\&quot;: \&quot;Habilit/formación de cond. De vehic. Otorgamientos de licencias de conducir\&quot;,\n      \&quot;Cantidad\&quot;: 1,\n      \&quot;Importe\&quot;: 1500,\n      \&quot;Vigencia\&quot;: 0,\n      \&quot;Total\&quot;: 1500,\n      \&quot;Detalles\&quot;: []\n    }\n  ]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic amNhcmxvczphdXRvbWF0aW9uMTIzNA==</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${DomainURL}/Generar</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url_BUIAPI</defaultValue>
      <description></description>
      <id>a09cbdcd-3a90-457f-bcb5-0347bba39147</id>
      <masked>false</masked>
      <name>DomainURL</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
