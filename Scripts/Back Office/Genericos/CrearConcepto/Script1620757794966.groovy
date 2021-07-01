import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import adicionales.Web as Web

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/menuAdministracion'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/optionConceptos'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Conceptos/btnNuevo'))

if (periodoTarifaria != '') {
    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/ddPeriodoTarifaria'))

    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/liPeriodoTarifaria', [('periodoTarifaria') : periodoTarifaria]))
}

if (normativaAprobatoria != '') {
    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/ddNormativaAprobatoria'))

    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/liNormativaAprobatoria', [('normativaAprobatoria') : normativaAprobatoria]))
}

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputNormativaNro'), nro)

if (sigla != '') {
    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/ddSigla'))

    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/liSigla', [('sigla') : sigla]))
}

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputNormativaAnio'), anio)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputFechaPublicacion'), fechaPublicacion)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputCod1'), cod1)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputCod2'), cod2)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputCod3'), cod3)

if (estado != '') {
    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/ddEstado'))

    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/liEstado', [('estado') : estado]))
}

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputDescripcion'), descripcion)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputRenglon1'), renglon1)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputRenglon2'), renglon2)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputRenglon3'), renglon3)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputRenglon4'), renglon4)

if (agenciaAsignada != '') {
    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/ddAgenciaAsignada'))

    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/liAgenciaAsignada', [('agenciaAsignada') : agenciaAsignada]))

    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/ddAgenciaAsignada'))
}

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputValor'), valor)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkEsRedondeable'), 
    esRedondeable)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkTienePrecioFijo'), 
    tienePrecioFijo)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkCantidadVariable'), 
    cantVariable)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkEsDevolucion'), 
    esDevolucion)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkPermiteIngresoManual'), 
    permiteIngresoManual)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputTimbres'), timbres)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkRequiereTimbre'), 
    requiereTimbre)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputDiasDeAnulacion'), diasDeAnulacion)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkEsCompartido'), 
    esCompartido)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkEsRecibo'), esRecibo)

CustomKeywords.'adicionales.Web.checkOnoCheck'(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/chkEsSerializado'), 
    esSerializado)

WebUI.setText(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/inputInformaWS'), informaWS)

if (tipoDeStock != '') {
    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/ddTipoDeStock'))

    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/liTipoDeStock', [('tipoDeStock') : tipoDeStock]))
}

if (tipo != '') {
    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/ddTipo'))

    WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/liTipo', [('tipo') : tipo]))
}

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Nuevo Concepto/btnCrear'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Nueva Agencia/p_Grabado Exitoso'),15)

WebUI.click(findTestObject('Object Repository/Page_Nueva Agencia/span_SIR - BackOffice_ui-button-icon-primar_11d6ba'))

