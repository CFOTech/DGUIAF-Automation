<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PE API - GetToken con datos de Suaci</name>
   <tag></tag>
   <elementGuidId>22d95255-2ae6-4a68-a06a-4e00fda7ece4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/soap+xml</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soap:Envelope xmlns:soap=&quot;http://www.w3.org/2003/05/soap-envelope&quot; xmlns:tem=&quot;http://tempuri.org/&quot;>
   &lt;soap:Header/>
   &lt;soap:Body>
      &lt;tem:GetToken>
         &lt;tem:contribuyente>
            &lt;tem:TipoPersona>Fisica&lt;/tem:TipoPersona>
            &lt;tem:TipoDoc>DNI&lt;/tem:TipoDoc>
			&lt;tem:Genero>M&lt;/tem:Genero>
            &lt;tem:ApellidoyNombre>Prueba&lt;/tem:ApellidoyNombre>
            &lt;tem:Documento>12312312&lt;/tem:Documento>
            &lt;tem:Direccion>Prueba 123&lt;/tem:Direccion>
            &lt;tem:Piso>1&lt;/tem:Piso>
            &lt;tem:Depto>1&lt;/tem:Depto>
            &lt;tem:Localidad>CABA&lt;/tem:Localidad>
            &lt;tem:CodPost>1234&lt;/tem:CodPost>
            &lt;tem:Email>rgilgado@dguiaf-gcba.gov.ar&lt;/tem:Email>
            &lt;tem:Nombre>Prueba&lt;/tem:Nombre>
            &lt;tem:Apellido>Prueba&lt;/tem:Apellido>
            &lt;tem:FechaNacimiento>1995-09-08T00:00:00&lt;/tem:FechaNacimiento>
            &lt;tem:Provincia>CABA&lt;/tem:Provincia>
            &lt;tem:Telefono>41231234&lt;/tem:Telefono>
            &lt;tem:Celular>1141231234&lt;/tem:Celular>
            &lt;tem:PaisDocumento>ARG&lt;/tem:PaisDocumento>
         &lt;/tem:contribuyente>
         &lt;tem:conceptos>
            &lt;tem:Concepto>
               &lt;tem:Codigo>07.02.28&lt;/tem:Codigo>
               &lt;tem:Descripcion>Solicitud de licencia de conductor Clases A, B, C, D, E y/o G&lt;/tem:Descripcion>
               &lt;tem:Cantidad>1&lt;/tem:Cantidad>
               &lt;tem:PrecioFijo>1&lt;/tem:PrecioFijo>
               &lt;tem:Importe>975&lt;/tem:Importe>
            &lt;/tem:Concepto>
         &lt;/tem:conceptos>
         &lt;tem:observacion>Prueba&lt;/tem:observacion>
         &lt;tem:user>duplicadossuaci&lt;/tem:user>
         &lt;tem:pass>duplicadossuaci&lt;/tem:pass>
         &lt;tem:idTramiteDependencia>Prueba&lt;/tem:idTramiteDependencia>
      &lt;/tem:GetToken>
   &lt;/soap:Body>
&lt;/soap:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>${DomainURL}/PagosService.asmx?WSDL</soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url_PEAPI</defaultValue>
      <description></description>
      <id>92307eb3-ee75-40e0-9d77-2274f1cc9a73</id>
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

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress>http://10.73.2.97:2486/PagosService.asmx?WSDL</wsdlAddress>
</WebServiceRequestEntity>
