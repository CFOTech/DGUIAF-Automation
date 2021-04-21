<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PEAPIGetTokenBui</name>
   <tag></tag>
   <elementGuidId>b00ca1ab-9433-4751-bbb5-917fd07b26d7</elementGuidId>
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
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>	&lt;soap:Envelope xmlns:soap=&quot;http://www.w3.org/2003/05/soap-envelope&quot; xmlns:tem=&quot;http://tempuri.org/&quot;>
   &lt;soap:Header/>
   &lt;soap:Body>
      &lt;tem:GetTokenBUI>
         &lt;tem:buId>${buiId}&lt;/tem:buId>
         &lt;!--Optional:-->
         &lt;tem:user>jcarlos&lt;/tem:user>
         &lt;!--Optional:-->
         &lt;tem:pass>automation1234&lt;/tem:pass>
         &lt;tem:idMiBA>BEB8CEEC272C418F96717B08EFEB8676&lt;/tem:idMiBA>
      &lt;/tem:GetTokenBUI>
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
      <defaultValue>'a8de8139-defd-44ae-bdc0-cf6ccca18d2f'</defaultValue>
      <description></description>
      <id>fea4cc9d-b9f1-4968-a1eb-06473cad0347</id>
      <masked>false</masked>
      <name>buiId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.url_PEAPI</defaultValue>
      <description></description>
      <id>f8851d02-ebba-4743-b69a-9d578a7ad1ce</id>
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
