<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SIRAPICloseBatch</name>
   <tag></tag>
   <elementGuidId>a87da458-c0d4-4706-a7dc-e17b776835d4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>SOAPAction</name>
      <type>Main</type>
      <value>http://tempuri.org/IPaymentService/CloseBatch</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml; charset=utf-8</value>
   </httpHeaderProperties>
   <katalonVersion>7.9.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:tem=&quot;http://tempuri.org/&quot; xmlns:sir=&quot;http://schemas.datacontract.org/2004/07/SIR.API.DataContract.PaymentService&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;tem:CloseBatch>
         &lt;tem:token>gero et&lt;/tem:token>
         &lt;tem:datosCierre>
            &lt;sir:Fecha>2013-11-23T11:44:07&lt;/sir:Fecha>
            &lt;sir:NroLoteAmex>10&lt;/sir:NroLoteAmex>
            &lt;sir:NroLoteArgencard>10&lt;/sir:NroLoteArgencard>
            &lt;sir:NroLoteCabal>10&lt;/sir:NroLoteCabal>
            &lt;sir:NroLoteMaster>10&lt;/sir:NroLoteMaster>
            &lt;sir:NroLoteVisa>10&lt;/sir:NroLoteVisa>
            &lt;sir:NroTerminal>ventos tempestatesque&lt;/sir:NroTerminal>
            &lt;sir:NroZ>3&lt;/sir:NroZ>
            &lt;sir:Operaciones>
               &lt;sir:PaymentDataIn>
                  &lt;sir:CantCuotas>3&lt;/sir:CantCuotas>
                  &lt;sir:CodigoAutorizacion>temperat iras&lt;/sir:CodigoAutorizacion>
                  &lt;sir:Conceptos>
                     &lt;sir:Concepto>
                        &lt;sir:Barcode>turbine corripuit&lt;/sir:Barcode>
                        &lt;sir:Cantidad>3&lt;/sir:Cantidad>
                        &lt;sir:Codigo>regemque dedit&lt;/sir:Codigo>
                        &lt;sir:Descripcion>fremunt celsa&lt;/sir:Descripcion>
                        &lt;sir:NroOT>10&lt;/sir:NroOT>
                        &lt;sir:TextoLey>ferant rapidi&lt;/sir:TextoLey>
                        &lt;sir:Valor>1000.00&lt;/sir:Valor>
                     &lt;/sir:Concepto>
                  &lt;/sir:Conceptos>
                  &lt;sir:EstaAnulado>false&lt;/sir:EstaAnulado>
                  &lt;sir:Fecha>2009-10-14T04:16:36&lt;/sir:Fecha>
                  &lt;sir:MedioPago>flammato secum dea&lt;/sir:MedioPago>
                  &lt;sir:Monto>1000.00&lt;/sir:Monto>
                  &lt;sir:NroCbte>profundum quippe ferant&lt;/sir:NroCbte>
                  &lt;sir:NroComercio>nubibus ignem disiecitque&lt;/sir:NroComercio>
                  &lt;sir:NroLote>3&lt;/sir:NroLote>
                  &lt;sir:NroTarjeta>ac vinclis et&lt;/sir:NroTarjeta>
                  &lt;sir:NroTerminal>rapidum iaculata e&lt;/sir:NroTerminal>
                  &lt;sir:NroVoucher>caelumque profundum&lt;/sir:NroVoucher>
                  &lt;sir:Observacion>circum claustra&lt;/sir:Observacion>
                  &lt;sir:Tarjeta>coniunx una&lt;/sir:Tarjeta>
                  &lt;sir:TitularTarjeta>arce sceptra&lt;/sir:TitularTarjeta>
               &lt;/sir:PaymentDataIn>
            &lt;/sir:Operaciones>
            &lt;sir:TotalAmexCredito>1000.00&lt;/sir:TotalAmexCredito>
            &lt;sir:TotalAmexDebito>1000.00&lt;/sir:TotalAmexDebito>
            &lt;sir:TotalArgencardCredito>1000.00&lt;/sir:TotalArgencardCredito>
            &lt;sir:TotalCabalCredito>1000.00&lt;/sir:TotalCabalCredito>
            &lt;sir:TotalCabalDebito>1000.00&lt;/sir:TotalCabalDebito>
            &lt;sir:TotalCheque>1000.00&lt;/sir:TotalCheque>
            &lt;sir:TotalEfectivo>1000.00&lt;/sir:TotalEfectivo>
            &lt;sir:TotalMasterCredito>1000.00&lt;/sir:TotalMasterCredito>
            &lt;sir:TotalMasterDebito>1000.00&lt;/sir:TotalMasterDebito>
            &lt;sir:TotalRapipago>1000.00&lt;/sir:TotalRapipago>
            &lt;sir:TotalVisaCredito>1000.00&lt;/sir:TotalVisaCredito>
            &lt;sir:TotalVisaDebito>1000.00&lt;/sir:TotalVisaDebito>
         &lt;/tem:datosCierre>
      &lt;/tem:CloseBatch>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>${DomainURL}/SIRAPI/SIR.API.PaymentService.svc</soapServiceEndpoint>
   <soapServiceFunction>CloseBatch</soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.url_SIRAPI</defaultValue>
      <description></description>
      <id>6e0b3935-57a0-46ce-af23-7e855ee9edc1</id>
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
