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

public class OrangeHRMLoginPage {

	/**
	 * @return the login_input
	 */
	private TestObject getLogin_input() {
		TestObject login_input = findTestObject('Object Repository/OrangeHRM/LoginPage/username_input');
		return login_input;
	}

	/**
	 * @return the password_input
	 */
	private TestObject getPassword_input() {
		TestObject password_input = findTestObject('Object Repository/OrangeHRM/LoginPage/password_input');
		return password_input;
	}

	/**
	 * @return the login_button
	 */
	private TestObject getLogin_button() {
		TestObject login_button = findTestObject('Object Repository/OrangeHRM/LoginPage/login_button');
		return login_button;
	}

	/**
	 * @return the error_messages_count
	 */
	private int getError_messages_count() {
		TestObject error_messages_count = findTestObject('Object Repository/OrangeHRM/LoginPage/error_messages');
		BaseElement base_element = new BaseElement()
		return base_element.get_count_web_elements(error_messages_count);
	}

	
	def enter_login(String username) {
		BaseElement.enter_value(getLogin_input(), username)
	}

	def enter_password(String password) {
		BaseElement.enter_value(getPassword_input(), password)
	}

	def click_login_button() {
		BaseElement.click_element(getLogin_button())
	}

	def log_in_user(String username, String password) {
		enter_login(username)
		enter_password(password)
		click_login_button()
	}

	def log_in_user_with_admin_role() {
		log_in_user(GlobalVariable.USER_ADMIN ,GlobalVariable.USER_DEFAULT_PASSWORD)
	}
}

