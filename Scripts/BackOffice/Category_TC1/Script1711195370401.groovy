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

WebUI.navigateToUrl('http://18.140.98.114:8080/back-office-category')

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Category Management Page/edit_button'))

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Category Management Page/add_button'))

WebUI.verifyElementText(findTestObject('Back-Office/Page_Category Management Page/newcategory_name'), '<New Category>')

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Category Management Page/edit_button'))

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Category Management Page/tickbox'))

WebUI.click(findTestObject('Object Repository/Back-Office/Page_Category Management Page/delete_button'))

WebUI.setText(findTestObject('Object Repository/Back-Office/Page_Category Management Page/search_bar'), 'Fiction')

WebUI.sendKeys(findTestObject('Object Repository/Back-Office/Page_Category Management Page/search_bar'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Category Management Page/searchname1'), category_name1)

WebUI.verifyElementText(findTestObject('Object Repository/Back-Office/Page_Category Management Page/searchname2'), category_name2)

WebUI.closeBrowser()

