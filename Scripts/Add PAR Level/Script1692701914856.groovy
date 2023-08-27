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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard STARTrax/a_PAR Level'))

WebUI.navigateToUrl('https://startrax-online-stage.azurewebsites.net/ParLevel')

WebUI.click(findTestObject('Object Repository/Page_PAR Level List STARTrax/input_Export_btn-create-entry'))

WebUI.click(findTestObject('Object Repository/Page_PAR Level List STARTrax/span_--Please Select--_k-select'))

WebUI.click(findTestObject('Object Repository/Page_PAR Level List STARTrax/li_3 East'))

WebUI.click(findTestObject('Object Repository/Page_PAR Level List STARTrax/span_--Please Select--_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_PAR Level List STARTrax/li_105'))

WebUI.setText(findTestObject('Object Repository/Page_PAR Level List STARTrax/input_Min PAR Level_Min'), '10')

WebUI.setText(findTestObject('Object Repository/Page_PAR Level List STARTrax/input_Max PAR Level_Max'), '15')

WebUI.click(findTestObject('Object Repository/Page_PAR Level List STARTrax/button_Add'))


WebUI.click(findTestObject('Object Repository/Page_PAR Level List STARTrax/a_Is equal to_k-icon k-i-expand'))

WebUI.closeBrowser()

