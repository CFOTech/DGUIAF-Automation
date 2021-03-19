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

WebUI.openBrowser(GlobalVariable.url_BUIWEB)

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ObjectsBUIWEB/userLogin'), GlobalVariable.user)

WebUI.setText(findTestObject('ObjectsBUIWEB/passLogin'), GlobalVariable.password)

WebUI.click(findTestObject('ObjectsBUIWEB/buttonLogin'))

WebUI.click(findTestObject('ObjectsBUIWEB/menuReportes'))

WebUI.click(findTestObject('ObjectsBUIWEB/btnListado'))

WebUI.click(findTestObject('ObjectsBUIWEB/ddlDependencia'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjectsBUIWEB/optionDependencia'))

//new_value =findTestObject('ObjectsBUIWEB/optionDependencia', [('nombreDependencia') : dependencia])
//WebUI.click(findTestObject(new_value))
WebUI.setText(findTestObject('ObjectsBUIWEB/fldFechaDesde'), '01/03/2021')

WebUI.setText(findTestObject('ObjectsBUIWEB/fldFechaHasta'), '10/03/2021')

WebUI.setText(findTestObject('ObjectsBUIWEB/fldNumero'), '2102-00005469')

WebUI.click(findTestObject('ObjectsBUIWEB/btnBuscarListado'))

WebUI.click(findTestObject('ObjectsBUIWEB/gridResultado'))

WebUI.delay(3)

WebUI.closeBrowser()

