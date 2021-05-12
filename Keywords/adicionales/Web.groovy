package adicionales
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class Web {

	/**
	 * Hace un 'check' o 'nocheck' sobre un TestObject en base a una variable bool
	 * @param objectoAChequear - test object de Katalon 
	 * @param variableBooleana - variable de tipo boolean
	 */
	@Keyword
	def checkOnoCheck(TestObject objectoAChequear, Boolean variableBooleana) {
		if(variableBooleana == true) {
			WebUI.check(objectoAChequear)
		}
		else {
			WebUI.uncheck(objectoAChequear)
		}
	}
}