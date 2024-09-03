package seleniumlib
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
import org.openqa.selenium.interactions.Actions

public class BaseElement {


	def open_page_with_basic_auth(String user, String pwd, String url) {
		try {
			String url_str = "https://" + user + ":" + pwd + "@" + url;
			println url_str
			navigate_to_url(url_str)
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to open page with basic auth:" + url)
		}
	}


	def int get_count_web_elements(TestObject element) {
		List count_elements = get_webelemnts(element)
		return count_elements.size()
	}


	def static click_element(TestObject element) {
		try {
			if (wait_until_element_is_clickable(element)) {
				WebUI.click(element)
			}
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}


	def static enter_auto_complete_value(TestObject element, String value_str) {
		click_element_by_action_js(element)
		enter_value(element, value_str)
		WebUI.sendKeys(element, Keys.chord(Keys.DOWN))
		WebUI.sendKeys(element, Keys.chord(Keys.ENTER))
	}


	def static List get_all_values_auto_complete_input(TestObject element) {
		List web_elements = get_webelemnts(element)
		List values_element =[]
		int element_id = 0
		for (def q = 0; q <= web_elements.size() -1 ;q++) {
			int end_indx = web_elements[q].toString().length()-1
			int beg_indx = web_elements[q].toString().indexOf('//')
			element_id = q + 1
			String xpath_element = '(' + web_elements[q].toString().substring(beg_indx, end_indx) + ')[' + element_id + ']'
			values_element.add(WebUI.getText(create_test_object(xpath_element,'XPATH')))
		}
		return values_element
	}

	def static TestObject create_test_object(String selector_value, String method_name, String test_object_name='NewTestObject') {
		TestObject new_test_object = new TestObject(test_object_name)
		if (method_name == 'XPATH') {
			new_test_object.setSelectorMethod(XPATH)
			new_test_object.setSelectorValue(XPATH, selector_value)
		}
		else {
			new_test_object.setSelectorMethod(CSS)
			new_test_object.setSelectorValue(CSS, selector_value)
		}
		return new_test_object
	}

	def static boolean wait_until_element_is_displayed(TestObject element) {
		try {
			return WebUI.waitForElementVisible(element, GlobalVariable.DEFAULT_SLEEP, FailureHandling.OPTIONAL)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found:" + e)
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error:" + e)
		}
	}

	def static navigate_to_url(String url) {
		WebUI.navigateToUrl(url)
		WebUI.delay(GlobalVariable.DEFAULT_SLEEP)
	}

	def static enter_value(TestObject element, String value) {
		try {
			if (wait_until_element_is_displayed(element)){
				WebUI.setText(element, value, FailureHandling.STOP_ON_FAILURE)
			}
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to set value for element:" + element)
		}
	}

	def static wait_until_element_is_clickable(TestObject element) {
		try {
			WebUI.waitForElementClickable(element, GlobalVariable.DEFAULT_SLEEP, FailureHandling.STOP_ON_FAILURE)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found:" + e)
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error:" + e)
		}
	}

	def static String get_element_inner_text(TestObject element) {
		try {
			if (wait_until_element_is_displayed(element)){
				return WebUI.getText(element)
			}
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to get value for element:" + element)
		}
	}

	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	def static List get_webelemnts(TestObject element) {
		try {
			if (wait_until_element_is_displayed(element)) {
				return WebUiCommonHelper.findWebElements(element, GlobalVariable.DEFAULT_SLEEP)
			}
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to get list of web elements:" + element)
		}
	}

	def static click_element_by_action_js(TestObject element) {
		try {
			Actions builder_action = new Actions(DriverFactory.getWebDriver())
			WebElement element_webelement = WebUiCommonHelper.findWebElement(element, 5)
			builder_action.moveToElement(element_webelement).click().build().perform()
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	def static select_input_text_by_action_js(TestObject element) {
		try {
			Actions builder_action = new Actions(DriverFactory.getWebDriver())
			WebElement element_webelement = WebUiCommonHelper.findWebElement(element, 5)
			builder_action.keyDown(element_webelement, Keys.CONTROL).sendKeys('a').build().perform()
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	def static List get_webelements_inner_text(String element_xpath) {
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> web_elements = driver.findElements(By.xpath(element_xpath))
		List values_element =[]
		for (def WebElement web_element in web_elements) {
			values_element.add(web_element.getText())
		}
		return values_element
	}

	def static mouse_over_by_js(TestObject element) {
		try {
			Actions builder_action = new Actions(DriverFactory.getWebDriver())
			WebElement element_webelement = WebUiCommonHelper.findWebElement(element, 5)
			builder_action.click(element_webelement).build().perform()
		}
		catch (Exception except_msg) {
			KeywordUtil.markFailed("Fail to mouse over on element:" + except_msg)
		}
	}
}
