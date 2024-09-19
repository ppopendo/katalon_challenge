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
import components.CheckboxComponent
import components.DatePickerComponent
import components.RadioButtonComponent
import components.ModalComponent
import common.CommonComponent

WebUI.openBrowser(null)
WebUI.navigateToUrl(GlobalVariable.URL_REGISTRATION_FORM)
BaseElement base_element = new BaseElement()
RadioButtonComponent radiobutton_element = new RadioButtonComponent()
CheckboxComponent checkbox_element = new CheckboxComponent()
DatePickerComponent dt_picker_element = new DatePickerComponent()
ModalComponent modal_element = new ModalComponent()
CommonComponent common_element = new CommonComponent()

/* 
 * enter First name
 */
base_element.enter_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/first_name_input'), first_name)
/*
 * enter Last name
 */
base_element.enter_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/last_name_input'), last_name)
/*
 * enter email
 */
base_element.enter_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/email_input'), email)
/*
 * select gender
 */
radiobutton_element.select_by_label_text(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/gender_by_name_radiobutton'), gender)

/*
 * enter mobile phone
 */
base_element.enter_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/mobile_number_input'), mobile_number)
/*
 * enter date of birth
 */
/*
 * TODO there is a bug with setting a new value
 */
date_of_birth = common_element.get_current_date()
dt_picker_element.open(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/date_of_birth_input'))
dt_picker_element.enter_date(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/date_of_birth_input'),date_of_birth, false)

/*
 * enter subjects
 */
base_element.enter_auto_complete_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/subject_input'), subject)

/*
 * select hobbies
 */
checkbox_element.select_by_label_text(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/hobbies_by_name_input'), hobbies)

/*
 * enter current address
 */
base_element.enter_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/current_address_textarea'), current_address)
/*
 * select state
 */
base_element.enter_auto_complete_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/state_dropdown'), state)
/*
 * TODO prepare a new component for dropdown with autocomplete value 
 */
/*
 * select city
 */
base_element.enter_auto_complete_value(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/city_dropdown'), city)
base_element.click_element(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/submit_button'))
modal_element.close(findTestObject('Object Repository/GenericSelenium/DEMOQA/RegistrationForm/close_modal_button'))

WebUI.closeBrowser()

