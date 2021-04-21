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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_Home Page/menuReportes'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_InformeZ/optionInforme Z'))

WebUI.sendKeys(findTestObject('ObjectsBackOffice/00-Page_InformeZ/inputFecha'), fecha)

WebUI.sendKeys(findTestObject('ObjectsBackOffice/00-Page_InformeZ/inputFecha'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_InformeZ/dropdownPos'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_InformeZ/liPos', [('pos') : pos]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_InformeZ/dropdownCajero'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_InformeZ/liCajero', [('cajero') : cajero]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_InformeZ/dropdownNroZ'))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_InformeZ/liNroZ', [('nroz') : nroz]))

WebUI.click(findTestObject('ObjectsBackOffice/00-Page_InformeZ/btnVistaPrevia'))

