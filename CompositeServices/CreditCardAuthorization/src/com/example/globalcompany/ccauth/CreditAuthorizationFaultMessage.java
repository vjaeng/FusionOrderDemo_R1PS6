package com.example.globalcompany.ccauth;

import javax.xml.ws.WebFault;

@WebFault(faultBean="java.lang.String", targetNamespace="http://www.globalcompany.example.com/ns/CCAuthorizationService",
  name="error")
public class CreditAuthorizationFaultMessage
  extends Exception
{
  private String faultInfo;

  public CreditAuthorizationFaultMessage(String message, String faultInfo)
  {
    super(message);
    this.faultInfo = faultInfo;
  }

  public CreditAuthorizationFaultMessage(String message, String faultInfo,
                                         Throwable t)
  {
    super(message,t);
    this.faultInfo = faultInfo;
  }

  public String getFaultInfo()
  {
    return faultInfo;
  }

  public void setFaultInfo(String faultInfo)
  {
    this.faultInfo = faultInfo;
  }
}
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 080815.0851.38509)
