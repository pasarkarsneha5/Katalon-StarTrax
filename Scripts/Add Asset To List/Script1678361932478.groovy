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

WebUI.click(findTestObject('Object Repository/Page_Dashboard STAR Trax/a_Asset'))

WebUI.navigateToUrl('https://startraxonline.usmedequip.com/Asset')

WebUI.click(findTestObject('Object Repository/Page_Asset List STAR Trax/td_'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STAR Trax/label_'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STAR Trax/button_Create  Add To List'))

WebUI.setText(findTestObject('Object Repository/Page_Asset List STAR Trax/input_New Name_txtName'), 'FindList0001')

WebUI.click(findTestObject('Object Repository/Page_Asset List STAR Trax/input_Please select assets by checking the _2c57b4'))

WebUI.click(findTestObject('Object Repository/Page_Asset List STAR Trax/a_Find'))

WebUI.click(findTestObject('Object Repository/Page_Find Lists STAR Trax/th_Is equal to'))

WebUI.setText(findTestObject('Object Repository/Page_Find Lists STAR Trax/input_All_k-input'), 'FindList0001')

WebUI.click(findTestObject('Object Repository/Page_Find Lists STAR Trax/li_FindList0001'))

WebUI.setText(findTestObject('Object Repository/Page_Find Lists STAR Trax/input_All_k-input'), 'FindList0001')

WebUI.click(findTestObject('Object Repository/Page_Find Lists STAR Trax/td_Is equal to_k-hierarchy-cell'))

WebUI.click(findTestObject('Object Repository/Page_Find Lists STAR Trax/a_Is equal to_k-icon k-i-expand'))

