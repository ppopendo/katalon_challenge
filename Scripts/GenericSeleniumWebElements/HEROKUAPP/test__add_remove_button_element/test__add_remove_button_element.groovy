import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.SelectorMethod.XPATH

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
import seleniumlib.BaseElement as BaseElement

BaseElement base_element = new BaseElement()
WebUI.openBrowser(null)
base_element.navigate_to_url(GlobalVariable.URL_ADD_ELEMENTS)
/*
 * add "Delete button"
 */
for (def q = 1; q <= count_expected; q++)
{
	base_element.click_element(findTestObject('GenericSelenium/HEROKUAPP/AddRemoveElements/add_button'))
}

Number count_element =  base_element.get_count_web_elements(findTestObject('GenericSelenium/HEROKUAPP/AddRemoveElements/delete_buttons'))

assert count_element == count_expected

/*
 * remove "Delete button"
 */

TestObject delete_button = findTestObject('GenericSelenium/HEROKUAPP/AddRemoveElements/delete_button')
for (def q = 1; q <= count_expected; q++)
	{
		String delete_button_xpath = delete_button.getSelectorCollection().getAt(XPATH)
		delete_button_xpath = delete_button_xpath.replace("<<id_button>>", q.toString())
		delete_button.setSelectorValue(XPATH, delete_button_xpath)
		base_element.click_element(delete_button)
	}

WebUI.closeBrowser()
