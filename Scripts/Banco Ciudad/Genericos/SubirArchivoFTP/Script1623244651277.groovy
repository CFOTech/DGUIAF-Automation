import java.nio.file.Paths

@Grab('commons-net:commons-net:3.0')
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import internal.GlobalVariable

String server = "ftp.hacienda-gcba.gov.ar"
int port = 21
String user = "sirftp"
String pass = "S1r.2016"
 
FTPClient ftpClient = new FTPClient()
try {
	ftpClient.connect(server, port)
	ftpClient.login(user, pass);
	ftpClient.enterLocalPassiveMode()
	
	for(String s : ftpClient.getReplyStrings())
		println(s);
 
	ftpClient.setFileType(FTP.BINARY_FILE_TYPE)
	File f = new File(System.getProperty("user.dir") + '\\txt')
	
	FilenameFilter textFilter = new FilenameFilter() {
		boolean accept(File dir, String name) {
			return name.toLowerCase().endsWith(".txt")
		}
	}
	File[] files = f.listFiles(textFilter);
	File LocalFile = null
	for (File file : files) LocalFile = file
		
	String pathLocalFile = LocalFile.getCanonicalPath()
	def txtFileName = Paths.get(pathLocalFile).getFileName().toString()
	
	String RemoteFileLocation = GlobalVariable.path_FTP + txtFileName
	//String RemoteFileLocation = "/SIRT/PTBA/SALIDA/" + txtFileName
	inputStream = new FileInputStream(LocalFile)

	println("Comenzando a subir archivo de rendicion")
	OutputStream outputStream = ftpClient.storeFileStream(RemoteFileLocation)
	
	byte[] bytesIn = new byte[4096]
	int read = inputStream.read(bytesIn)
	outputStream.write(bytesIn, 0, read)

	inputStream.close()
	outputStream.close()

	def completed = ftpClient.completePendingCommand()
	if (completed) {
		println("El archivo fue subido correctamente al FTP en el path: " + RemoteFileLocation)
	}
} catch (IOException ex) {
	println("Error: " + ex.getMessage())
	ex.printStackTrace()
}