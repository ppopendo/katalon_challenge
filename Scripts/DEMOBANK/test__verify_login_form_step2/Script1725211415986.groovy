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

WebUI.openBrowser(null)
CustomKeywords.'loginPage.LoginFormGeneric.open_login_page'(GlobalVariable.URL_LOGIN_FORM_STEP1)

CustomKeywords.'loginPage.LoginFormGeneric.login_page_is_displayed'(findTestObject('Demobank/LoginPage/LoginFormComponent/form_step1'))

CustomKeywords.'loginPage.LoginFormGeneric.is_login_name_displayed'(findTestObject('Demobank/LoginPage/LoginFormComponent/login_id_input'))

CustomKeywords.'loginPage.LoginFormGeneric.enter_login_name'(findTestObject('Demobank/LoginPage/LoginFormComponent/login_id_input'), 
    GlobalVariable.DEFAULT_LOGIN)

CustomKeywords.'loginPage.LoginFormStep1.click_next_step'(findTestObject('Demobank/LoginPage/LoginFormComponent/next_button'))

CustomKeywords.'loginPage.LoginFormStep2.is_keyboard_login_item_displayed'()

CustomKeywords.'loginPage.LoginFormStep2.is_login_tooltip_item_displayed'()

String password_label_element =  CustomKeywords.'loginPage.LoginFormStep2.get_password_label'()

assert password_label_element == password_label
CustomKeywords.'loginPage.LoginFormGeneric.open_login_page'(GlobalVariable.URL_LOGIN_FORM_STEP1)
WebUI.closeBrowser()