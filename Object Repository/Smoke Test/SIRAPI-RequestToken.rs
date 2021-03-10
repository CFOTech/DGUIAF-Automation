<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SIRAPI-RequestToken</name>
   <tag></tag>
   <elementGuidId>c4508e1e-612c-42ff-a7b2-47401267f421</elementGuidId>
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
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic amNhcmxvczphdXRvbWF0aW9uMTIzNA==</value>
   </httpHeaderProperties>
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
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:tem=&quot;http://tempuri.org/&quot; xmlns:sir=&quot;http://schemas.datacontract.org/2004/07/SIR.API.DataContract.PaymentService&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;tem:RequestToken>
         &lt;!--Optional:-->
         &lt;tem:posData>
            &lt;!--Optional:-->
            &lt;sir:IpAddress>0.0.0.0&lt;/sir:IpAddress>
            &lt;!--Optional:-->
            &lt;sir:PosId>00000000-0000-0000-0000-000000000001&lt;/sir:PosId>
            &lt;!--Optional:-->
            &lt;sir:PrinterNumber>0&lt;/sir:PrinterNumber>
         &lt;/tem:posData>
         &lt;!--Optional:-->
         &lt;tem:user>jcarlos&lt;/tem:user>
         &lt;!--Optional:-->
         &lt;tem:pass>automation1234&lt;/tem:pass>
         &lt;!--Optional:-->
         &lt;tem:nroLegajo>30123456&lt;/tem:nroLegajo>
      &lt;/tem:RequestToken>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>http://10.73.2.97:1040/SIR.API.PaymentService.svc?WDSL</soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress>http://10.73.2.97:1040/SIR.API.PaymentService.svc</wsdlAddress>
</WebServiceRequestEntity>
