<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>BUIAPIGenerar(Parametrizado)</name>
   <tag></tag>
   <elementGuidId>581c0f0f-3edc-4f69-9330-e9eb09596d8f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;Dependencia\&quot;: {\n    \&quot;ID\&quot;: \&quot;${dependenciaId}\&quot;,\n    \&quot;Nombre\&quot;: \&quot;${nombreDependencia}\&quot;,\n    \&quot;Codigo\&quot;: ${codigoDependencia},\n    \&quot;BajaFecha\&quot;: null,\n    \&quot;Items\&quot;: []\n  },\n  \&quot;IDTramiteDependencia\&quot;: \&quot;\&quot;,\n  \&quot;DependenciaID\&quot;: \&quot;${dependenciaId}\&quot;,\n  \&quot;VencimientoDependencia\&quot;: null,\n  \&quot;Contribuyente\&quot;: {\n    \&quot;TipoPersona\&quot;: \&quot;Fisica\&quot;,\n    \&quot;TipoDocumento\&quot;: {\n      \&quot;ID\&quot;: \&quot;${tipoDeDocumento_ID}\&quot;,\n      \&quot;Codigo\&quot;: \&quot;${tipoDeDocumento_Codigo}\&quot;,\n      \&quot;Descripcion\&quot;: \&quot;${tipoDeDocumento_Descripcion}\&quot;,\n      \&quot;Regex\&quot;: \&quot;${regex}\&quot;,\n      \&quot;Formato\&quot;: \&quot;${tipoDeDocumento_Formato}\&quot;\n    },\n    \&quot;Nombre\&quot;: \&quot;${nombre}\&quot;,\n    \&quot;Documento\&quot;: \&quot;${documento}\&quot;,\n    \&quot;Email\&quot;: \&quot;${email}\&quot;,\n    \&quot;Direccion\&quot;: \&quot;${direccion}\&quot;,\n    \&quot;Piso\&quot;: \&quot;${piso}\&quot;,\n    \&quot;Departamento\&quot;: \&quot;${departamento}\&quot;,\n    \&quot;Localidad\&quot;: \&quot;${localidad}\&quot;,\n    \&quot;CodigoPostal\&quot;: \&quot;${codigoPostal}\&quot;\n  },\n  \&quot;NroExpediente\&quot;: \&quot;\&quot;,\n  \&quot;Conceptos\&quot;: [\n    {\n      \&quot;ID\&quot;: \&quot;0c44c864-3bfc-4725-8253-f9b90ecaef4d\&quot;,\n      \&quot;ItemID\&quot;: \&quot;b7184412-d8a1-4304-973d-b53895790c43\&quot;,\n      \&quot;Codigo\&quot;: \&quot;07.02.28\&quot;,\n      \&quot;Descripcion\&quot;: \&quot;Habilit/formación de cond. De vehic. Otorgamientos de licencias de conducir\&quot;,\n      \&quot;Cantidad\&quot;: 1,\n      \&quot;Importe\&quot;: 1500,\n      \&quot;Vigencia\&quot;: 0,\n      \&quot;Total\&quot;: 1500,\n      \&quot;Detalles\&quot;: []\n    }\n  ]\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
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
   <katalonVersion>7.9.1</katalonVersion>
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
      <id>8b7a72d4-ecd0-42b0-9b08-f95f6283b22f</id>
      <masked>false</masked>
      <name>DomainURL</name>
   </variables>
   <variables>
      <defaultValue>'E856123C-57C9-7847-89BF-02FD69A5B695'</defaultValue>
      <description></description>
      <id>bee9d6f9-dd69-4bf6-952e-dec9e835a34b</id>
      <masked>false</masked>
      <name>dependenciaId</name>
   </variables>
   <variables>
      <defaultValue>'Dirección General de Licencias'</defaultValue>
      <description></description>
      <id>69940391-f5e3-4641-a0a8-c8d233fb117a</id>
      <masked>false</masked>
      <name>nombreDependencia</name>
   </variables>
   <variables>
      <defaultValue>'19'</defaultValue>
      <description></description>
      <id>a76eda4a-6bef-4138-a702-fc9f6b7c2502</id>
      <masked>false</masked>
      <name>codigoDependencia</name>
   </variables>
   <variables>
      <defaultValue>'A3853F0E-6DA5-4949-870F-D2248B0D80D7'</defaultValue>
      <description></description>
      <id>0a8ea2ed-4686-4ccb-b8a0-6952d148bcaa</id>
      <masked>false</masked>
      <name>tipoDeDocumento_ID</name>
   </variables>
   <variables>
      <defaultValue>'DNI'</defaultValue>
      <description></description>
      <id>5e421569-e37b-4e0e-869c-89d1bdad5d97</id>
      <masked>false</masked>
      <name>tipoDeDocumento_Codigo</name>
   </variables>
   <variables>
      <defaultValue>'Documento Nacional de Identidad'</defaultValue>
      <description></description>
      <id>afe06d8d-207a-4457-92bd-79c07e1db894</id>
      <masked>false</masked>
      <name>tipoDeDocumento_Descripcion</name>
   </variables>
   <variables>
      <defaultValue>'DNI'</defaultValue>
      <description></description>
      <id>73360642-9a5d-4ba1-8eb3-2732d8993997</id>
      <masked>false</masked>
      <name>tipoDeDocumento_Formato</name>
   </variables>
   <variables>
      <defaultValue>'Juan Carlos\r\n'</defaultValue>
      <description></description>
      <id>ad3fbefd-0e31-4390-bbb0-a0bf53df3db7</id>
      <masked>false</masked>
      <name>nombre</name>
   </variables>
   <variables>
      <defaultValue>'12345678'</defaultValue>
      <description></description>
      <id>120faa8e-ab62-4d4e-ac94-983c39f38f17</id>
      <masked>false</masked>
      <name>documento</name>
   </variables>
   <variables>
      <defaultValue>'juanca@yopmail.com'</defaultValue>
      <description></description>
      <id>6c1fdf2e-8052-451e-8532-a8cb2d9fbb38</id>
      <masked>false</masked>
      <name>email</name>
   </variables>
   <variables>
      <defaultValue>'cuba 222'</defaultValue>
      <description></description>
      <id>7f01d934-7c35-4e14-b248-e25bd2a9029b</id>
      <masked>false</masked>
      <name>direccion</name>
   </variables>
   <variables>
      <defaultValue>'Capital Federal'</defaultValue>
      <description></description>
      <id>833ae14b-0bbb-4152-98b3-f1816224f0b9</id>
      <masked>false</masked>
      <name>localidad</name>
   </variables>
   <variables>
      <defaultValue>'1428'</defaultValue>
      <description></description>
      <id>8634482c-d966-4700-9037-b9bf64f83198</id>
      <masked>false</masked>
      <name>codigoPostal</name>
   </variables>
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>a0784222-2d2e-4153-be2c-3542bd4abb25</id>
      <masked>false</masked>
      <name>piso</name>
   </variables>
   <variables>
      <defaultValue>'a'</defaultValue>
      <description></description>
      <id>e19e57a3-a346-43f9-8d41-721d2fc876a6</id>
      <masked>false</masked>
      <name>departamento</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>a442f24e-fbf0-4d8f-b389-ea5d073ec549</id>
      <masked>false</masked>
      <name>regex</name>
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











WS.verifyElementPropertyValue(response, 'Message', &quot;Error al guardar BUI. Errores: La dirección del contribuyente no puede estar vacía.; &quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
