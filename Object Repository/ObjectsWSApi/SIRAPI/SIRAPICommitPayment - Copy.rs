<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SIRAPICommitPayment - Copy</name>
   <tag></tag>
   <elementGuidId>6b673952-9a2b-429f-bccd-fe5c0c3b5224</elementGuidId>
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
      <value>http://tempuri.org/IPaymentService/CommitPayment</value>
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
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:tem=&quot;http://tempuri.org/&quot; xmlns:sir=&quot;http://schemas.datacontract.org/2004/07/SIR.API.DataContract.PaymentService&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;tem:CommitPayment>
         &lt;tem:token>${token}&lt;/tem:token>
         &lt;tem:datosPago>
            &lt;sir:CantCuotas>3&lt;/sir:CantCuotas>
            &lt;sir:CodigoAutorizacion>12345678&lt;/sir:CodigoAutorizacion>
            ${Conceptos}
            &lt;sir:EstaAnulado>false&lt;/sir:EstaAnulado>
            &lt;sir:Fecha>2021-05-28T13:00:00&lt;/sir:Fecha>
            &lt;sir:MedioPago>Credito&lt;/sir:MedioPago>
            &lt;sir:Monto>${Monto}&lt;/sir:Monto>
            &lt;sir:NroCbte>96456385&lt;/sir:NroCbte>
            &lt;sir:NroVoucher>96456385&lt;/sir:NroVoucher>
            &lt;sir:Observacion>Prueba QA Automation&lt;/sir:Observacion>
            &lt;sir:Tarjeta>Visa&lt;/sir:Tarjeta>
            &lt;sir:TitularTarjeta>Juan Perez&lt;/sir:TitularTarjeta>
         &lt;/tem:datosPago>
      &lt;/tem:CommitPayment>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>${DomainURL}/SIRAPI/SIR.API.PaymentService.svc</soapServiceEndpoint>
   <soapServiceFunction>CommitPayment</soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url_SIRAPI</defaultValue>
      <description></description>
      <id>454a1241-99e4-4cb5-b8ed-decb485db007</id>
      <masked>false</masked>
      <name>DomainURL</name>
   </variables>
   <variables>
      <defaultValue>'&lt;>'</defaultValue>
      <description></description>
      <id>fa8f6574-670c-4aed-a660-511c5133b1a0</id>
      <masked>false</masked>
      <name>Conceptos</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>efdd4950-cdd2-4bc3-884a-9e646396ff25</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <variables>
      <defaultValue>'d'</defaultValue>
      <description></description>
      <id>ae4ab85c-655f-4b1a-8adb-4d884efddd8b</id>
      <masked>false</masked>
      <name>Monto</name>
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
   <wsdlAddress>${DomainURL}/SIRAPI/SIR.API.PaymentService.svc?WSDL</wsdlAddress>
</WebServiceRequestEntity>
