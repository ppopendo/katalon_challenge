package pages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.SelectorMethod.CSS
import static com.kms.katalon.core.testobject.SelectorMethod.XPATH

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
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
import seleniumlib.BaseElement
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class OrangeHRMApplicationBarComponent {

	/**
	 * @return the usermenu_dropdown
	 */
	private TestObject getUserMenu_dropdown() {
		TestObject usermenu_dropdown = findTestObject('Object Repository/OrangeHRM/ApplicationBarComponent/usermenu_dropdown');
		return usermenu_dropdown;
	}

	/**
	 * @return the user_menu_value
	 */
	private TestObject getUserMenu_value() {
		TestObject user_menu_value = findTestObject('Object Repository/OrangeHRM/ApplicationBarComponent/user_menu_value');
		return user_menu_value;
	}

	/**
	 * @return the user menu logout name
	 */
	private String getLogout_name() {
		return "Logout";
	}

	def private TestObject create_user_menu_value_test_object(String user_menu_value) {
		String user_menu_value_xpath = getUserMenu_value().getSelectorCollection().getAt(XPATH)
		return BaseElement.create_test_object(user_menu_value_xpath.replace("{value}", user_menu_value), "XPATH", user_menu_value)
	}

	def click_logout() {
		BaseElement.click_element(create_user_menu_value_test_object(getLogout_name()))
	}

	def open_user_menu() {
		BaseElement.click_element(getUserMenu_dropdown())
	}

	def user_logout() {
		open_user_menu()
		click_logout()
	}
}
