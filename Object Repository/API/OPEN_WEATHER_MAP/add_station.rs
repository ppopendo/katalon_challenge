<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>add_station</name>
   <tag></tag>
   <elementGuidId>6d5ed6f3-5faf-4923-8e6b-0b157b2d8b31</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;external_id\&quot;: \&quot;${external_station_id}\&quot;,\n    \&quot;name\&quot;: \&quot;${station_name}\&quot;,\n    \&quot;latitude\&quot;: ${latitude},\n    \&quot;longitude\&quot;: ${longitude},\n    \&quot;altitude\&quot;: ${altitude}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>b9069ce8-a770-4d64-a199-385910281bf3</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://${uri}${resource_stations}?appid=${appid}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'SOMSIAD'</defaultValue>
      <description></description>
      <id>3739b8b2-1122-4b5b-b7a4-efb4a62f8929</id>
      <masked>false</masked>
      <name>external_station_id</name>
   </variables>
   <variables>
      <defaultValue>'LoremIpsum'</defaultValue>
      <description></description>
      <id>b6666faf-6908-4300-8bc3-5a08dcdb7d9e</id>
      <masked>false</masked>
      <name>station_name</name>
   </variables>
   <variables>
      <defaultValue>11</defaultValue>
      <description></description>
      <id>d984dc3f-e113-4716-803b-70ee06afdcb9</id>
      <masked>false</masked>
      <name>latitude</name>
   </variables>
   <variables>
      <defaultValue>22</defaultValue>
      <description></description>
      <id>43028faf-f169-45d3-8f48-bfb756a422c3</id>
      <masked>false</masked>
      <name>longitude</name>
   </variables>
   <variables>
      <defaultValue>44</defaultValue>
      <description></description>
      <id>00e05a02-4844-4473-9ad7-ff0304db74ae</id>
      <masked>false</masked>
      <name>altitude</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.URI</defaultValue>
      <description></description>
      <id>b3ef0e3d-a90f-45fb-9f3f-c957347e1733</id>
      <masked>false</masked>
      <name>uri</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.RESOURCE_STATION</defaultValue>
      <description></description>
      <id>1395106d-e769-4727-ad95-2b44b4c71c35</id>
      <masked>false</masked>
      <name>resource_stations</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.APPID</defaultValue>
      <description></description>
      <id>db961870-e46c-45b7-86fc-12b6ce5e6893</id>
      <masked>false</masked>
      <name>appid</name>
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
