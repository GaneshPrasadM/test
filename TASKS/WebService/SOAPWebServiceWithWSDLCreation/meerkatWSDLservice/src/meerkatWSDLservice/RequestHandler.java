package meerkatWSDLservice;

import javax.jws.WebService;

import meerkatBeanClass.Parameter;

@WebService(targetNamespace = "http://meerkatWSDLservice/", portName = "RequestHandlerPort", serviceName = "RequestHandlerService")
public class RequestHandler {
	
	
	public String ServiceProvider(Parameter parameter)
	{
	return parameter.getCity();
	}

}
