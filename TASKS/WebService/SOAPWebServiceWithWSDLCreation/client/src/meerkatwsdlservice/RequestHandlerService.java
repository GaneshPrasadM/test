package meerkatwsdlservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2017-08-30T12:09:45.689+05:30
 * Generated source version: 2.7.7
 * 
 */
@WebServiceClient(name = "RequestHandlerService", 
                  wsdlLocation = "file:/E:/TASKS/WebService/SOAPWebServiceWithWSDLCreation/client/src/wsdl/requesthandler.wsdl",
                  targetNamespace = "http://meerkatWSDLservice/") 
public class RequestHandlerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://meerkatWSDLservice/", "RequestHandlerService");
    public final static QName RequestHandlerPort = new QName("http://meerkatWSDLservice/", "RequestHandlerPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/TASKS/WebService/SOAPWebServiceWithWSDLCreation/client/src/wsdl/requesthandler.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RequestHandlerService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/TASKS/WebService/SOAPWebServiceWithWSDLCreation/client/src/wsdl/requesthandler.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RequestHandlerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RequestHandlerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RequestHandlerService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RequestHandlerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RequestHandlerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RequestHandlerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RequestHandler
     */
    @WebEndpoint(name = "RequestHandlerPort")
    public RequestHandler getRequestHandlerPort() {
        return super.getPort(RequestHandlerPort, RequestHandler.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RequestHandler
     */
    @WebEndpoint(name = "RequestHandlerPort")
    public RequestHandler getRequestHandlerPort(WebServiceFeature... features) {
        return super.getPort(RequestHandlerPort, RequestHandler.class, features);
    }

}
