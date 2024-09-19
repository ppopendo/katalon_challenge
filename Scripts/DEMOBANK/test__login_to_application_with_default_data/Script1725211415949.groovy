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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_id_input'), GlobalVariable.DEFAULT_LOGIN)

WebUI.click(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/next_button'))

WebUI.setText(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/password_input'), GlobalVariable.DEFAULT_PWD)

WebUI.click(findTestObject('Object Repository/Demobank/LoginPage/LoginFormComponent/login_next_button'))

String user_name_element = WebUI.getText(findTestObject('Object Repository/Demobank/UserDesktop/UserHeaderComponent/user_name_str'))

assert user_name_element == user_name

WebUI.click(findTestObject('Object Repository/Demobank/UserDesktop/log_out_link'))

CustomKeywords.'loginPage.LoginFormGeneric.open_login_page'(GlobalVariable.URL_LOGIN_FORM_STEP1)

