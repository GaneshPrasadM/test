
package meerkatwsdlservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the meerkatwsdlservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceProvider_QNAME = new QName("http://meerkatWSDLservice/", "ServiceProvider");
    private final static QName _ServiceProviderResponse_QNAME = new QName("http://meerkatWSDLservice/", "ServiceProviderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: meerkatwsdlservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceProvider }
     * 
     */
    public ServiceProvider createServiceProvider() {
        return new ServiceProvider();
    }

    /**
     * Create an instance of {@link ServiceProviderResponse }
     * 
     */
    public ServiceProviderResponse createServiceProviderResponse() {
        return new ServiceProviderResponse();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://meerkatWSDLservice/", name = "ServiceProvider")
    public JAXBElement<ServiceProvider> createServiceProvider(ServiceProvider value) {
        return new JAXBElement<ServiceProvider>(_ServiceProvider_QNAME, ServiceProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://meerkatWSDLservice/", name = "ServiceProviderResponse")
    public JAXBElement<ServiceProviderResponse> createServiceProviderResponse(ServiceProviderResponse value) {
        return new JAXBElement<ServiceProviderResponse>(_ServiceProviderResponse_QNAME, ServiceProviderResponse.class, null, value);
    }

}
