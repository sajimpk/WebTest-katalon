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

WebUI.verifyElementPresent(findTestObject('search_product/Page_Bikroy - Electronics, Cars, Property a_43c6f0/input_All of Bangladesh_query'), 
    0)

WebUI.setText(findTestObject('Object Repository/search_product/Page_Bikroy - Electronics, Cars, Property a_43c6f0/input_All of Bangladesh_query'), 
    'laptop')

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('search_product/Page_Bikroy - Electronics, Cars, Property a_43c6f0/div_Laptop  Computer Accessories in Electronics'), 
    0)

WebUI.click(findTestObject('Object Repository/search_product/Page_Bikroy - Electronics, Cars, Property a_43c6f0/div_Laptop  Computer Accessories in Electronics'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('search_product/Page_7,598 Laptop and Computer Accessories _361970/span_Filter ads by_label-text-span--2LWsk'), 
    0)

WebUI.click(findTestObject('Object Repository/search_product/Page_7,598 Laptop and Computer Accessories _361970/span_Filter ads by_label-text-span--2LWsk'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('search_product/Page_Laptop and Computer Accessories for Sa_f582c6/span_Date Newest on top_dd-button-icon--1m7_6bc21d'), 
    0)

WebUI.click(findTestObject('Object Repository/search_product/Page_Laptop and Computer Accessories for Sa_f582c6/span_Date Newest on top_dd-button-icon--1m7_6bc21d'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('search_product/Page_2,351 Cameras, Camcorders  Accessories_76e6af/li_Price Low to high'), 
    0)

WebUI.click(findTestObject('Object Repository/search_product/Page_Laptop and Computer Accessories for Sa_f582c6/li_Price Low to high'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('search_product/Page_Laptop and Computer Accessories for Sa_f582c6/input_POST YOUR AD_query'), 
    0)

WebUI.setText(findTestObject('Object Repository/search_product/Page_Laptop and Computer Accessories for Sa_f582c6/input_POST YOUR AD_query'), 
    'camera')

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('search_product/Page_Laptop and Computer Accessories for Sa_f582c6/div_Cameras, Camcorders  Accessories in Ele_25a24b'), 
    0)

WebUI.click(findTestObject('Object Repository/search_product/Page_Laptop and Computer Accessories for Sa_f582c6/div_Cameras, Camcorders  Accessories in Ele_25a24b'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('search_product/Page_2,351 Cameras, Camcorders  Accessories_76e6af/span_Date Newest on top_dd-button-icon--1m7_6bc21d'), 
    0)

WebUI.click(findTestObject('Object Repository/search_product/Page_2,351 Cameras, Camcorders  Accessories_76e6af/span_Date Newest on top_dd-button-icon--1m7_6bc21d'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('search_product/Page_2,351 Cameras, Camcorders  Accessories_76e6af/li_Price Low to high'), 
    0)

WebUI.click(findTestObject('Object Repository/search_product/Page_2,351 Cameras, Camcorders  Accessories_76e6af/li_Price Low to high'))

WebUI.delay(2)

WebUI.closeBrowser()

