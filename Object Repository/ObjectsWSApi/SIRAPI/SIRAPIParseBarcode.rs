<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SIRAPIParseBarcode</name>
   <tag></tag>
   <elementGuidId>076af548-ad3c-4dc4-8feb-fc97e4df5451</elementGuidId>
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
      <value>http://tempuri.org/IPaymentService/ParseBarcode</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml; charset=utf-8</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:tem=&quot;http://tempuri.org/&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;tem:ParseBarcode>
         &lt;tem:token>${token}&lt;/tem:token>
         &lt;tem:barcode>${barCode}&lt;/tem:barcode>
      &lt;/tem:ParseBarcode>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>${DomainURL}/SIRAPI/SIR.API.PaymentService.svc</soapServiceEndpoint>
   <soapServiceFunction>ParseBarcode</soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url_SIRAPI</defaultValue>
      <description></description>
      <id>644a8938-14b9-4c4a-8c37-b0b6a11d833d</id>
      <masked>false</masked>
      <name>DomainURL</name>
   </variables>
   <variables>
      <defaultValue>'591F66DD00CB41A3BC3C12A232580BA6070015334100001500000707214'</defaultValue>
      <description></description>
      <id>d8dcd17c-2743-4647-853b-6726f5b5fb3a</id>
      <masked>false</masked>
      <name>barCode</name>
   </variables>
   <variables>
      <defaultValue>'96335efa-1344-4fb5-91b9-ad4000f8ecf7'</defaultValue>
      <description></description>
      <id>00973125-96e6-49c6-8061-7763306eb398</id>
      <masked>false</masked>
      <name>token</name>
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




assertThat(response.getResponseText()).contains('Katalon Test Project')</verificationScript>
   <wsdlAddress>${DomainURL}/SIRAPI/SIR.API.PaymentService.svc?WSDL</wsdlAddress>
</WebServiceRequestEntity>
