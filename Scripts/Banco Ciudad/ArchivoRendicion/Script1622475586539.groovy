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
String fechaHOY = date.format('yyMMdd')

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

//Armado de registro cabeza
def stringCabecera = '01029-BCBA          '+ fechaHOY +'00RENDICION A EMPRESAS RISC'
Files.write(pathArchivoRendicion, stringCabecera.getBytes())

//
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





