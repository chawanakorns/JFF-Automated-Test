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

WebUI.navigateToUrl('http://18.140.98.114:8080/search?q=')

WebUI.verifyElementText(findTestObject('FrontEnd/Categories test/Page_Document/nonBook'), nonSelectBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxFiction'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/fictionBook'), fictionBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxFiction'))

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxNonFiction'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/nonFictionBook'), nonfictionBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxNonFiction'))

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxChild'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/childBook'), childBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxChild'))

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxNovel'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/novelBook'), novelBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxNovel'))

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxRef'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/refBook'), refBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxRef'))

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxPerdev'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/perdevBook'), perdevBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxPerdev'))

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/cookCheckbox'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/nonBook'), nonSelectBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/cookCheckbox'))

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxTravel'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/travelBook'), travelBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/checkboxTravel'))

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/poetryCheckbox'))

WebUI.verifyElementText(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/poetryBook'), poetryBook)

WebUI.click(findTestObject('Object Repository/FrontEnd/Categories test/Page_Document/poetryCheckbox'))

WebUI.closeBrowser()

