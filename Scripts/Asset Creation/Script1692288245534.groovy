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

WebUI.click(findTestObject('Object Repository/Page_Dashboard STARTrax/a_Asset'))

WebUI.navigateToUrl('https://startrax-online-stage.azurewebsites.net/Asset')

WebUI.click(findTestObject('Object Repository/Page_Asset List STARTrax/input_Export_btn-create-entry'))

WebUI.setText(findTestObject('Object Repository/Page_Asset List STARTrax/input_Barcode_Barcode'), '870982')

WebUI.setText(findTestObject('Object Repository/Page_Asset List STARTrax/input_Serial Number_SerialNumber'), '060607')

WebUI.click(findTestObject('Object Repository/Page_Asset List STARTrax/span_--Please Select--_k-select'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STARTrax/li_V60'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STARTrax/span_--Please Select--'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STARTrax/li_Pediatrics Building'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STARTrax/span_--Please Select--_k-icon k-i-arrow-60-down'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STARTrax/li_Biomed Service'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STARTrax/button_Add'))

WebUI.closeBrowser()

