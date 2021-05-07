import java.util.Formatter.DateTime

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.delay(5)

Date today = new Date()

String todaysDate = today.format('yyyy-MM-dd')

String nowTime = today.format('HH-mm-ss')

println(todaysDate)

println(nowTime)

String nombreConsulta= this.getBinding().getVariables().getAt('nombre_consulta').toString()

println ("Binding: " + nombreConsulta)

def nombreArchivo = nombreConsulta + '_' + todaysDate + '_' + nowTime + '.png'

println(nombreArchivo)

def path = 'Images/' + nombreArchivo

println('Nombre path:' + path)

WebUI.takeScreenshot(path)

WebUI.delay(5)

