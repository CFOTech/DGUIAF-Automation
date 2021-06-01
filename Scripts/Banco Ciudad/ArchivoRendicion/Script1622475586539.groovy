import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.sql.ResultSet
import java.sql.ResultSetMetaData

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
Path pathArchivoRendicion = Paths.get(pathRelativo)

//Conexion a la db de homologacion
CustomKeywords.'baseDeDatos.oracleSQL.conectarDB'('ORADB11', 'SIRH', '1521','JSIEBENBERG', 'JSIEBENBERG$$2021')
//Creacion de query en formato string para luego ejecutarla, el resultado se guarda en un objeto ResultSet para facilitar su manipulacion
def queryBCiudad = "SELECT bu.boleta.NUMERO, bu.boleta.ESTADO, bu.boleta.TOTAL, bu.boleta.CODBARRAS, bu.boleta.DEPENDENCIAID,  sir.dependencia.nombre, sir.dependencia.codigo FROM bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid= sir.dependencia.id WHERE bu.boleta.estado = '1'"
ResultSet resultadoQuery = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(queryBCiudad)


fechaHOY = date.format('yyMMdd')

//Armado de registro cabeza
def stringCabecera = '01029-BCBA          '+ fechaHOY +'00RENDICION A EMPRESAS RISC'
Files.write(pathArchivoRendicion, stringCabecera.getBytes())

//Armado de lote dependencia recaudadora
def nroDependencia = '610'
def nroLote = '000820'
def marcaProceso = '1'
//Suma de los montos de los registros detalle (12), confirmar si hay que cambiarlo por dependencia
def importeTotal= '00000000000050000'
def importeComisiones = '00000000000'
//Contador de 12
def cantTalones = '000003'
//Puede llegar a ser la dependencia como la conocemos (DAI, Registro Civil)
def denCodIntegrador = 'PRUEBAQAAUTO'
def marcaGrabacion = '0'
def nroCuenta = '0002005423'
def codTransaccion = '6010'
def codIntegrador = '0001'

def stringDependencia = '10'+nroDependencia+'0000000000'+ nroLote + fechaHOY + marcaProceso + importeTotal + importeComisiones + cantTalones + denCodIntegrador + marcaGrabacion + marcaGrabacion + nroCuenta + '                                ' + codTransaccion + codIntegrador

println(stringDependencia)

//Armado de lote tipo de pago y fecha
//Revisar fecha, en ejemplos esta con ceros
def tipoPago = '00' //Efectivo
def stringTipoDePago = '11'+ nroDependencia +'0900'+ fechaHOY + nroLote + fechaHOY + marcaProceso + tipoPago + '0' + importeTotal + importeComisiones + cantTalones+ '                                                    ' + codTransaccion + codIntegrador

println(stringTipoDePago)

while (resultadoQuery.next()){
	StringBuilder strbul=new StringBuilder("")
	int cantColumnas = resultadoQuery.getMetaData().getColumnCount()
	for(int i=1; i<=cantColumnas; ++i){
		strbul.append(resultadoQuery.getString(i))
	}
	String s = System.lineSeparator() + strbul
	Files.write(pathArchivoRendicion, s.getBytes(), StandardOpenOption.APPEND)
 }

//Como ultimo paso se cierra la conexion a la db
CustomKeywords.'baseDeDatos.oracleSQL.cerrarConexionDB'()





