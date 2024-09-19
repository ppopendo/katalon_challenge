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



public class LoginFormGenericPage {


	def open_login_page(String url) {
		try {
			BaseElement.navigate_to_url(url)
			WebUI.comment('Login pagae with form step1 is opened')
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to open login page step2")
		}
	}

	def login_page_is_displayed(TestObject element) {
		try {
			BaseElement.wait_until_element_is_displayed(element)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Login page isn't displayed: " + e)
		}
	}


	def is_login_name_displayed(TestObject element) {
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


	def enter_login_name(TestObject element, String value) {
		try {
			BaseElement.enter_value(element, value)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Enexpected error: " + e)
		}
	}
}

