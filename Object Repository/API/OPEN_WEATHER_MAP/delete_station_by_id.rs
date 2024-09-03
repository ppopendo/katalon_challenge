<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>delete_station_by_id</name>
   <tag></tag>
   <elementGuidId>bc77b18b-aa51-48d0-a9d6-e30d8e87f19d</elementGuidId>
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
   <restRequestMethod>DELETE</restRequestMethod>
   <restUrl>https://${uri}${resource_station}/${station_id}?appid=${appid}</restUrl>
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
      <id>05806878-6e26-44d9-b78e-8321627a3ef7</id>
      <masked>false</masked>
      <name>appid</name>
   </variables>
   <variables>
      <defaultValue>'5be801c4199f0300011f2b8e'</defaultValue>
      <description></description>
      <id>630c0d2d-8475-4312-b821-c180e620a04b</id>
      <masked>false</masked>
      <name>station_id</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.RESOURCE_STATION</defaultValue>
      <description></description>
      <id>1afeb55b-8b8a-431e-bb3f-1616f8ebb27e</id>
      <masked>false</masked>
      <name>resource_station</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.URI</defaultValue>
      <description></description>
      <id>f6699066-b45a-492a-91bb-7e8d7b950ba0</id>
      <masked>false</masked>
      <name>uri</name>
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
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
