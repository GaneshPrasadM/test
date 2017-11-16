
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.out;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="local_refId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quoteItemID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="local_MeerkatQuoteItemID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="local_externalQuoteItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="local_eligibilityresponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="local_pricingresponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="local_validityStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="local_validityEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="local_responseType" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/Out}local_responseType"/&gt;
 *         &lt;element name="local_responseStatus" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/Out}local_responseStatus"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferSpecification" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/Out}OfferSpecification"/&gt;
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
    "localRefId",
    "quoteItemID",
    "localMeerkatQuoteItemID",
    "localExternalQuoteItemID",
    "localEligibilityresponse",
    "localPricingresponse",
    "localValidityStartDate",
    "localValidityEndDate",
    "localResponseType",
    "localResponseStatus",
    "comments",
    "offerSpecification"
})
public class QuoteItem {

    @XmlElement(name = "local_refId", required = true)
    protected String localRefId;
    @XmlElement(required = true)
    protected String quoteItemID;
    @XmlElement(name = "local_MeerkatQuoteItemID", required = true)
    protected String localMeerkatQuoteItemID;
    @XmlElement(name = "local_externalQuoteItemID")
    protected String localExternalQuoteItemID;
    @XmlElement(name = "local_eligibilityresponse")
    protected boolean localEligibilityresponse;
    @XmlElement(name = "local_pricingresponse")
    protected boolean localPricingresponse;
    @XmlElement(name = "local_validityStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localValidityStartDate;
    @XmlElement(name = "local_validityEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localValidityEndDate;
    @XmlElement(name = "local_responseType", required = true)
    @XmlSchemaType(name = "string")
    protected LocalResponseType localResponseType;
    @XmlElement(name = "local_responseStatus", required = true)
    @XmlSchemaType(name = "string")
    protected LocalResponseStatus localResponseStatus;
    protected String comments;
    @XmlElement(name = "OfferSpecification", required = true)
    protected OfferSpecification offerSpecification;

    /**
     * Gets the value of the localRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRefId() {
        return localRefId;
    }

    /**
     * Sets the value of the localRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalRefId(String value) {
        this.localRefId = value;
    }

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
     * Gets the value of the localMeerkatQuoteItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalMeerkatQuoteItemID() {
        return localMeerkatQuoteItemID;
    }

    /**
     * Sets the value of the localMeerkatQuoteItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalMeerkatQuoteItemID(String value) {
        this.localMeerkatQuoteItemID = value;
    }

    /**
     * Gets the value of the localExternalQuoteItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalExternalQuoteItemID() {
        return localExternalQuoteItemID;
    }

    /**
     * Sets the value of the localExternalQuoteItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalExternalQuoteItemID(String value) {
        this.localExternalQuoteItemID = value;
    }

    /**
     * Gets the value of the localEligibilityresponse property.
     * 
     */
    public boolean isLocalEligibilityresponse() {
        return localEligibilityresponse;
    }

    /**
     * Sets the value of the localEligibilityresponse property.
     * 
     */
    public void setLocalEligibilityresponse(boolean value) {
        this.localEligibilityresponse = value;
    }

    /**
     * Gets the value of the localPricingresponse property.
     * 
     */
    public boolean isLocalPricingresponse() {
        return localPricingresponse;
    }

    /**
     * Sets the value of the localPricingresponse property.
     * 
     */
    public void setLocalPricingresponse(boolean value) {
        this.localPricingresponse = value;
    }

    /**
     * Gets the value of the localValidityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalValidityStartDate() {
        return localValidityStartDate;
    }

    /**
     * Sets the value of the localValidityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalValidityStartDate(XMLGregorianCalendar value) {
        this.localValidityStartDate = value;
    }

    /**
     * Gets the value of the localValidityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalValidityEndDate() {
        return localValidityEndDate;
    }

    /**
     * Sets the value of the localValidityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalValidityEndDate(XMLGregorianCalendar value) {
        this.localValidityEndDate = value;
    }

    /**
     * Gets the value of the localResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link LocalResponseType }
     *     
     */
    public LocalResponseType getLocalResponseType() {
        return localResponseType;
    }

    /**
     * Sets the value of the localResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalResponseType }
     *     
     */
    public void setLocalResponseType(LocalResponseType value) {
        this.localResponseType = value;
    }

    /**
     * Gets the value of the localResponseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LocalResponseStatus }
     *     
     */
    public LocalResponseStatus getLocalResponseStatus() {
        return localResponseStatus;
    }

    /**
     * Sets the value of the localResponseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalResponseStatus }
     *     
     */
    public void setLocalResponseStatus(LocalResponseStatus value) {
        this.localResponseStatus = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
