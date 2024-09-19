<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>update_station</name>
   <tag></tag>
   <elementGuidId>a869a12c-d3b7-4d41-a481-01dbfed90d3b</elementGuidId>
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
      <webElementGuid>df7d118f-71c5-4d87-8b93-7f01eba9e4a7</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://${uri}${resource_stations}/${station_id}?appid=${appid}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URI</defaultValue>
      <description></description>
      <id>7d0b1062-6eee-4655-81f7-f0d5a029033b</id>
      <masked>false</masked>
      <name>uri</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.RESOURCE_STATION</defaultValue>
      <description></description>
      <id>af1416e4-a603-4b5c-9d6a-2d3500471762</id>
      <masked>false</masked>
      <name>resource_stations</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.APPID</defaultValue>
      <description></description>
      <id>1b28900d-511e-4651-b1fb-575b112b6f76</id>
      <masked>false</masked>
      <name>appid</name>
   </variables>
   <variables>
      <defaultValue>'chyba-ty'</defaultValue>
      <description></description>
      <id>2fb44c4b-a61f-4fa4-8ba5-dde7ab144137</id>
      <masked>false</masked>
      <name>external_station_id</name>
   </variables>
   <variables>
      <defaultValue>'zimna wodka'</defaultValue>
      <description></description>
      <id>95e491fd-a898-491e-a253-cb778d72e95e</id>
      <masked>false</masked>
      <name>station_name</name>
   </variables>
   <variables>
      <defaultValue>11</defaultValue>
      <description></description>
      <id>d1a67a23-3e91-4a8a-8ad2-fcdcb830bdba</id>
      <masked>false</masked>
      <name>latitude</name>
   </variables>
   <variables>
      <defaultValue>44</defaultValue>
      <description></description>
      <id>e443af9a-fe7f-4ca6-8df0-5d8843f32758</id>
      <masked>false</masked>
      <name>longitude</name>
   </variables>
   <variables>
      <defaultValue>88</defaultValue>
      <description></description>
      <id>22049493-dc37-4d75-bd30-a9c8e32fdc78</id>
      <masked>false</masked>
      <name>altitude</name>
   </variables>
   <variables>
      <defaultValue>'5be9982b199f0300011f2b92'</defaultValue>
      <description></description>
      <id>f1cc9909-5126-4715-99b6-3f8e70b11633</id>
      <masked>false</masked>
      <name>station_id</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
println request.getRestUrl().toString()
println request.bodyContent
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
println response.getResponseText().toString()
WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
