package pages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.SelectorMethod.CSS
import static com.kms.katalon.core.testobject.SelectorMethod.XPATH
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import seleniumlib.BaseElement
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class OrangeHRMAdminMobulePage {

	/**
	 * @return the user_first_table_row test object
	 */
	private TestObject getUser_first_table_row() {
		TestObject user_first_table_row = findTestObject('Object Repository/OrangeHRM/AdminModulePage/user_first_table_row');
		return user_first_table_row;
	}

	/**
	 * @return the user_name test object
	 */
	private TestObject getUsername() {
		TestObject user_name = findTestObject('Object Repository/OrangeHRM/AdminModulePage/user_name');
		return user_name;
	}

	/**
	 * @return the user_role test object
	 */
	private TestObject getUser_role() {
		TestObject user_role = findTestObject('Object Repository/OrangeHRM/AdminModulePage/user_role');
		return user_role;
	}
	
	/**
	 * @return the employee_name test object
	 */
	private TestObject getEmployee_name() {
		TestObject employee_name= findTestObject('Object Repository/OrangeHRM/AdminModulePage/employee_name');
		return employee_name;
	}
	/**
	 * @return the user_status test object
	 */
	private TestObject getUser_status() {
		TestObject user_status = findTestObject('Object Repository/OrangeHRM/AdminModulePage/user_status');
		return user_status;
	}

	/**
	 * @return the user_table_rows
	 */
	private TestObject getUser_table_rows() {
		TestObject user_table_rows = findTestObject('Object Repository/OrangeHRM/AdminModulePage/user_table_rows');
		return user_table_rows;
	}

	/**
	 * @return the employee_names_xpath
	 */
	private String getEmployee_names_xpath() {
		String user_table_rows_xpath =  getUser_table_rows().getSelectorCollection().getAt(XPATH)
		String employee_name_xpath = getEmployee_name().getSelectorCollection().getAt(XPATH)
		return user_table_rows_xpath + employee_name_xpath;
	}
	/**
	 * @return the employee_name_input
	 */
	private TestObject getEmployee_name_input() {
		TestObject employee_name_input = findTestObject('Object Repository/OrangeHRM/AdminModulePage/employee_name_input');
		return employee_name_input
	}
	/**
	 * @return the search_button
	 */
	private TestObject getSearch_button() {
		TestObject search_button = findTestObject('Object Repository/OrangeHRM/AdminModulePage/search_button');
		return search_button
	}
	
	/**
	 * @return the employee_name_first_item_dropdown
	 */
	private TestObject getEmployee_name_first_item_dropdown() {
		TestObject employee_name_first_item_dropdown = findTestObject('Object Repository/OrangeHRM/AdminModulePage/employee_name_first_item_dropdown');
		return employee_name_first_item_dropdown
	}
	
	def List<String> get_all_employee_names() {
		return BaseElement.get_webelements_inner_text(getEmployee_names_xpath())
	}
	
	def enter_employee_name(String employee_name) {
		BaseElement.enter_value(getEmployee_name_input(), employee_name)
	}

	def private TestObject create_employee_name_first_row_test_object() {
		String user_table_first_rows_xpath =  getUser_first_table_row().getSelectorCollection().getAt(XPATH)
		String employee_name_xpath = getEmployee_name().getSelectorCollection().getAt(XPATH)
		return BaseElement.create_test_object(user_table_first_rows_xpath + employee_name_xpath, 'XPATH')
	}
	
	def String get_employee_name_first_row() {
		return BaseElement.get_element_inner_text(create_employee_name_first_row_test_object())
	}
	
	def click_search_button() {
		BaseElement.click_element(getSearch_button())
	}

	def select_employee_name_from_dropdown() {
		BaseElement.mouse_over_by_js(getEmployee_name_first_item_dropdown())
	}
		
}

