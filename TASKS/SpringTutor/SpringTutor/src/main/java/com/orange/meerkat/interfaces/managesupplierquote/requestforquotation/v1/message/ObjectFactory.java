
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.message;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.message package. 
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

    private final static QName _CalculateSupplierQuote_QNAME = new QName("http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", "CalculateSupplierQuote");
    private final static QName _CalculateSupplierQuoteFault_QNAME = new QName("http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", "CalculateSupplierQuoteFault");
    private final static QName _CalculateSupplierQuoteResponse_QNAME = new QName("http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", "CalculateSupplierQuoteResponse");
    private final static QName _UpdateSupplierQuote_QNAME = new QName("http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", "UpdateSupplierQuote");
    private final static QName _UpdateSupplierQuoteFault_QNAME = new QName("http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", "UpdateSupplierQuoteFault");
    private final static QName _UpdateSupplierQuoteResponse_QNAME = new QName("http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", "UpdateSupplierQuoteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateSupplierQuote }
     * 
     */
    public CalculateSupplierQuote createCalculateSupplierQuote() {
        return new CalculateSupplierQuote();
    }

    /**
     * Create an instance of {@link CalculateSupplierQuoteFault }
     * 
     */
    public CalculateSupplierQuoteFault createCalculateSupplierQuoteFault() {
        return new CalculateSupplierQuoteFault();
    }

    /**
     * Create an instance of {@link CalculateSupplierQuoteResponse }
     * 
     */
    public CalculateSupplierQuoteResponse createCalculateSupplierQuoteResponse() {
        return new CalculateSupplierQuoteResponse();
    }

    /**
     * Create an instance of {@link UpdateSupplierQuote }
     * 
     */
    public UpdateSupplierQuote createUpdateSupplierQuote() {
        return new UpdateSupplierQuote();
    }

    /**
     * Create an instance of {@link UpdateSupplierQuoteFault }
     * 
     */
    public UpdateSupplierQuoteFault createUpdateSupplierQuoteFault() {
        return new UpdateSupplierQuoteFault();
    }

    /**
     * Create an instance of {@link UpdateSupplierQuoteResponse }
     * 
     */
    public UpdateSupplierQuoteResponse createUpdateSupplierQuoteResponse() {
        return new UpdateSupplierQuoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSupplierQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", name = "CalculateSupplierQuote")
    public JAXBElement<CalculateSupplierQuote> createCalculateSupplierQuote(CalculateSupplierQuote value) {
        return new JAXBElement<CalculateSupplierQuote>(_CalculateSupplierQuote_QNAME, CalculateSupplierQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSupplierQuoteFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", name = "CalculateSupplierQuoteFault")
    public JAXBElement<CalculateSupplierQuoteFault> createCalculateSupplierQuoteFault(CalculateSupplierQuoteFault value) {
        return new JAXBElement<CalculateSupplierQuoteFault>(_CalculateSupplierQuoteFault_QNAME, CalculateSupplierQuoteFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSupplierQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", name = "CalculateSupplierQuoteResponse")
    public JAXBElement<CalculateSupplierQuoteResponse> createCalculateSupplierQuoteResponse(CalculateSupplierQuoteResponse value) {
        return new JAXBElement<CalculateSupplierQuoteResponse>(_CalculateSupplierQuoteResponse_QNAME, CalculateSupplierQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSupplierQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", name = "UpdateSupplierQuote")
    public JAXBElement<UpdateSupplierQuote> createUpdateSupplierQuote(UpdateSupplierQuote value) {
        return new JAXBElement<UpdateSupplierQuote>(_UpdateSupplierQuote_QNAME, UpdateSupplierQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSupplierQuoteFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", name = "UpdateSupplierQuoteFault")
    public JAXBElement<UpdateSupplierQuoteFault> createUpdateSupplierQuoteFault(UpdateSupplierQuoteFault value) {
        return new JAXBElement<UpdateSupplierQuoteFault>(_UpdateSupplierQuoteFault_QNAME, UpdateSupplierQuoteFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSupplierQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/message", name = "UpdateSupplierQuoteResponse")
    public JAXBElement<UpdateSupplierQuoteResponse> createUpdateSupplierQuoteResponse(UpdateSupplierQuoteResponse value) {
        return new JAXBElement<UpdateSupplierQuoteResponse>(_UpdateSupplierQuoteResponse_QNAME, UpdateSupplierQuoteResponse.class, null, value);
    }

}
