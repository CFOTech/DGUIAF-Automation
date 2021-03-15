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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url_BackOffice)

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('ObjectsBackOffice/inputLoginUser'), GlobalVariable.user)

WebUI.sendKeys(findTestObject('ObjectsBackOffice/inputLoginPass'), GlobalVariable.password)

WebUI.waitForElementPresent(findTestObject('ObjectsBackOffice/buttonLogin'), 5)

WebUI.click(findTestObject('ObjectsBackOffice/buttonLogin'))

WebUI.waitForElementClickable(findTestObject('ObjectsBackOffice/menuReportes'), 5)

WebUI.click(findTestObject('ObjectsBackOffice/menuReportes'))

WebUI.click(findTestObject('ObjectsBackOffice/menuReportesConsultaRecaudaciones'))

WebUI.verifyElementPresent(findTestObject('ObjectsBackOffice/buttonBuscarConsultaRecaudaciones'), 5)

WebUI.verifyElementPresent(findTestObject('ObjectsBackOffice/buttonLogout'), 5)

WebUI.click(findTestObject('ObjectsBackOffice/buttonLogout'))

WebUI.closeBrowser()

