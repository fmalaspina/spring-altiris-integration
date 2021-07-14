package com.ctl.altiris.app;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SOAPConnector extends WebServiceGatewaySupport {

	public Object callWebService(String url, Object request, SoapActionCallback soapActionCallback){
		return getWebServiceTemplate().marshalSendAndReceive(url, request, soapActionCallback);
	}
}