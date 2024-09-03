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

import groovy.json.JsonSlurper
def json_slurper = new JsonSlurper()

/*
 *add the new station 
 */
def response = WS.sendRequest(findTestObject('API/OPEN_WEATHER_MAP/add_station', [('external_station_id') : external_station_id, ('station_name') : station_name
            , ('latitude') : latitude, ('longitude') : longitude, ('altitude') : altitude, ('uri') : GlobalVariable.URI, ('resource_stations') : GlobalVariable.RESOURCE_STATION
            , ('appid') : GlobalVariable.APPID]));
		
WS.delay(GlobalVariable.API_DEFAULT_SLEEP);
WS.verifyResponseStatusCode(response, status_code);
WS.verifyElementPropertyValue(response, 'external_id', external_station_id);
WS.verifyElementPropertyValue(response, 'name', station_name);
WS.verifyElementPropertyValue(response, 'latitude', latitude);
WS.verifyElementPropertyValue(response, 'longitude',longitude );
WS.verifyElementPropertyValue(response, 'altitude', altitude);

println json_slurper.parseText(response.getResponseText())
String created_station_id = json_slurper.parseText(response.getResponseText())['ID']
println created_station_id

/*
 *get newly added station
 */
response = WS.sendRequest(findTestObject('API/OPEN_WEATHER_MAP/station_by_id', [('appid') : GlobalVariable.APPID, ('station_id') : created_station_id
	, ('uri') : GlobalVariable.URI, ('resource') : GlobalVariable.RESOURCE_STATION]))

WS.delay(GlobalVariable.API_DEFAULT_SLEEP)

/*
 *update newly added station
 */
response = WS.sendRequestAndVerify(findTestObject('API/OPEN_WEATHER_MAP/update_station', [('uri') : GlobalVariable.URI, ('resource_stations') : GlobalVariable.RESOURCE_STATION
	, ('appid') : GlobalVariable.APPID, ('external_station_id') : external_station_id, ('station_name') : station_name_update, ('latitude') : latitude, ('longitude') : longitude
	, ('altitude') : altitude, ('station_id') : created_station_id]))
WS.delay(GlobalVariable.API_DEFAULT_SLEEP)
/*
 *delete newly added station
 */
response = WS.sendRequest(findTestObject('API/OPEN_WEATHER_MAP/delete_station_by_id', [('appid') : GlobalVariable.APPID, ('station_id') : created_station_id
	, ('resource_station') : GlobalVariable.RESOURCE_STATION, ('uri') : GlobalVariable.URI]))

WS.delay(GlobalVariable.API_DEFAULT_SLEEP)
