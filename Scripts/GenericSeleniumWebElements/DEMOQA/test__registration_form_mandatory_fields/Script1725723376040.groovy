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
import components.DatePickerComponent
import components.RadioButtonComponent
import components.ModalComponent

WebUI.openBrowser(null)
WebUI.navigateToUrl(GlobalVariable.URL_REGISTRATION_FORM)
BaseElement base_element = new BaseElement()
RadioButtonComponent radiobutton_element = new RadioButtonComponent()
DatePickerComponent dt_picker_element = new DatePickerComponent()
ModalComponent modal_element = new ModalComponent()

base_element.refreshBrowser()
base_element.enter_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/first_name_input'), first_name)
base_element.enter_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/last_name_input'), last_name)
radiobutton_element.select_by_label_text(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/gender_by_name_radiobutton'), gender)
base_element.enter_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/mobile_number_input'), mobile_number)
base_element.click_element(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/submit_button'))
modal_element.close(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/close_modal_button'))

WebUI.closeBrowser()

