package pages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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


public class SauceDemoProductDetail {

	/**
	 * @return the add_to_cart_button
	 */
	private TestObject getAddtoCart_button() {
		TestObject add_to_cart_button = findTestObject('Object Repository/SAUCEDEMO/ProductDetailsPage/add_to_cart_button');		
		return add_to_cart_button;
	}

	/**
	 * @return the back_to_product_button
	 */
	private TestObject getBackToProduct_button() {
		TestObject back_to_product_button = findTestObject('Object Repository/SAUCEDEMO/ProductDetailsPage/back_to_products_button');
		return back_to_product_button;
	}
	
	/**
	 * @return the item_price
	 */
	private TestObject getItem_price() {
		TestObject item_price = findTestObject('Object Repository/SAUCEDEMO/ProductDetailsPage/item_price');
		return item_price;
	}

	/**
	 * @return the item_desc
	 */
	private TestObject getItem_desc() {
		TestObject item_desc = findTestObject('Object Repository/SAUCEDEMO/ProductDetailsPage/item_desc');
		return item_desc;
	}
	
	def add_product_to_cart() {
		BaseElement.click_element(getAddtoCart_button())
	}

	def get_item_price() {
		BaseElement.get_element_inner_text(getItem_price())
	}

	def get_item_desc() {
		BaseElement.get_element_inner_text(getItem_desc())
	}
	
	def back_to_products() {
		BaseElement.click_element(getBackToProduct_button())
	}
		
}

