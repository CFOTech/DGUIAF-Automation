import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.sql.ResultSet
import java.sql.CallableStatement
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.sql.SQLException
import com.katalon.org.apache.commons.io.FileUtils
import internal.GlobalVariable



/**********************************************************************************
**		RECORDAR DESACTIVAR STEPS DEL LOG VIEWER ANTES DE EJECUTAR:			     **
**		Project -> Settings -> Execution -> Log executed test steps -> Disable   **
***********************************************************************************/

//Obtencion de fecha actual para usar en registro cabeza y nombre de archivo
def date = new Date()
String fechaHOY = date.format('ddMMYY')

//Definicion del path de ejecucion para crear el archivo de rendicion en la misma carpeta de katalon
def pathEjecucion = System.getProperty("user.dir")
def pathTxt = pathEjecucion + '\\txt\\RENDBCBA029'+ fechaHOY +'.txt'
def pathRelativo = pathTxt.replace('\\','\\\\')
println(pathRelativo)
Path pathArchivoRendicion = Paths.get(pathRelativo)

//Limpia la carpeta txt antes de ejecutar
File directorioTxt = new File(pathEjecucion + '\\txt')
FileUtils.cleanDirectory(directorioTxt)

//Conexion a la db de homologacion
CustomKeywords.'baseDeDatos.oracleSQL.conectarDB'(GlobalVariable.bd_host, GlobalVariable.bd_nombre_servicio, GlobalVariable.bd_puerto,GlobalVariable.bd_usuario, GlobalVariable.bd_pass)
//Creacion de query en formato string para luego ejecutarla, el resultado se guarda en un objeto ResultSet para su manipulacion
def queryBCiudad = obtenerQueryBoletasCreadas()
println("Query para obtener boletas creadas:\n-> " + queryBCiudad )
ResultSet resultadoQueryBoletas = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(queryBCiudad)

def queryCantidadYSuma = obtenerQueryCantYSumaDeBoletasCreadas()
println("Query para obtener cantidad y suma de montos:\n-> " + queryCantidadYSuma)
ResultSet resultadoCantYSuma = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(queryCantidadYSuma)


//Armado de registro cabeza
fechaHOY = date.format('yyMMdd')
def stringCabecera = '01029-BCBA          '+ fechaHOY +'00RENDICION A EMPRESAS RISC'
Files.write(pathArchivoRendicion, (stringCabecera + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.CREATE)

//Armado de lote dependencia recaudadora
def nroDependencia = '610'
def nroLote = '000820'
def marcaProceso = '1'
def filler32 = new String(new char[32]).replace('\0', ' ')
def importeComisiones = '00000000000'
def marcaGrabacion = '0'
def nroCuenta = '0002005423'
def codTransaccion = '6010'
def codIntegrador = '0001'

//Armado de lote tipo de pago y fecha
//Revisar fecha, en ejemplos esta con ceros
def tipoPago = '00' //Efectivo

//Armado registro detalle
def nroComprobante = '0000000000' //Preguntar si puede ser aleatorio
def filler52 = new String(new char[52]).replace('\0', ' ')

HashMap<String, Integer> mapImporteTotal = new HashMap<String, Integer>()
HashMap<String, Integer> mapCantTalones = new HashMap<String, Integer>()
while(resultadoCantYSuma.next()) {
	def nombreDependencia = resultadoCantYSuma.getNString("nombre")
	def montoTotal = resultadoCantYSuma.getNString("TotalDependencia")
	def contBoletas = resultadoCantYSuma.getNString("ContadorBoletas")
	mapCantTalones.put(nombreDependencia, contBoletas)
	mapImporteTotal.put(nombreDependencia, montoTotal)
}

Multimap<String, String> mapDetalleRegistros = HashMultimap.create()

while(resultadoQueryBoletas.next()) {
	def nombreDependencia = resultadoQueryBoletas.getNString("NOMBRE")
	def CodBarras = resultadoQueryBoletas.getNString("CODBARRAS")
	def importeBoleta = resultadoQueryBoletas.getNString("TOTAL")
	if(importeBoleta.contains(".")) importeBoleta = importeBoleta.replaceAll("\\.", "")
	else importeBoleta = importeBoleta + "00"
	if(importeBoleta.contains(" ")) importeBoleta = importeBoleta.replaceAll(" ", "0")
	importeBoleta = String.format("%013d", Integer.parseInt(importeBoleta))
	def stringDetalleRegistro = '12'+ nroDependencia + '0900' + fechaHOY + nroLote + fechaHOY + marcaProceso + tipoPago + '0' + '0' + '000' + CodBarras + ' ' + importeBoleta + nroComprobante + '000' + codIntegrador
	mapDetalleRegistros.put(nombreDependencia,stringDetalleRegistro)
		
}

Collection<String> dependencias = mapDetalleRegistros.keySet()
for (String dependenciaActual : dependencias) {
	def denCodIntegrador = dependenciaActual.toUpperCase().substring(0,12)
	def cantTalones = mapCantTalones.get(dependenciaActual)
	cantTalones = String.format("%06d", Integer.parseInt(cantTalones))
	def importeTotal = mapImporteTotal.get(dependenciaActual)
	if(importeTotal.contains(".")) importeTotal = importeTotal.replaceAll("\\.", "")
	else importeTotal = importeTotal + "00"
	importeTotal = String.format("%017d", Integer.parseInt(importeTotal))
	
	def stringDependencia = '10'+ nroDependencia +'0000000000'+ nroLote + fechaHOY + marcaProceso +importeTotal + importeComisiones + cantTalones + denCodIntegrador + marcaGrabacion + nroCuenta + filler32 + codTransaccion + codIntegrador
	def stringTipoDePago = '11'+ nroDependencia +'0900'+ fechaHOY + nroLote + fechaHOY + marcaProceso + tipoPago + '0' + importeTotal + importeComisiones + cantTalones+ filler52 + codTransaccion + codIntegrador
	Files.write(pathArchivoRendicion, (stringDependencia + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND)
	Files.write(pathArchivoRendicion, (stringTipoDePago + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND)
	
	Collection<String> loteBoletas = mapDetalleRegistros.get(dependenciaActual)
	for(String boleta : loteBoletas){
		Files.write(pathArchivoRendicion, (boleta + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND)
	}
}
//Como ultimo paso se cierra la conexion a la db
CustomKeywords.'baseDeDatos.oracleSQL.cerrarConexionDB'()


//METODOS AUXILIARES

public static String obtenerQueryBoletasCreadas() {
	def sheet = obtenerExcelDeBoletas()
	int cantBoletas = sheet.getLastRowNum()
	int ultimaBoletaEnElExcel = cantBoletas.intValue()
	
	StringBuilder nroDeBoletas = new StringBuilder("SELECT bu.boleta.fecha, bu.boleta.NUMERO, bu.boleta.ESTADO, to_char(bu.boleta.total,'99999999.99') as TOTAL, bu.boleta.CODBARRAS, bu.boleta.DEPENDENCIAID,  sir.dependencia.nombre, sir.dependencia.codigo FROM bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid= sir.dependencia.id WHERE bu.boleta.estado = '1' and bu.boleta.numero IN (")
	for (int i = 1; i <= cantBoletas; i++) {
		String nroBoletaActual = sheet.getRow(i).getCell(0).getStringCellValue()
		if (i == ultimaBoletaEnElExcel) {
			nroDeBoletas.append("'" + nroBoletaActual + "') order by bu.boleta.fecha")
		}
		else {
			nroDeBoletas.append("'" + nroBoletaActual + "',")
		}
	}
	return nroDeBoletas
}

public static String obtenerQueryCantYSumaDeBoletasCreadas() {
	def sheet = obtenerExcelDeBoletas()
	int cantBoletas = sheet.getLastRowNum()
	int ultimaBoletaEnElExcel = cantBoletas.intValue()
	
	StringBuilder nroDeBoletas = new StringBuilder("SELECT SIR.dependencia.nombre AS NOMBRE, SUM (bu.boleta.total) AS TotalDependencia, count (bu.boleta.total) AS ContadorBoletas  from bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid = sir.dependencia.id WHERE bu.boleta.estado = '1' and bu.boleta.numero IN (")
	for (int i = 1; i <= cantBoletas; i++) {
			String nroBoletaActual = sheet.getRow(i).getCell(0).getStringCellValue()
			if (i == ultimaBoletaEnElExcel) {
				nroDeBoletas.append("'" + nroBoletaActual + "') GROUP BY SIR.dependencia.nombre")
			}
			else {
				nroDeBoletas.append("'" + nroBoletaActual + "',")
			}
	}
	return nroDeBoletas
}


public static obtenerExcelDeBoletas() {
	def pathEjecucion = System.getProperty('user.dir')
	def pathExcel = pathEjecucion + '\\Boletas.xlsx'
	def pathRelativo = pathExcel.replace('\\', '\\\\')
	
	FileInputStream fileInputPath = new FileInputStream(pathRelativo)
	XSSFWorkbook workbook = new XSSFWorkbook(fileInputPath)
	XSSFSheet sheet = workbook.getSheet('Creadas')
	return sheet
}

