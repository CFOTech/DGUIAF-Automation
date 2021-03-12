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

WebUI.openBrowser('http://10.73.2.97:6748/WEB/Usuario/SignIn')

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ObjectsBUIWEB/userLogin'), 'jcarlos')

WebUI.setText(findTestObject('ObjectsBUIWEB/passLogin'), 'automation1234')

WebUI.click(findTestObject('ObjectsBUIWEB/buttonLogin'))

WebUI.waitForElementPresent(findTestObject('ObjectsBUIWEB/linkReportes'), 5)

WebUI.click(findTestObject('ObjectsBUIWEB/linkReportes'))

WebUI.click(findTestObject('ObjectsBUIWEB/btnPorNumero'))

WebUI.setText(findTestObject('ObjectsBUIWEB/fldNumeroBoleta'), '2119-00004790')

WebUI.click(findTestObject('ObjectsBUIWEB/btnBuscarReportes'))

WebUI.delay(5)

WebUI.closeBrowser()

