package components
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.SelectorMethod.CSS
import static com.kms.katalon.core.testobject.SelectorMethod.XPATH

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

import static org.assertj.core.api.Assertions.registerCustomDateFormat

import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import seleniumlib.BaseElement


public class RadioButtonComponent {

	def boolean is_element_checked(TestObject radio_button_element) {
		try {
			BaseElement.wait_until_element_is_displayed(radio_button_element)
			/*
			 *  TODO create a new method to verify whether element is checked
			 */
			return WebUI.verifyElementChecked(radio_button_element, GlobalVariable.DEFAULT_SLEEP,FailureHandling.CONTINUE_ON_FAILURE)
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail element radiobutton")
		}
	}

	def select(TestObject radio_button_element) {
		try {
			if (is_element_checked(radio_button_element)) {
				println("the element is checked");
			}
			else {
				BaseElement.click_element(radio_button_element)
			}
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to select radiobutton element")
		}
	}

	def select_by_label_text(TestObject radio_button_element, String label_text) {
		try {

			String radiobutton_xpath = radio_button_element.getSelectorCollection().getAt(XPATH)
			radiobutton_xpath = radiobutton_xpath.replace("<<label_text>>",label_text)
			radio_button_element.setSelectorValue(XPATH, radiobutton_xpath)
			BaseElement.click_element_by_action_js(radio_button_element)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to select radiobutton by label text: " + label_text)
		}
	}
}


