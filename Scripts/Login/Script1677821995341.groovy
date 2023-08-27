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

WebUI.navigateToUrl('https://startrax-online-stage.azurewebsites.net')

WebUI.setText(findTestObject('Object Repository/Page_Organization Set Up STAR Trax/input_We need to know your organization nam_ec3aa8'), 
    'Demo')

WebUI.click(findTestObject('Object Repository/Page_Organization Set Up STAR Trax/button_SAVE'))

WebUI.setText(findTestObject('Object Repository/Page_Login - US Med-Equip Identity Server/input_Log in to Demo_Request.Email'), 
    'pvardaro@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - US Med-Equip Identity Server/input_Log in to Demo_Request.Password'), 
    '8SQVv/p9jVTapUuLHn6lGw==')

WebUI.click(findTestObject('Object Repository/Page_Login - US Med-Equip Identity Server/button_LOGIN'))

