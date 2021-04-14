<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PE API - GetToken sin datos de Suaci</name>
   <tag></tag>
   <elementGuidId>ba255122-3923-4dcf-9a4a-d8b4d7b2348f</elementGuidId>
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
         &lt;!--Optional:-->
         &lt;tem:contribuyente>
            &lt;!--Optional:-->
            &lt;tem:TipoPersona>Fisica&lt;/tem:TipoPersona>
            &lt;!--Optional:-->
            &lt;tem:TipoDoc>DNI&lt;/tem:TipoDoc>
            &lt;!--Optional:-->
            &lt;tem:ApellidoyNombre>Fer&lt;/tem:ApellidoyNombre>
            &lt;!--Optional:-->
            &lt;tem:Documento>33222222&lt;/tem:Documento>
            &lt;!--Optional:-->
            &lt;tem:Direccion>Dir&lt;/tem:Direccion>
            &lt;!--Optional:-->
            &lt;tem:Piso>1&lt;/tem:Piso>
            &lt;!--Optional:-->
            &lt;tem:Depto>1&lt;/tem:Depto>
            &lt;!--Optional:-->
            &lt;tem:Localidad>Capital Federal&lt;/tem:Localidad>
            &lt;!--Optional:-->
            &lt;tem:CodPost>1407&lt;/tem:CodPost>
            &lt;!--Optional:-->
            &lt;tem:Email>a@a.com&lt;/tem:Email>
         &lt;/tem:contribuyente>
         &lt;!--Optional:-->
        &lt;tem:conceptos>
            &lt;!--Zero or more repetitions:-->
                   &lt;tem:Concepto>
               &lt;!--Optional:-->
               &lt;tem:Codigo>07.02.28&lt;/tem:Codigo>-->
               &lt;!--Optional:-->
               &lt;tem:Descripcion>Habilit/formación de cond. vehic. Otorgam, renov. con ampl., renov., canje, duplicado y dup. a dist. de lic. de conducir&lt;/tem:Descripcion>
               &lt;tem:Cantidad>1&lt;/tem:Cantidad>
                &lt;tem:PrecioFijo>0&lt;/tem:PrecioFijo>
               &lt;tem:Importe>1000&lt;/tem:Importe>
            &lt;/tem:Concepto>                                             
                    &lt;/tem:conceptos>
         &lt;!--Optional:-->
         &lt;tem:observacion>la observación para pruebas de QA&lt;/tem:observacion>
         &lt;!--Optional:-->
         &lt;tem:user>licenciasPE&lt;/tem:user>
         &lt;!--Optional:-->
         &lt;tem:pass>l1c3nc14S&lt;/tem:pass>
         &lt;!--Optional:-->
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
      <id>4dd6ee62-4cd5-4680-a832-c8bb9e4c6fcf</id>
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
