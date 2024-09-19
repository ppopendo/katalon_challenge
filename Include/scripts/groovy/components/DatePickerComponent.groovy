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


public class DatePickerComponent {

	def open(TestObject date_picker_input) {
		try {
			BaseElement.click_element_by_action_js(date_picker_input)
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to open data picker")
		}
	}

	def select_day(TestObject date_picker_day,int week_row, int day_col) {
		try {
			String date_picker_day_xpath = date_picker_day.getSelectorCollection().getAt(XPATH)
			date_picker_day_xpath = date_picker_day_xpath.replace("<<week>>", week_row.toString())
			date_picker_day_xpath = date_picker_day_xpath.replace("<<day>>", day_col.toString())
			date_picker_day.setSelectorValue(XPATH, date_picker_day_xpath)
			WebUI.mouseOver(date_picker_day)
			BaseElement.click_element(date_picker_day)
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to select week:" + week_row + " and day:" + day_col)
		}
	}

	def enter_date(TestObject date_picker, String date_value, Boolean clear_text = true) {
		try {
			BaseElement.select_input_text_by_action_js(date_picker)
			if (clear_text) {
				WebUI.sendKeys(date_picker,  Keys.chord(Keys.BACK_SPACE))
			}
			BaseElement.enter_value(date_picker, date_value)
			WebUI.sendKeys(date_picker,  Keys.chord(Keys.ENTER))
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to enter date:" + date_value)
		}
	}
}


