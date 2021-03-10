<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PE API - GetTokenBUI PE</name>
   <tag></tag>
   <elementGuidId>4e5808d0-b71b-4881-9372-5eb3219bf8a8</elementGuidId>
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
      &lt;tem:GetTokenBUIPE>
         &lt;tem:buId>e6a99365-054d-497f-88a2-09ca988cff9b&lt;/tem:buId>
         &lt;!--Optional:-->
         &lt;tem:user>jcarlos&lt;/tem:user>
         &lt;!--Optional:-->
         &lt;tem:pass>automation1234&lt;/tem:pass>
         &lt;tem:idMiBA>BEB8CEEC272C418F96717B08EFEB8676&lt;/tem:idMiBA>
      &lt;/tem:GetTokenBUIPE>
   &lt;/soap:Body>
&lt;/soap:Envelope>
</soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>${DomainURL}/PagosService.asmx?WSDL</soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url_PEAPI</defaultValue>
      <description></description>
      <id>2b744e95-2f9d-455c-9214-3563269808ae</id>
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
