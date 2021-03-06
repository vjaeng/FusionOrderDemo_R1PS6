<?xml version="1.0" encoding="UTF-8" ?>
<?oracle-xsl-mapper
  <!-- SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY. -->
  <mapSources>
    <source type="XSD">
      <schema location="../../SensorActionSensorAction_1.xsd"/>
      <rootElement name="actionData" namespace="http://xmlns.oracle.com/bpel/sensor"/>
    </source>
  </mapSources>
  <mapTargets>
    <target type="WSDL">
      <schema location="../Demos/Fusion%20Order%20Demo/Customer.wsdl"/>
      <rootElement name="_CustomerCollection" namespace="http://xmlns.oracle.com/bam"/>
    </target>
  </mapTargets>
  <!-- GENERATED BY ORACLE XSL MAPPER 11.1.1.0.0(build 081114.0800.2172) AT [FRI NOV 14 11:38:47 PST 2008]. -->
?>
<xsl:stylesheet version="1.0"
                xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/"
                xmlns:xpath20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:ns6="http://xmlns.oracle.com/bam"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:sensor="www.globalcompany.example.com/types/"
                xmlns:ora="http://schemas.oracle.com/xpath/extension"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                xmlns:ns3="http://xmlns.oracle.com/adf/svc/errors/"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:tns="http://xmlns.oracle.com/bpel/sensor"
                xmlns:ns1="commonj.sdo/xml"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:ns2="http://xmlns.oracle.com/adf/svc/types/"
                xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.GetRequestHeaderExtnFunction"
                xmlns:med="http://schemas.oracle.com/mediator/xpath"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:ns4="commonj.sdo/java"
                xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath"
                xmlns:ns5="/oracle/fodemo/storefront/store/queries/common/"
                xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:nxsd="http://xmlns.oracle.com/pcbpel/nxsd"
                xmlns:ns0="commonj.sdo"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap"
                exclude-result-prefixes="xsi xsl sensor ns3 tns ns1 ns2 ns4 ns5 nxsd ns0 xsd ns6 xsi bpws xpath20 ora socket oraext dvm hwf mhdr med ids xdk xref ldap">
  <xsl:template match="/">
    <ns6:_CustomerCollection>
      <ns6:_Customer>
        <ns6:_CustomerID>
          <xsl:value-of select="/tns:actionData/tns:payload/tns:variableData/tns:data/sensor:findCustomerInfoVO1CustomerInfoVOCriteriaResponse/sensor:result/ns5:PersonId"/>
        </ns6:_CustomerID>
        <ns6:_FirstName>
          <xsl:value-of select="/tns:actionData/tns:payload/tns:variableData/tns:data/sensor:findCustomerInfoVO1CustomerInfoVOCriteriaResponse/sensor:result/ns5:FirstName"/>
        </ns6:_FirstName>
        <ns6:_LastName>
          <xsl:value-of select="/tns:actionData/tns:payload/tns:variableData/tns:data/sensor:findCustomerInfoVO1CustomerInfoVOCriteriaResponse/sensor:result/ns5:LastName"/>
        </ns6:_LastName>
        <ns6:_MembershipID>
          <xsl:value-of select="/tns:actionData/tns:payload/tns:variableData/tns:data/sensor:findCustomerInfoVO1CustomerInfoVOCriteriaResponse/sensor:result/ns5:MembershipId"/>
        </ns6:_MembershipID>
        <ns6:_MembershipType>
          <xsl:value-of select="/tns:actionData/tns:payload/tns:variableData/tns:data/sensor:findCustomerInfoVO1CustomerInfoVOCriteriaResponse/sensor:result/ns5:MembershipTypeCode"/>
        </ns6:_MembershipType>
      </ns6:_Customer>
    </ns6:_CustomerCollection>
  </xsl:template>
</xsl:stylesheet>
