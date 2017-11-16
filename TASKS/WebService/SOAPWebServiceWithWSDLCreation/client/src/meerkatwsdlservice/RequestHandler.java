package meerkatwsdlservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2017-08-30T12:09:45.682+05:30
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://meerkatWSDLservice/", name = "RequestHandler")
@XmlSeeAlso({ObjectFactory.class})
public interface RequestHandler {

    @WebMethod(operationName = "ServiceProvider")
    @RequestWrapper(localName = "ServiceProvider", targetNamespace = "http://meerkatWSDLservice/", className = "meerkatwsdlservice.ServiceProvider")
    @ResponseWrapper(localName = "ServiceProviderResponse", targetNamespace = "http://meerkatWSDLservice/", className = "meerkatwsdlservice.ServiceProviderResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String serviceProvider(
        @WebParam(name = "arg0", targetNamespace = "")
        meerkatwsdlservice.Parameter arg0
    );
}
