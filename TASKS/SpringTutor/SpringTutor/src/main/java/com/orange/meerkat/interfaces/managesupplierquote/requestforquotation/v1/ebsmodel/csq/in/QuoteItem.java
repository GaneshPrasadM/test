
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quoteItemID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OfferSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}OfferSpecification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteItem", propOrder = {
    "quoteItemID",
    "offerSpecification"
})
public class QuoteItem {

    @XmlElement(required = true)
    protected String quoteItemID;
    @XmlElement(name = "OfferSpecification", required = true)
    protected OfferSpecification offerSpecification;

    /**
     * Gets the value of the quoteItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteItemID() {
        return quoteItemID;
    }

    /**
     * Sets the value of the quoteItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteItemID(String value) {
        this.quoteItemID = value;
    }

    /**
     * Gets the value of the offerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OfferSpecification }
     *     
     */
    public OfferSpecification getOfferSpecification() {
        return offerSpecification;
    }

    /**
     * Sets the value of the offerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferSpecification }
     *     
     */
    public void setOfferSpecification(OfferSpecification value) {
        this.offerSpecification = value;
    }

}
