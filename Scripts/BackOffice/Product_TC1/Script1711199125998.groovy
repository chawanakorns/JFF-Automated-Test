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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.140.98.114:8080/back-office-product')

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/product_id_cell'), product_id)

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/product_name_cell'), 
    product_name)

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/category_id'), category_id)

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/product_image_id_cell'), 
    product_image_id)

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/stock_cell'), stock)

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/salecount_cell'), salecount)

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/product_price_cell'), 
    product_price)

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/product_price_promotion_cell'), 
    product_price_promotion)

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Product Management Page/button_Edit'))

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Product Management Page/button_Add'))

WebUI.setText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/input_Restock_page-number'), '6')

WebUI.sendKeys(findTestObject('Object Repository/Back-Office/Page_Product Management Page/input_Restock_page-number'), Keys.chord(
        Keys.ENTER))

WebUI.navigateToUrl('http://18.140.98.114:8080/back-office-product?page=6')

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Product Management Page/td_New Product'))

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Product Management Page/button_Edit'))

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Product Management Page/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Product Management Page/button_Delete'))

WebUI.setText(findTestObject('Object Repository/Back-Office/Page_Product Management Page/input_Submit_search'), 'new product')

WebUI.sendKeys(findTestObject('Object Repository/Back-Office/Page_Product Management Page/input_Submit_search'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Product Management Page/td_No items available'))

WebUI.closeBrowser()

