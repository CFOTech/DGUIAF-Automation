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

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/00-ObjectsABMTramites/input_Descripcin_form-control ng-valid ng-dirty'), 
    5)

descripcion= findTestData('Tarifaria/TDTarifariaABMTramites').getObjectValue(1, 1).toString()

System.out.println("Descripcion tramite: "+ descripcion)

WebUI.setText(findTestObject('ObjectsPortal/00-ObjectsABMTramites/input_Descripcin_form-control ng-valid ng-dirty'), descripcion)

WebUI.waitForElementPresent(findTestObject('ObjectsPortal/00-ObjectsABMTramites/a_modificar'), 5)

WebUI.click(findTestObject('ObjectsPortal/00-ObjectsABMTramites/a_modificar'))

