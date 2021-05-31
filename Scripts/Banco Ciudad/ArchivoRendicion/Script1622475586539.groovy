import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.sql.ResultSet
import java.sql.ResultSetMetaData

def date = new Date()
String fechaHOY = date.format('ddMMyy')

def pathEjecucion = System.getProperty("user.dir")
def pathTxt = pathEjecucion + '\\RENDBCBA029'+ fechaHOY +'.txt'
def pathRelativo = pathTxt.replace('\\','\\\\')

File txtBCiudad = new File(pathTxt)
if( !txtBCiudad.exists()) {
	FileOutputStream out = new FileOutputStream(new File(pathTxt))
	out.close()
}

CustomKeywords.'baseDeDatos.oracleSQL.conectarDB'('ORADB11', 'SIRH', '1521','JSIEBENBERG', 'JSIEBENBERG$$2021')

def queryBCiudad = "SELECT bu.boleta.NUMERO, bu.boleta.ESTADO, bu.boleta.TOTAL, bu.boleta.CODBARRAS, bu.boleta.DEPENDENCIAID,  sir.dependencia.nombre, sir.dependencia.codigo FROM bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid= sir.dependencia.id WHERE bu.boleta.estado = '1'"

ResultSet resultadoQuery = CustomKeywords.'baseDeDatos.oracleSQL.ejecutarQuery'(queryBCiudad)

ResultSetMetaData metaData = resultadoQuery.getMetaData();
int cantColumnas = metaData.getColumnCount();

while (resultadoQuery.next()){
	StringBuilder strbul=new StringBuilder("")
	for(int i=1; i<=cantColumnas; ++i){
		strbul.append(resultadoQuery.getString(i))
	}
	Path p = Paths.get(pathRelativo);
	String s = System.lineSeparator() + strbul
	Files.write(p, s.getBytes(), StandardOpenOption.APPEND)
 }

CustomKeywords.'baseDeDatos.oracleSQL.cerrarConexionDB'()





