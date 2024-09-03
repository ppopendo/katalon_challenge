<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>station_by_id</name>
   <tag></tag>
   <elementGuidId>5b505bed-e122-4d4c-bd2a-407510a091b0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>9.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://${uri}${resource}/${station_id}?appid=${appid}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.APPID</defaultValue>
      <description></description>
      <id>5f8cb24c-ff80-4336-8e32-f173bd83d2bc</id>
      <masked>false</masked>
      <name>appid</name>
   </variables>
   <variables>
      <defaultValue>'5be9982b199f0300011f2b92'</defaultValue>
      <description></description>
      <id>ec36960d-8bdb-44a1-88e2-a3e30b6c0b78</id>
      <masked>false</masked>
      <name>station_id</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.URI</defaultValue>
      <description></description>
      <id>93c0d094-bccd-428a-975a-07572f67a8d0</id>
      <masked>false</masked>
      <name>uri</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.RESOURCE_STATION</defaultValue>
      <description></description>
      <id>176b37cb-5ef5-4649-af04-616c6363c63f</id>
      <masked>false</masked>
      <name>resource</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
