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

WebUI.navigateToUrl('https://bikroy.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/category_mobile/Page_Bikroy - Electronics, Cars, Property a_43c6f0/p_Mobiles'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/span_Date Newest on top_dd-button-icon--1m7_6bc21d'), 
    0)

WebUI.click(findTestObject('Object Repository/category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/span_Date Newest on top_dd-button-icon--1m7_6bc21d'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/li_Price Low to high'), 
    0)

WebUI.click(findTestObject('Object Repository/category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/li_Price Low to high'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/span_Filter ads by_label-text-span--2LWsk'), 
    0)

WebUI.click(findTestObject('Object Repository/category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/span_Filter ads by_label-text-span--2LWsk'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/span_All_dd-button-icon--1m72e dd-button-ic_f65a86'), 
    0)

WebUI.click(findTestObject('Object Repository/category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/span_All_dd-button-icon--1m72e dd-button-ic_f65a86'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/li_Members'), 
    0)

WebUI.click(findTestObject('Object Repository/category_mobile/Page_Mobiles and Accessories for Sale at Be_625525/li_Members'))

WebUI.delay(2)

WebUI.closeBrowser()

