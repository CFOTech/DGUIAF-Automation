import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.sql.ResultSet


/**********************************************************************************
**		RECORDAR DESACTIVAR STEPS DEL LOG VIEWER ANTES DE EJECUTAR:			     **
**		Project -> Settings -> Execution -> Log executed test steps -> Disable   **
***********************************************************************************/

//Obtencion de fecha actual para usar en registro cabeza y nombre de archivo
def date = new Date()
String fechaHOY = date.format('ddMMYY')

//Definicion del path de ejecucion para crear el archivo de rendicion en la misma carpeta de katalon
def pathEjecucion = System.getProperty("user.dir")
def pathTxt = pathEjecucion + '\\RENDBCBA029'+ fechaHOY +'.txt'
def pathRelativo = pathTxt.replace('\\','\\\\')
println(pathRelativo)
Path pathArchivoRendicion = Paths.get(pathRelativo)

//Conexion a la db de homologacion
CustomKeywords.'baseDeDatos.oracleSQL.conectarDB'('ORADB11', 'SIRH', '1521','JSIEBENBERG', 'JSIEBENBERG$$2021')
//Creacion de query en formato string para luego ejecutarla, el resultado se guarda en un objeto ResultSet para facilitar su manipulacion
def queryBCiudad = "SELECT bu.boleta.NUMERO, bu.boleta.ESTADO, to_char(bu.boleta.total,'99999999.99') as TOTAL, bu.boleta.CODBARRAS, bu.boleta.DEPENDENCIAID,  sir.dependencia.nombre, sir.dependencia.codigo FROM bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid= sir.dependencia.id WHERE bu.boleta.estado = '1' order by sir.dependencia.codigo"
ResultSet resultadoQuery = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(queryBCiudad)

def querySumaTotal = "SELECT SIR.dependencia.codigo AS codigo, SUM (bu.boleta.total) AS TotalDependencia from bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid= sir.dependencia.id WHERE bu.boleta.estado = '1' GROUP BY SIR.dependencia.codigo"
ResultSet resultadoSuma = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(querySumaTotal)

def queryContador = "SELECT SIR.dependencia.codigo AS codigo, count (bu.boleta.total) AS ContadorBoletas from bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid= sir.dependencia.id WHERE bu.boleta.estado = '1' GROUP BY SIR.dependencia.codigo"
ResultSet resultadoContador = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(queryContador)

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

HashMap<Integer, Integer> mapImporteTotal = new HashMap<Integer, Integer>()
while(resultadoSuma.next()) {
	def codigo = resultadoSuma.getNString("codigo")
	def montoTotal = resultadoSuma.getNString("TotalDependencia")
	mapImporteTotal.put(codigo, montoTotal)
}

HashMap<Integer, Integer> mapCantTalones = new HashMap<Integer, Integer>()
while(resultadoContador.next()) {
	def codigo = resultadoContador.getNString("codigo")
	def contBoletas = resultadoContador.getNString("ContadorBoletas")
	mapCantTalones.put(codigo, contBoletas)
}


while(resultadoQuery.next()) {
	def valorDependenciaActual = resultadoQuery.getNString("CODIGO")
	def denCodIntegrador = resultadoQuery.getNString('NOMBRE').toUpperCase().substring(0,12)
	def cantTalones = mapCantTalones.get(valorDependenciaActual)
	cantTalones = String.format("%06d", Integer.parseInt(cantTalones))
	def importeTotal = mapImporteTotal.get(valorDependenciaActual).toString()
	if(importeTotal.contains(".")) importeTotal = importeTotal.replaceAll("\\.", "")
	else importeTotal = importeTotal + "00"
	importeTotal = String.format("%017d", Integer.parseInt(importeTotal))
	
	def stringDependencia = '10'+ nroDependencia +'0000000000'+ nroLote + fechaHOY + marcaProceso +importeTotal + importeComisiones + cantTalones + denCodIntegrador + marcaGrabacion + marcaGrabacion + nroCuenta + filler32 + "  "+ codTransaccion + codIntegrador
	def stringTipoDePago = '11'+ nroDependencia +'0900'+ fechaHOY + nroLote + fechaHOY + marcaProceso + tipoPago + '0' + importeTotal + importeComisiones + cantTalones+ filler52 + "   "+ codTransaccion + codIntegrador
	
	Files.write(pathArchivoRendicion, (stringDependencia + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND)
	Files.write(pathArchivoRendicion, (stringTipoDePago + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND)

	def valorDependenciaUltimo= resultadoQuery.getNString("CODIGO") 
	
	while (valorDependenciaUltimo.equals(valorDependenciaActual) && resultadoQuery.next()){		
		def CodBarras = resultadoQuery.getNString("CODBARRAS")
		def importeBoleta = resultadoQuery.getNString("TOTAL")
		if(importeBoleta.contains(".")) importeBoleta = importeBoleta.replaceAll("\\.", "")
		else importeBoleta = importeBoleta + "00"
		if(importeBoleta.contains(" ")) importeBoleta = importeBoleta.replaceAll(" ", "0")
		importeBoleta = String.format("%017d", Integer.parseInt(importeBoleta))
		def stringDetalleRegistro = '12'+ nroDependencia + '0900' + fechaHOY + nroLote + fechaHOY + marcaProceso + tipoPago + '0' + '0' + '000' + CodBarras + importeBoleta + nroComprobante + '000' + codIntegrador
		Files.write(pathArchivoRendicion, (stringDetalleRegistro + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.APPEND)	
		
		valorDependenciaActual= resultadoQuery.getString("CODIGO")
	}
	valorDependenciaUltimo= valorDependenciaActual;
} 
//Como ultimo paso se cierra la conexion a la db
CustomKeywords.'baseDeDatos.oracleSQL.cerrarConexionDB'()





