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
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFCellStyle as XSSFCellStyle
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook

def pathEjecucion = System.getProperty('user.dir')
def pathExcel = pathEjecucion + '\\Boletas.xlsx'
def pathRelativo = pathExcel.replace('\\', '\\\\')

FileInputStream fileInputPath = new FileInputStream(pathRelativo)
XSSFWorkbook workbook = new XSSFWorkbook(fileInputPath)
XSSFSheet sheet = workbook.getSheet('Creadas')

int cantBoletas = sheet.getLastRowNum()

WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/LoginAGIP'), [:], FailureHandling.STOP_ON_FAILURE)
def URLConIDdeLogueo = WebUI.getUrl()

for (int i = 1; i <= cantBoletas; i++) {
    def filaEstado = sheet.getRow(i).getCell(2).getStringCellValue()

    println(filaEstado)

    if (filaEstado == 'Creada') {
        String nroBoletaActual = sheet.getRow(i).getCell(0).getStringCellValue()

        println(nroBoletaActual)

		WebUI.callTestCase(findTestCase('Portal de Tramites/Genericos/PagarBUIConTarjetaCredito'), [('nroBoleta') : nroBoletaActual], FailureHandling.STOP_ON_FAILURE)

        sheet.getRow(i).createCell(2).setCellValue('Pagada')

        WebUI.navigateToUrl(URLConIDdeLogueo)

        WebUI.click(findTestObject('ObjectsPortal/btnINICIO'))
    }
}

WebUI.closeBrowser()

def date = new Date()
String fechaActual = date.format('dd-MM-yyyy')

pathExcelSalida = (((pathEjecucion + '\\BoletasPagadasCredito ') + fechaActual) + '.xlsx')

FileOutputStream fileOutputPath = new FileOutputStream(pathExcelSalida)
workbook.write(fileOutputPath)
fileOutputPath.close()

File excelConSoloBoletasCreadas = new File(pathRelativo)
excelConSoloBoletasCreadas.delete()



