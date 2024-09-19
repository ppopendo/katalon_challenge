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
import pages.OrangeHRMLoginPage as LoginPage
import seleniumlib.BaseElement
import pages.OrangeHRMAdminMenuComponent as AdminMenu
import pages.OrangeHRMApplicationBarComponent as AppBar
import pages.OrangeHRMAdminMobulePage as AdminPage

LoginPage login_page = new LoginPage()
BaseElement base_element = new BaseElement()
AdminMenu admin_menu = new AdminMenu()
AppBar app_bar = new AppBar()
AdminPage admin_page = new AdminPage()
WebUI.openBrowser(null)
base_element.navigate_to_url(GlobalVariable.URL)
login_page.log_in_user_with_admin_role()
admin_menu.open_admin_module_on_main_menu()
WebUI.delay(5)
List<String> employee_names = admin_page.get_all_employee_names()
println employee_names
admin_page.enter_employee_name(employee_names[0])
WebUI.delay(5)
admin_page.select_employee_name_from_dropdown()
admin_page.click_search_button()
println admin_page.get_employee_name_first_row()
app_bar.user_logout()
WebUI.closeBrowser()




