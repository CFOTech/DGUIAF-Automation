<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SIRAPICommitPayment</name>
   <tag></tag>
   <elementGuidId>e18a2301-3364-401a-b796-ef3c2c2cf00b</elementGuidId>
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
         &lt;tem:token>0a2ebe09-dd5a-4f5f-8c73-ad3600d11adf&lt;/tem:token>
         &lt;tem:datosPago>
            &lt;sir:CantCuotas>3&lt;/sir:CantCuotas>
            &lt;sir:CodigoAutorizacion>12345678&lt;/sir:CodigoAutorizacion>
            &lt;sir:Conceptos>
               &lt;sir:Concepto>
                  &lt;sir:Barcode>3900B0A8A735451198400DDD9E243637030001626500000100002706217&lt;/sir:Barcode>
                  &lt;sir:Cantidad>3&lt;/sir:Cantidad>
                  &lt;sir:Codigo>03.04.03&lt;/sir:Codigo>
                  &lt;sir:Descripcion>Plan de Facilidades&lt;/sir:Descripcion>
                  &lt;sir:NroOT>0&lt;/sir:NroOT>
                  &lt;sir:TextoLey>Precios de acuerdo a la ley n° 6383&lt;/sir:TextoLey>
                  &lt;sir:Valor>100.00&lt;/sir:Valor>
               &lt;/sir:Concepto>
            &lt;/sir:Conceptos>
            &lt;sir:EstaAnulado>false&lt;/sir:EstaAnulado>
            &lt;sir:Fecha>2021-05-28T13:00:00&lt;/sir:Fecha>
            &lt;sir:MedioPago>Credito&lt;/sir:MedioPago>
            &lt;sir:Monto>100.00&lt;/sir:Monto>
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
