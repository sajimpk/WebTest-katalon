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

WebUI.click(findTestObject('Object Repository/Login_user/Page_Bikroy - Electronics, Cars, Property a_43c6f0/a_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Login_user/Page_Bikroy - Electronics, Cars, Property a_43c6f0/button_Continue with Email'))

WebUI.delay(2)

WebUI.setText(findTestObject('Login_user/Page_Bikroy - Electronics, Cars, Property a_43c6f0/Page_Bikroy - Electronics, Cars, Property and Jobs in Bangladesh/input_View and manage your ads at your convenience_email'), 
    'fuzzyaidan@fthcapital.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Login_user/Page_Bikroy - Electronics, Cars, Property a_43c6f0/Page_Bikroy - Electronics, Cars, Property and Jobs in Bangladesh/input_Email_password'), 
    'fuzzyaidan@')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Login_user/Page_Bikroy - Electronics, Cars, Property a_43c6f0/button_Login'))

WebUI.verifyTextNotPresent('Login', false)

WebUI.delay(2)

WebUI.closeBrowser()

