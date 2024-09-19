<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>weather_by_city</name>
   <tag></tag>
   <elementGuidId>eb0667aa-a25b-4369-8d02-09fc7a821327</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>e4bc1d0d-ad91-4000-b7bd-7f94d0639be0</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>utf-8</value>
      <webElementGuid>fb46cf51-8d53-4399-82f9-f428839abf2d</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://${uri}${resource}?appid=${appid}&amp;q=${cityname}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <validationSteps>
      <id>601daf9d-66c3-4bac-baeb-4c852b3eb099</id>
      <name>New Validation</name>
      <type>AUTO_DETECT</type>
      <dataType>AUTO</dataType>
      <target>RESPONSE</target>
      <data></data>
      <activate>true</activate>
   </validationSteps>
   <variables>
      <defaultValue>GlobalVariable.URI</defaultValue>
      <description></description>
      <id>e0512572-e827-4734-9bd0-1278c4cf5415</id>
      <masked>false</masked>
      <name>uri</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.RESOURCE_WEATHER_DATA</defaultValue>
      <description></description>
      <id>16a6ed52-db80-4f85-bfb9-d82891e2dee6</id>
      <masked>false</masked>
      <name>resource</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.APPID</defaultValue>
      <description></description>
      <id>a57722a5-cab1-4918-aaa3-cefde1f38bf1</id>
      <masked>false</masked>
      <name>appid</name>
   </variables>
   <variables>
      <defaultValue>'Kaczory'</defaultValue>
      <description></description>
      <id>909603a9-f0b9-4f31-b495-cf8e45b8f9b9</id>
      <masked>false</masked>
      <name>cityname</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseText())

WS.verifyElementPropertyValue(response, 'name', 'Kaczory')
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
