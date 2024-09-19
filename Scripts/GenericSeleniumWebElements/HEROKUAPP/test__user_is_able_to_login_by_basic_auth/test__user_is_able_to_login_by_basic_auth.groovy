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
import seleniumlib.BaseElement

BaseElement base_element = new BaseElement()

WebUI.openBrowser(null)

base_element.open_page_with_basic_auth(username, pwd, GlobalVariable.URL_BASIC_AUTH)

WebUI.waitForElementVisible(findTestObject('Object Repository/GenericSelenium/HEROKUAPP/BasicAuthComponent/basic_auth_title'), 5, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/GenericSelenium/HEROKUAPP/BasicAuthComponent/basic_auth_message'), 
    5, FailureHandling.STOP_ON_FAILURE)

String basic_auth_title_element = WebUI.getText(findTestObject('Object Repository/GenericSelenium/HEROKUAPP/BasicAuthComponent/basic_auth_title'))

String basic_auth_msg_element = WebUI.getText(findTestObject('Object Repository/GenericSelenium/HEROKUAPP/BasicAuthComponent/basic_auth_message'))

assert basic_auth_title_element == basic_auth_title

assert basic_auth_msg_element == basic_auth_msg

WebUI.closeBrowser()
