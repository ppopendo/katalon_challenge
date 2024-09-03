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

WebUI.waitForElementVisible(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/form_step1'), GlobalVariable.DEFAULT_SLEEP, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/form_header'), GlobalVariable.DEFAULT_SLEEP, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_container'), GlobalVariable.DEFAULT_SLEEP, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_container_label'), GlobalVariable.DEFAULT_SLEEP, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_id_input'), GlobalVariable.DEFAULT_SLEEP, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_remeber_link'), GlobalVariable.DEFAULT_SLEEP, 
    FailureHandling.STOP_ON_FAILURE)

String form_header_element = WebUI.getText(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/form_header'))

String login_label_element = WebUI.getText(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_container_label'))

assert form_header_element == form_header_name

assert login_label_element == login_label_name
CustomKeywords.'loginPage.LoginFormGeneric.open_login_page'(GlobalVariable.URL_LOGIN_FORM_STEP1)