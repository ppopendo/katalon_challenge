package pages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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



public class LoginFormStep2Component {
	/*
	 * xpaths for login form step 2
	 */

	TestObject login_input = findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_id_input');
	TestObject login_keyboard_item = findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/keyboard_login_item');
	TestObject tooltip_login_item = findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/keyboard_login_item');
	TestObject password_input = findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/password_input');
	TestObject password_label = findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/password_container_label');
	TestObject login_button = findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_next_button');


	def is_login_button_clicable() {
		try {
			BaseElement.wait_until_element_is_clickable(login_input)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}


	def is_keyboard_login_item_displayed() {
		try {
			BaseElement.wait_until_element_is_displayed(login_keyboard_item)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}


	def is_login_tooltip_item_displayed() {
		try {
			BaseElement.wait_until_element_is_displayed(tooltip_login_item)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}


	def is_keyboard_password_item_displayed(TestObject element) {
		try {
			BaseElement.wait_until_element_is_displayed(element)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}


	def is_password_tooltip_item_displayed(TestObject element) {
		try {
			BaseElement.wait_until_element_is_displayed(element)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}


	def click_login_button() {
		try {
			BaseElement.click_element(login_button)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}


	def enter_password(String value) {
		try {
			BaseElement.enter_value(password_input, value)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}


	def get_password_label() {
		try {
			return BaseElement.get_element_inner_text(password_label)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}
}