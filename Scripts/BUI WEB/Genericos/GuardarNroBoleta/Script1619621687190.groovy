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
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.FileOutputStream as FileOutputStream
import java.io.IOException as IOException
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle as XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String
import java.util.Date as Date

def msjBoletaGuardada = WebUI.getText(findTestObject('ObjectsBUIWEB/textElementLegajo'))

def nroBoleta = msjBoletaGuardada.substring(12, 25)
println(nroBoleta)

def pathEjecucion = System.getProperty("user.dir") 
def pathExcel = pathEjecucion + '\\Boletas.xlsx'
def pathRelativo = pathExcel.replace('\\','\\\\')

FileInputStream fileInputPath = new FileInputStream(pathRelativo)
XSSFWorkbook workbook = new XSSFWorkbook(fileInputPath)
XSSFSheet sheet = workbook.getSheet('Creadas')

int cantFilas = sheet.getLastRowNum()
int proximaFilaVacia = cantFilas + 1

sheet.createRow(proximaFilaVacia)
sheet.getRow(proximaFilaVacia).createCell(0).setCellValue(nroBoleta)

//Obtengo fecha del dia de hoy 
def date = new Date()
String fechaHOY = date.format('dd/MM/yyyy')
sheet.getRow(proximaFilaVacia).createCell(1).setCellValue(fechaHOY)

FileOutputStream fileOutputPath = new FileOutputStream(pathRelativo)
workbook.write(fileOutputPath)
fileOutputPath.close()

