
package com.orange.meerkat.interfaces.managesupplierquote.requestforquotation.v1.ebsmodel.csq.in;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SupplierQuoteViewForCalculateSupplierQuoteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierQuoteViewForCalculateSupplierQuoteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="local_creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="local_callingSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="local_businessOpportunityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="local_accessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="local_refId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuoteItem" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}QuoteItem" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OperatorQuote" type="{http://www.orange.com/Meerkat/Interfaces/ManageSupplierQuote/RequestForQuotation/v1/EBSModel/CSQ/In}OperatorQuote"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierQuoteViewForCalculateSupplierQuoteRequest", propOrder = {
    "localCreationDate",
    "localCallingSystem",
    "localBusinessOpportunityType",
    "localAccessType",
    "localRefId",
    "endCustomerID",
    "endCustomerName",
    "quoteItem",
    "operatorQuote"
})
public class SupplierQuoteViewForCalculateSupplierQuoteRequest {

    @XmlElement(name = "local_creationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localCreationDate;
    @XmlElement(name = "local_callingSystem", required = true)
    protected String localCallingSystem;
    @XmlElement(name = "local_businessOpportunityType")
    protected String localBusinessOpportunityType;
    @XmlElement(name = "local_accessType")
    protected String localAccessType;
    @XmlElement(name = "local_refId", required = true)
    protected String localRefId;
    protected String endCustomerID;
    protected String endCustomerName;
    @XmlElement(name = "QuoteItem", required = true)
    protected List<QuoteItem> quoteItem;
    @XmlElement(name = "OperatorQuote", required = true)
    protected OperatorQuote operatorQuote;

    /**
     * Gets the value of the localCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalCreationDate() {
        return localCreationDate;
    }

    /**
     * Sets the value of the localCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalCreationDate(XMLGregorianCalendar value) {
        this.localCreationDate = value;
    }

    /**
     * Gets the value of the localCallingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCallingSystem() {
        return localCallingSystem;
    }

    /**
     * Sets the value of the localCallingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCallingSystem(String value) {
        this.localCallingSystem = value;
    }

    /**
     * Gets the value of the localBusinessOpportunityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBusinessOpportunityType() {
        return localBusinessOpportunityType;
    }

    /**
     * Sets the value of the localBusinessOpportunityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBusinessOpportunityType(String value) {
        this.localBusinessOpportunityType = value;
    }

    /**
     * Gets the value of the localAccessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalAccessType() {
        return localAccessType;
    }

    /**
     * Sets the value of the localAccessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalAccessType(String value) {
        this.localAccessType = value;
    }

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
     * Gets the value of the endCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCustomerID() {
        return endCustomerID;
    }

    /**
     * Sets the value of the endCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCustomerID(String value) {
        this.endCustomerID = value;
    }

    /**
     * Gets the value of the endCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCustomerName() {
        return endCustomerName;
    }

    /**
     * Sets the value of the endCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCustomerName(String value) {
        this.endCustomerName = value;
    }

    /**
     * Gets the value of the quoteItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteItem }
     * 
     * 
     */
    public List<QuoteItem> getQuoteItem() {
        if (quoteItem == null) {
            quoteItem = new ArrayList<QuoteItem>();
        }
        return this.quoteItem;
    }

    /**
     * Gets the value of the operatorQuote property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorQuote }
     *     
     */
    public OperatorQuote getOperatorQuote() {
        return operatorQuote;
    }

    /**
     * Sets the value of the operatorQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorQuote }
     *     
     */
    public void setOperatorQuote(OperatorQuote value) {
        this.operatorQuote = value;
    }

}
