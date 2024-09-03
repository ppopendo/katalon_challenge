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

CustomKeywords.'loginPage.LoginFormGeneric.open_login_page'(GlobalVariable.URL_LOGIN_FORM_STEP1)
CustomKeywords.'loginPage.LoginFormGeneric.enter_login_name'(findTestObject('Demobank/LoginPage/LoginFormComponent/login_id_input'),GlobalVariable.DEFAULT_LOGIN)
CustomKeywords.'loginPage.LoginFormStep1.click_next_step'(findTestObject('Demobank/LoginPage/LoginFormComponent/next_button'))
CustomKeywords.'loginPage.LoginFormStep2.enter_password'(GlobalVariable.DEFAULT_PWD)
CustomKeywords.'loginPage.LoginFormStep2.click_login_button'()
String user_message_element = WebUI.getText(findTestObject('Object Repository/Demobank/UserDesktop/UserHeaderComponent/user_message'))
assert user_message_element  == user_message_str 
WebUI.click(findTestObject('Object Repository/Demobank/UserDesktop/log_out_link'))
CustomKeywords.'loginPage.LoginFormGeneric.open_login_page'(GlobalVariable.URL_LOGIN_FORM_STEP1)
