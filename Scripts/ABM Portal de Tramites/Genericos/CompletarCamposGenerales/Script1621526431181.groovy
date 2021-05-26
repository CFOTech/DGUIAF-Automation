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

WebUI.click(findTestObject('ObjectsABMTramites/Page_Index/a_Tramites'))

WebUI.click(findTestObject('ObjectsABMTramites/Page_Index/a_CrearUnNuevoTramite'))

WebUI.setText(findTestObject('ObjectsABMTramites/Page_EditarTramite/inputTituloDelTramite'), tituloTramite)

WebUI.setText(findTestObject('ObjectsABMTramites/Page_EditarTramite/inputDescripcionDelTramite'), descTramite)

WebUI.setText(findTestObject('ObjectsABMTramites/Page_EditarTramite/inputMensaje'), mensaje)

WebUI.setText(findTestObject('ObjectsABMTramites/Page_EditarTramite/inputUsuario'), usuario)

WebUI.setText(findTestObject('ObjectsABMTramites/Page_EditarTramite/inputContrasenia'), pass)

estadoTramite = estadoTramite.toString().toLowerCase()

if (estadoTramite == 'activo') {
    WebUI.click(findTestObject('ObjectsABMTramites/Page_EditarTramite/btnActivo'))
} else {
    WebUI.click(findTestObject('ObjectsABMTramites/Page_EditarTramite/btnInactivo'))
}

redirecciona = redirecciona.toString().toLowerCase()

if (redirecciona == 'si') {
    WebUI.click(findTestObject('ObjectsABMTramites/Page_EditarTramite/btnSiRedirecciona'))
} else {
    WebUI.click(findTestObject('ObjectsABMTramites/Page_EditarTramite/btnNoRedirecciona'))
}

WebUI.selectOptionByLabel(findTestObject('ObjectsABMTramites/Page_EditarTramite/selectRubroTramite'), rubroTramite, false)

WebUI.selectOptionByLabel(findTestObject('ObjectsABMTramites/Page_EditarTramite/selectPaginaAsociada'), pagAsociada, false)

forzarEmisionBUI = forzarEmisionBUI.toString().toLowerCase()

if (forzarEmisionBUI == 'si') {
    WebUI.click(findTestObject('ObjectsABMTramites/Page_EditarTramite/btnSiForzar'))
	WebUI.selectOptionByLabel(findTestObject('ObjectsABMTramites/Page_EditarTramite/selectDependenciaEmisora'), dependenciaEmisora, false)
} else {
    WebUI.click(findTestObject('ObjectsABMTramites/Page_EditarTramite/btnNoForzar'))
}


