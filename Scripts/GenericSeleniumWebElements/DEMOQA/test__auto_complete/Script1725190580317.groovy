import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import seleniumlib.BaseElement

BaseElement base_element = new BaseElement()
WebUI.openBrowser(null)
WebUI.navigateToUrl(GlobalVariable.URL_AUTO_COMPLETE)
TestObject color_names_element = findTestObject('Object Repository/GenericSelenium/DEMOQA/Autocomplete/color_names_input')
TestObject color_name_element = findTestObject('Object Repository/GenericSelenium/DEMOQA/Autocomplete/color_name_input')
base_element.enter_auto_complete_value(color_names_element, color_name2)
base_element.enter_auto_complete_value(color_names_element, color_name)
base_element.enter_auto_complete_value(color_name_element, color_name)
base_element.get_all_values_auto_complete_input(findTestObject('Object Repository/GenericSelenium/DEMOQA/Autocomplete/color_names_all_value'))
WebUI.closeBrowser()
