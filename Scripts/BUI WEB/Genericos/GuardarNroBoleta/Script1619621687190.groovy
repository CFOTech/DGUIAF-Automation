import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.apache.poi.hssf.usermodel.HSSFSheet
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFSheet

def msjBoletaGuardada = WebUI.getText(findTestObject('ObjectsBUIWEB/textElementLegajo'))

def nroBoleta = msjBoletaGuardada.replaceAll("[^0-9-]","")
println(nroBoleta)

/*COMPLETAR CUANDO PIDAMOS ACCESO A TODAS LAS DB
CustomKeywords.'baseDeDatos.oracleSQL.conectarDB'('ORADB11', 'SIRH', '1521','JSIEBENBERG', 'JSIEBENBERG$$2021')

def queryDataDeBoleta = "select * from bu.boleta where numero = '"+ nroBoleta +"'"
ResultSet resultadoQueryBoleta = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(queryDataDeBoleta)
resultadoQueryBoleta.next()
def dependenciaId = resultadoQueryBoleta.getNString('DEPENDENCIAID')

def queryNombreDependencia = "select nombre from sir.dependencia where id  = '"+ dependenciaId +"'"
ResultSet resultadoQueryDependencia = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(queryNombreDependencia)
resultadoQueryDependencia.next()
def nombreDependencia = resultadoQueryDependencia.getNString('NOMBRE')

CustomKeywords.'baseDeDatos.oracleSQL.cerrarConexionDB'()
*/

def pathEjecucion = System.getProperty("user.dir")
def pathExcel = pathEjecucion + '\\Boletas.xlsx'
def pathRelativo = pathExcel.replace('\\','\\\\')

File excelBoletas = new File(pathExcel)
if( !excelBoletas.exists()) {
	XSSFWorkbook workbook = new XSSFWorkbook()
	XSSFSheet sheet = workbook.createSheet("Creadas")
	Row rowCabecera = sheet.createRow(0)
	Cell celdaNroBoleta = rowCabecera.createCell(0).setCellValue("Nro Boleta")
	Cell celdaFecha = rowCabecera.createCell(1).setCellValue("Fecha de creacion")
	Cell celfaEstado = rowCabecera.createCell(2).setCellValue("Estado")
		try {
			FileOutputStream out =
					new FileOutputStream(new File(pathExcel))
			workbook.write(out)
			out.close()
			System.out.println("Excel written successfully..")
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}

FileInputStream fileInputPath = new FileInputStream(pathRelativo)
XSSFWorkbook wbook = new XSSFWorkbook(fileInputPath)
XSSFSheet sheetBoletasCreadas = wbook.getSheet('Creadas')

int cantFilas = sheetBoletasCreadas.getLastRowNum()
int proximaFilaVacia = cantFilas + 1

sheetBoletasCreadas.createRow(proximaFilaVacia)
sheetBoletasCreadas.getRow(proximaFilaVacia).createCell(0).setCellValue(nroBoleta)

def date = new Date()
String fechaHOY = date.format('dd/MM/yyyy')
sheetBoletasCreadas.getRow(proximaFilaVacia).createCell(1).setCellValue(fechaHOY)
sheetBoletasCreadas.getRow(proximaFilaVacia).createCell(2).setCellValue('Creada')

/* DESCOMENTAR CUANDO TENGAMOS ACCESO A TODAS LAS DB
sheet.getRow(proximaFilaVacia).createCell(2).setCellValue(nombreDependencia)
sheet.getRow(proximaFilaVacia).createCell(3).setCellValue(dependenciaId)
*/

FileOutputStream fileOutputPath = new FileOutputStream(pathRelativo)
wbook.write(fileOutputPath)
fileOutputPath.close()