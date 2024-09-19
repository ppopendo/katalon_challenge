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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.interactions.Actions
import components.SliderComponent

WebUI.openBrowser(null)
WebUI.navigateToUrl(GlobalVariable.URL_SLIDER2 + "#multiple-vertical")
SliderComponent slider_component = new SliderComponent()
WebUI.switchToFrame(findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/iframe_slider'), GlobalVariable.DEFAULT_SLEEP)
TestObject slider_element  = findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/master_volume_slider')
slider_component.move_element_by_offset(slider_element, 22, 0)
slider_element  = findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/eq1_slider')
slider_component.move_element_by_offset(slider_element, 0, 88)
slider_element  = findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/eq2_slider')
slider_component.move_element_by_offset(slider_element, 0, 44)
slider_element  = findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/eq3_slider')
slider_component.move_element_by_offset(slider_element, 0, -22)
slider_element  = findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/eq4_slider')
slider_component.move_element_by_offset(slider_element, 0, -88)
slider_element  = findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/eq5_slider')
slider_component.move_element_by_offset(slider_element, 0, -40)
slider_element  = findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/eq6_slider')
slider_component.move_element_by_offset(slider_element, 0, 11)
slider_element  = findTestObject('Object Repository/GenericSelenium/JQUERY/SLIDER/eq7_slider')
slider_component.move_element_by_offset(slider_element, 0, 66)

WebUI.closeBrowser()
