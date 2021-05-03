<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>BUIAPIGetToken</name>
   <tag></tag>
   <elementGuidId>047b4c59-a0f1-49f7-af7f-cd4af7e17011</elementGuidId>
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
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>utf-8</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.1</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soap:Envelope xmlns:soap=&quot;http://www.w3.org/2003/05/soap-envelope&quot; xmlns:tem=&quot;http://tempuri.org/&quot;>
   &lt;soap:Header/>
   &lt;soap:Body>
      &lt;tem:GetTokenBUI>
         &lt;tem:buId>${buiId}&lt;/tem:buId>
        &lt;!-- &lt;tem:buId>38c122ad-4e6b-4024-925a-21a4193ad16f&lt;/tem:buId>-->
         &lt;!--Optional:-->
         &lt;tem:user>jcarlos&lt;/tem:user>
         &lt;!--Optional:-->
         &lt;tem:pass>automation1234&lt;/tem:pass>
      &lt;/tem:GetTokenBUI>
   &lt;/soap:Body>
&lt;/soap:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>${DomainURL}/PagosService.asmx?WSDL</soapServiceEndpoint>
   <soapServiceFunction>GetConceptos</soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url_PEAPI</defaultValue>
      <description></description>
      <id>d763cec3-94e6-4edc-8537-06e98a356d9b</id>
      <masked>false</masked>
      <name>DomainURL</name>
   </variables>
   <variables>
      <defaultValue>'69431614-3fd2-435f-89df-01f052944607'</defaultValue>
      <description></description>
      <id>f469e16b-3460-4e0b-a6e5-a333d02219e7</id>
      <masked>false</masked>
      <name>buiId</name>
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
   <wsdlAddress>${DomainURL}/PagosService.asmx?WSDL</wsdlAddress>
</WebServiceRequestEntity>
