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

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('ObjectsBUIWEB/userLogin'), 'jcarlos')

WebUI.sendKeys(findTestObject('ObjectsBUIWEB/passLogin'), 'automation1234')

//WebUI.waitForElementClickable(findTestObject('ObjectsBUIWEB/buttonLogin'), 3)

WebUI.click(findTestObject('ObjectsBUIWEB/buttonLogin'))


WebUI.waitForElementClickable(findTestObject('ObjectsBUIWEB/buttonGenerar'), 2)

//WebUI.verifyElementPresent('ObjectsBUIWEB/labelTodos', 2)

//WebUI.verifyElementClickable(findTestObject('ObjectsBUIWEB/buttonGenerar'), 2)


WebUI.click(findTestObject('ObjectsBUIWEB/buttonLogout'))

WebUI.closeBrowser()

