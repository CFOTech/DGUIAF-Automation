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

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import db.OracleJDBCConnection;


//el proceso imprime todos los nombres de los campos que se traen de la consulta sql
def consultarLabels(ResultSetMetaData rsmd, Imprimidor fileImp) throws SQLException {
	String[] labels;
	int size= rsmd.getColumnCount();
	System.out.println("Cantidad columnas: " + String.valueOf(size));
	labels= new String[size];
	for (int f=0; f<= size-1; f++){
		labels[f]=  rsmd.getColumnLabel(f+1);
	}
	//fileImp.imprimirLabels(labels);
	CustomKeywords.'imprimir.imprimidor.imprimirLables'(labels)
}

//este seria el main de java
public static void main(String[] args) throws IOException, SQLException {
	// TODO Auto-generated method stub
	
	//usa la clase Imprimidor que accede al archivo txt e imprime las lineas en este
	Imprimidor fileImp= new Imprimidor();
	
	//usa la clase OracleJDBCConnection que contiene los metodos para manipular la BD y consultas SQL
	OracleJDBCConnection data1;
			
	data1= new OracleJDBCConnection();
	
	ResultSet rs;
	
	CustomKeywords.'baseDeDatos.oracleJDBCConnection.connect'('ORADB11', 'SIRH', '1521','JSIEBENBERG', 'JSIEBENBERG$$2021')
	
	//data1.connect("jdbc:oracle:thin:@ORADB11:1521/SIRH", "TRIVERA", "TRIVERA$$2021");
	
	//consulta numero 1 de prueba
	String sql1= "SELECT bu.boleta.NUMERO, bu.boleta.ESTADO, bu.boleta.TOTAL, bu.boleta.CODBARRAS, bu.boleta.DEPENDENCIAID, \r\n"
			+ "       sir.dependencia.nombre, sir.dependencia.codigo\r\n"
			+ "FROM bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid= sir.dependencia.id\r\n"
			+ "WHERE bu.boleta.estado = '1'";
	
	//consulta numero 2 que se utiliza realmente, esta ordenada por numero de dependencia
	String sql2= "\r\n"
			+ "SELECT SIR.dependencia.codigo AS NumeroDependencia, bu.boleta.fecha AS Fecha, bu.boleta.total AS Monto, \r\n"
			+ "       BU.boleta.numero AS NumeroCuenta, SIR.dependencia.nombre AS Nombre,\r\n"
			+ "       SIR.dependencia.codigo AS NumeroDependenciaMedioPago,\r\n"
			+ "       SIR.dependencia.codigo AS NumeroDependenciaBoleta, bu.boleta.total AS Monto,\r\n"
			+ "       bu.boleta.numero AS NumeroBUI,\r\n"
			+ "       bu.boleta.codpagoelectronico AS CodPagoElectronico\r\n"
			+ "from bu.boleta INNER JOIN sir.dependencia ON bu.boleta.dependenciaid= sir.dependencia.id\r\n"
			+ "where bu.boleta.estado = '1'\r\n"
			+ "Order BY SIR.dependencia.codigo";
	
	//ejecuta la consulta
	rs= data1.execute(sql2);
	
	//usa un objeto del tipo ResultSetMetaData 
	ResultSetMetaData rsmd= rs.getMetaData();
	
	System.out.println("Consulta hecha");
	
	//crea el archivo txt en el path indicado
	fileImp.createFile("C:/Devs/Projects/Java/pruebaBancoCiudad/txt/fileDBGenerate1.txt");

	//llama al metodo consultarLabels, que imprime los nombres de las columnas resultantes de la consulta sql
	consultarLabels(rsmd, fileImp);
	
    //se posiciona en el primer elemento del resultset, que contiene los resultados de la consulta sql
	rs.next();
	
	//asigna a valorDependenciaActual el numero de dependencia que figura en el primer elemento del resultset (la primer fila)
	String valorDependenciaActual= rs.getNString("NUMERODEPENDENCIA");
	
	int cantidadBoletas;
	float montoTotal;
	
	//mientras haya elementos a recorrer en el resultset
	while (rs.next()) {
		//iniciliza la linea que se imprimira en el txt
		String valEncabezado= new String();
		valEncabezado= "encabezadoPrueba"+ String.valueOf(rs.getRow());
		
		cantidadBoletas= 0;
		montoTotal= 0;
		
		//imprime el encabezado
		fileImp.imprimirCampoCabeza(valEncabezado);
		
		//blanquea el string
		valEncabezado= new String();
		valEncabezado= rs.getNString("NUMERODEPENDENCIA")+rs.getNString("FECHA")+
				rs.getNString("MONTO")+rs.getNString("NUMEROCUENTA")+rs.getNString("NOMBRE");
		
		//imprime la dependencia (10) en el txt
		fileImp.imprimirCampoDependencia(valEncabezado);
		
		//blanquea
		valEncabezado= new String();
		
		//imprime el medio de pago (11) en el txt --- es ejemplo, este if no deberia ir, esta para poner un valor que
		//a veces es null
		if(rs.getNString("CODPAGOELECTRONICO")!= null) {
		  valEncabezado= rs.getNString("NUMERODEPENDENCIAMEDIOPAGO")+rs.getNString("CODPAGOELECTRONICO");
		}
		else {
		  valEncabezado= rs.getNString("NUMERODEPENDENCIAMEDIOPAGO")+" 010101";
		}
		
		//imprime el medio de pago en el txt
		fileImp.imprimirCampoMedioPago(valEncabezado);
		
		//asigna el valor del numero de dependencia actual a la variable valorDependenciaUltimo
		String valorDependenciaUltimo= rs.getNString("NUMERODEPENDENCIA");
		
		//mientras valorDependenciaUltimo sea igual a valorDependenciaActual (es decir sigue recorriendo 
		//elementos los cuales contienen la misma dependencia actual)
		//y haya elementos por recorrer
		//corte de control
		//si se requiere que se agrupe tambien por medios de pago (por existencia de mas medios para una dependencia
		//se debe pensar en otro bucle anidado adicional mas)
		while ((valorDependenciaUltimo.equals(valorDependenciaActual))&&(rs.next())) { 
		  //limpia el string
		  valEncabezado= new String();
		  valEncabezado= rs.getNString("NUMERODEPENDENCIABOLETA")+" "+Float.toString(rs.getFloat("MONTO"))+" "+rs.getNString("NUMEROBUI");
		  //imprime la boleta (12) en el archivo txt
		  fileImp.imprimirCampoBoleta(valEncabezado);
		  //suma una boleta mas para esa dependencia
		  cantidadBoletas= cantidadBoletas+1;
		  //suma el monto de esa boleta en el monto total para esa dependencia
		  montoTotal= montoTotal+ rs.getFloat("MONTO");
		  //se posiciona en el siguiente elemento del result set	   
		  rs.next();
		  //si sigue habiendo elementos para recorrer
		  if(rs.next()) {
			 //a valor dependencia actual le asigna el numero de dependencia del nuevo elemento en donde
			 //se esta posicionado del resultset
			 valorDependenciaActual= rs.getString("NUMERODEPENDENCIA");
		  }
		}
		
		//se sale del bucle porque se esta posicionado en un elemento del resultset donde cambio el numero
		//de dependencia o porque el listado quedo sin elementos por recorrer
		//imprime el valor del monto total en el archivo txt
		fileImp.imprimirLinea("Monto total final: "+ Float.toString(montoTotal));
		//imprime el valor de la cantidad de boletas en el archivo txt
		fileImp.imprimirLinea("Cantidad de Boletas: "+ cantidadBoletas);
		//le asigna a valorDependenciaUltimo el nuevo valor numero de dependencia encontrado en el recorrido
		valorDependenciaUltimo= valorDependenciaActual;
	}
}

