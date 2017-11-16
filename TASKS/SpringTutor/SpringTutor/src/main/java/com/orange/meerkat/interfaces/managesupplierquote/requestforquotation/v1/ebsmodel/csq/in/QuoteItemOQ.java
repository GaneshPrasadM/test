
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteItem_OQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteItem_OQ"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}OfferSpecification_OQ"/&gt;
 *         &lt;element name="Site" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}Site" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteItem_OQ", propOrder = {
    "offerSpecification",
    "site"
})
public class QuoteItemOQ {

    @XmlElement(name = "OfferSpecification", required = true)
    protected OfferSpecificationOQ offerSpecification;
    @XmlElement(name = "Site")
    protected Site site;

    /**
     * Gets the value of the offerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OfferSpecificationOQ }
     *     
     */
    public OfferSpecificationOQ getOfferSpecification() {
        return offerSpecification;
    }

    /**
     * Sets the value of the offerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferSpecificationOQ }
     *     
     */
    public void setOfferSpecification(OfferSpecificationOQ value) {
        this.offerSpecification = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
    }

}
