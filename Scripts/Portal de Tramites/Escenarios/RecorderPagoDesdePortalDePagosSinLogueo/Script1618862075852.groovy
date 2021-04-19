import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://sir-hml.dguiaf-gcba.gov.ar/Tramite/Conceptos?idSeguridad=087848be-fc5b-3642-9679-ba0a7209f1da&provider=MiBA")
selenium.click("link=Dirección General Defensa Civil (DGDCIV)")
selenium.click("link=Evaluación de Sistemas de Autoprotección")
selenium.click("id=btnContinuar")
selenium.click("id=btnContinuar")

WebUI.delay(5)

selenium.click("link=AQUÍ")

WebUI.delay(10)

selenium.click("id=MedioPago")

WebUI.delay(5)

selenium.click("id=btnPago")

WebUI.delay(2)
selenium.click("id=number")
selenium.type("id=number", "4507 9900 0000 4905")

WebUI.delay(2)
selenium.click("id=expiry")
selenium.type("id=expiry", "12 / 24")

WebUI.delay(2)
selenium.click("id=name")
selenium.type("id=name", "John Voltar")

WebUI.delay(2)
selenium.click("id=cvc")
selenium.type("id=cvc", "123")

selenium.click("id=btnRealizarPago")

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('null'), 'La transacción ha sido APROBADA / Transaction APPROVED')


