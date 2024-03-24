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

WebUI.navigateToUrl('http://18.140.98.114:8080/')

WebUI.click(findTestObject('Object Repository/FrontEnd/add quantity item/Page_Document/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/FrontEnd/add quantity item/Page_Document/a_Fiction_navbar-brand ms-auto'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/add quantity item/Page_Document/itemPrice'), itemPrice)

WebUI.verifyElementText(findTestObject('FrontEnd/add quantity item/Page_Document/total'), totalPrice)

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/add quantity item/Page_Document/subTotalPrice'), subTotalPrice)

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/add quantity item/Page_Document/estTotal'), estTotal)

WebUI.click(findTestObject('Object Repository/FrontEnd/add quantity item/Page_Document/button_add_quantity'))

WebUI.verifyElementText(findTestObject('FrontEnd/add quantity item/Page_Document/total'), updateTotalPrice)

WebUI.verifyElementText(findTestObject('FrontEnd/add quantity item/Page_Document/subTotalPrice'), updateSubTotalPrice)

WebUI.verifyElementText(findTestObject('FrontEnd/add quantity item/Page_Document/estTotal'), updateEstTotal)

WebUI.click(findTestObject('Object Repository/FrontEnd/add quantity item/Page_Document/button_Checkout'))

WebUI.click(findTestObject('Object Repository/FrontEnd/add quantity item/Page_Document/button_Continue'))

WebUI.closeBrowser()

