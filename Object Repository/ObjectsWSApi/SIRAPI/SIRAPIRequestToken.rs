<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SIRAPIRequestToken</name>
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
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>SOAPAction</name>
      <type>Main</type>
      <value>http://tempuri.org/IPaymentService/RequestToken</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml; charset=utf-8</value>
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
            &lt;sir:IpAddress>172.31.61.107&lt;/sir:IpAddress>
            &lt;!--Optional:-->
            &lt;sir:PosId>39065d50-8ebe-499f-8afc-39b466934248&lt;/sir:PosId>
            &lt;!--Optional:-->
            &lt;sir:PrinterNumber>0000&lt;/sir:PrinterNumber>
         &lt;/tem:posData>
         &lt;!--Optional:-->
         &lt;tem:user>pos489&lt;/tem:user>
         &lt;!--Optional:-->
         &lt;tem:pass>20170828489&lt;/tem:pass>
         &lt;!--Optional:-->
         &lt;tem:nroLegajo>440&lt;/tem:nroLegajo>
      &lt;/tem:RequestToken>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>${DomainURL}/SIRAPI/SIR.API.PaymentService.svc</soapServiceEndpoint>
   <soapServiceFunction>RequestToken</soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url_SIRAPI</defaultValue>
      <description></description>
      <id>db96df6f-ddde-4aaf-85c4-a84214a2b0db</id>
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
   <wsdlAddress>${DomainURL}/SIRAPI/SIR.API.PaymentService.svc?WSDL</wsdlAddress>
</WebServiceRequestEntity>
