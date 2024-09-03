import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import pages.SauceDemoProductsPage as ProductsPage
import pages.SauceDemoLoginPage as LoginPage
import seleniumlib.BaseElement
LoginPage login_page = new LoginPage()
BaseElement base_element = new BaseElement()
ProductsPage products_page = new ProductsPage()
WebUI.openBrowser(null)
base_element.navigate_to_url(GlobalVariable.URL)
login_page.log_in_user_with_visual_role()
products_page.logout_user()
WebUI.closeBrowser()
