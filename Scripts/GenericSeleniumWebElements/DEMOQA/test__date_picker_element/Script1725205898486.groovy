import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import components.DatePickerComponent

DatePickerComponent dt_picker = new DatePickerComponent()
WebUI.openBrowser(null)
WebUI.navigateToUrl(GlobalVariable.URL_DATE_PICKER)
/*
 * open datepicker
 */
dt_picker_test_object = findTestObject('Object Repository/GenericSelenium/DEMOQA/DatePicker/date_input')
dt_picker.open(dt_picker_test_object)
WebUI.waitForElementVisible(findTestObject('Object Repository/GenericSelenium/DEMOQA/DatePicker/datepicker_list_month'), GlobalVariable.DEFAULT_SLEEP)
WebUI.waitForElementVisible(findTestObject('Object Repository/GenericSelenium/DEMOQA/DatePicker/datepicker_list_year'), GlobalVariable.DEFAULT_SLEEP)
/* 
 * select day method 1
 */
dt_picker.select_day(findTestObject('Object Repository/GenericSelenium/DEMOQA/DatePicker/datepicker_month'), 2, 2)
/*
 * select day method 2
 */
WebUI.sendKeys(dt_picker_test_object,  Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(dt_picker_test_object,  Keys.chord(Keys.BACK_SPACE))
WebUI.setText(dt_picker_test_object, "2024-01-01")
WebUI.sendKeys(dt_picker_test_object,  Keys.chord(Keys.ENTER))
WebUI.closeBrowser()
