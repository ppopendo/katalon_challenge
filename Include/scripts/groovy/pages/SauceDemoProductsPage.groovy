package pages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.SelectorMethod.CSS
import static com.kms.katalon.core.testobject.SelectorMethod.XPATH

import java.util.stream.Collectors

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


public class SauceDemoProductsPage {

	/**
	 * @return the burger_menu_button
	 */
	private TestObject getBurger_menu_button() {
		TestObject burger_menu_button = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/burger_menu_button');
		return burger_menu_button;
	}

	/**
	 * @return the logout_link
	 */
	private TestObject getLogout_link() {
		TestObject logout_link = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/logout_link');
		return logout_link;
	}

	/**
	 * @return the sauce_labs_backpack_img
	 */
	private TestObject getSauce_labs_backpack_img() {
		TestObject sauce_labs_backpack_img = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/sauce_labs_backpack_img');
		return sauce_labs_backpack_img;
	}

	/**
	 * @return the item_container
	 */
	private TestObject getItem_container() {
		TestObject item_container = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/item_container');
		return item_container;
	}

	/**
	 * @return the item_desc
	 */
	private TestObject getItem_desc() {
		TestObject item_desc = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/item_desc');
		return item_desc;
	}

	/**
	 * @return the item_price
	 */
	private TestObject getItem_price() {
		TestObject item_price = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/item_price');
		return item_price;
	}

	/**
	 * @return the item_name
	 */
	private TestObject getItem_name() {
		TestObject item_name = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/item_name');
		return item_name;
	}

	/**
	 * @return the item_add_cart_button
	 */
	private TestObject getItem_add_cart_button() {
		TestObject item_add_cart_button = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/item_add_cart_button');
		return item_add_cart_button;
	}

	/**
	 * @return the items_shooping_cart
	 */
	private TestData getItems_shooping_cart() {
		TestData items_shooping_cart = findTestData('Data Files/SAUCEDEMO/items_add_to_shopping_cart')
		return items_shooping_cart;
	}

	/**
	 * @return the cart_count
	 */
	private TestObject getCart_count() {
		TestObject cart_count = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/cart_count')
		return cart_count;
	}

	/**
	 * @return the item_remove_button
	 */
	private TestObject getItem_remove_button() {
		TestObject item_remove_button = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/item_remove_button')
		return item_remove_button;
	}

	/**
	 * @return the shooping_cart_link
	 */
	private TestObject getShooping_cart_link() {
		TestObject shooping_cart_link = findTestObject('Object Repository/SAUCEDEMO/ProductsPage/shooping_cart_link')
		return shooping_cart_link;
	}

	def open_menu() {
		BaseElement.click_element(getBurger_menu_button())
	}

	def click_logout_link() {
		BaseElement.click_element(getLogout_link())
	}

	def logout_user() {
		open_menu()
		click_logout_link()
	}

	def is_sauce_labs_backpack_img_displayed() {
		BaseElement.wait_until_element_is_displayed(getSauce_labs_backpack_img())
	}

	def String get_item_price(String item_name) {
		return BaseElement.get_element_inner_text(create_item_price_test_object(item_name))
	}

	def String get_item_desc(String item_name) {
		return BaseElement.get_element_inner_text(create_item_desc_test_object(item_name))
	}

	def click_add_to_cart_button(String item_name) {
		return BaseElement.click_element(create_item_add_cart_button_test_object(item_name))
	}

	def click_remove_from_cart_button(String item_name) {
		return BaseElement.click_element(create_item_remove_cart_button_test_object(item_name))
	}

	def add_items_to_cart() {
		for (item_name in get_all_shooping_items()) {
			click_add_to_cart_button(item_name)
		}
	}

	def remove_items_from_cart() {
		for (item_name in get_all_shooping_items()) {
			click_remove_from_cart_button(item_name)
		}
	}

	def private String get_item_container_xpath(String item_name) {
		String item_container_xpath = getItem_container().getSelectorCollection().getAt(XPATH)
		return item_container_xpath.replace("<<item_name>>", item_name)
	}

	def private TestObject create_item_price_test_object(String item_name) {
		String item_price_xpath = getItem_price().getSelectorCollection().getAt(XPATH)
		item_price_xpath = get_item_container_xpath(item_name) + item_price_xpath
		return BaseElement.create_test_object(item_price_xpath, "XPATH", item_name)
	}

	def private TestObject create_item_desc_test_object(String item_name) {
		String item_desc_xpath = getItem_desc().getSelectorCollection().getAt(XPATH)
		item_desc_xpath = get_item_container_xpath(item_name) + item_desc_xpath
		return BaseElement.create_test_object(item_desc_xpath, "XPATH", item_name)
	}


	def private TestObject create_item_add_cart_button_test_object(String item_name) {
		String item_add_cart_button_xpath = getItem_add_cart_button().getSelectorCollection().getAt(XPATH)
		item_add_cart_button_xpath = get_item_container_xpath(item_name) + item_add_cart_button_xpath
		return BaseElement.create_test_object(item_add_cart_button_xpath, "XPATH", item_name)
	}


	def private TestObject create_item_remove_cart_button_test_object(String item_name) {
		String item_remove_cart_button_xpath = getItem_remove_button().getSelectorCollection().getAt(XPATH)
		item_remove_cart_button_xpath = get_item_container_xpath(item_name) + item_remove_cart_button_xpath
		return BaseElement.create_test_object(item_remove_cart_button_xpath, "XPATH", item_name)
	}

	def private TestObject create_item_name_test_object(String item_name) {
		String item_name_xpath = getItem_name().getSelectorCollection().getAt(XPATH)
		item_name_xpath = get_item_container_xpath(item_name) + item_name_xpath
		return BaseElement.create_test_object(item_name_xpath, "XPATH", item_name)
	}

	def private List get_all_shooping_items() {
		return getItems_shooping_cart().getAllData()
	}

	def int get_cart_count() {
		return BaseElement.get_element_inner_text(getCart_count()).toInteger()
	}

	def boolean is_cart_count_present() {
		return WebUI.verifyElementPresent(getCart_count(), 5, FailureHandling.OPTIONAL)
	}
	
	def boolean is_cart_count_empty() {
		return WebUI.verifyElementNotPresent(getCart_count(), 5, FailureHandling.OPTIONAL)
	}

	def open_item_name_details(String item_name) {
		BaseElement.click_element(create_item_name_test_object(item_name))
	}

	def open_shooping_cart() {
		BaseElement.click_element(getShooping_cart_link())
	}
}