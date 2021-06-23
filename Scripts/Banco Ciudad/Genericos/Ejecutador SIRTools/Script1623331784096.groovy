import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.InvalidPathException
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url_SIRTools)

WebUI.waitForPageLoad(2)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ObjectSIRTools/Page_Index - SIR TOOLS/inputUsuario'), 'jsiebenberg')

WebUI.setEncryptedText(findTestObject('ObjectSIRTools/Page_Index - SIR TOOLS/inputPass'), 'QRq7e4MI+FGzWeuiZv/jgw==')

WebUI.click(findTestObject('ObjectSIRTools/Page_Index - SIR TOOLS/btnIngresar'))

WebUI.selectOptionByLabel(findTestObject('ObjectSIRTools/Page_Ejecutardor remoto - SIR TOOLS/ddlAplicaciones'), aplicacion, 
    true)

//WebUI.setText(findTestObject(null), parametros)
WebUI.click(findTestObject('ObjectSIRTools/Page_Ejecutardor remoto - SIR TOOLS/btnExecute'))

WebUI.waitForElementClickable(findTestObject('ObjectSIRTools/Page_Ejecutardor remoto - SIR TOOLS/btnLogOut'), 120)


def salidaConsola = WebUI.getText(findTestObject('ObjectSIRTools/Page_Ejecutardor remoto - SIR TOOLS/SalidaConsola'))

String fechaEjecucion = new Date().format("dd-MM-YY_HH-mma")
def pathEjecucion = System.getProperty("user.dir")
def pathTxtSalida = pathEjecucion + '\\txt\\Salida de consola '+ fechaEjecucion +'.txt'
Path pathArchivoConsola = Paths.get(pathTxtSalida)

try {
	Files.write(pathArchivoConsola, (salidaConsola + System.lineSeparator()).getBytes(StandardCharsets.UTF_8),StandardOpenOption.CREATE)
	println("Archivo de salida de consola '"+ pathTxtSalida + "' creado satisfactoriamente.")
}catch(InvalidPathException ex) {
	println("Error encontrado: " + ex.getMessage())
}

